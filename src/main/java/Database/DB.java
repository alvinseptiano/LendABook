package Database;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class DB {
    // Ini adalah class untuk mengatur database
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    public DefaultTableModel dtm;
    
    public static class User {
        public static void addAccount(String username, String password) throws SQLException {
            con = DriverManager.getConnection("jdbc:mysql://localhost/book_db", "root", "");
            stmt = con.createStatement();
            if (!"".equals(username) && !"".equals(password))
                if (checkUserAvailablity(username) == true)
                    try {
                        stmt.executeUpdate("INSERT INTO user_account (username, password) VALUES ("
                            + "'" + username + "',"
                            + "'" + password + "')");
                            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data");
                    } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(null, "Perintah Salah:" + e);
                    }
                else
                    JOptionPane.showMessageDialog(null, "Username sudah ada");
            else
                JOptionPane.showMessageDialog(null, "Semua field harus diisi");
        }
        
         public static void loginAccount(String username, String password) throws SQLException {
        
        }
         
        public static boolean checkUserAvailablity(String userName) throws SQLException {
            // Mengecek apakah username tersedia
            List<String> list;
            list = new ArrayList<>();

            rs = stmt.executeQuery("SELECT * FROM user_account");
            while (rs.next()) {
                list.add(rs.getString("username"));
                if (list.contains(userName)) {
                    System.out.println("Berhasil");
                    return false;
                }
            }
            return true;
        }
    }
    
    public static class Book {
        public void retrieveBook(int book_id, int qty) throws SQLException {    
            // Menaruh kembali buku ke database
            try {
                stmt.executeUpdate("UPDATE book_table SET qty =+ " + Integer.toString(qty)
                    + "WHERE book_id = " + Integer.toString(book_id) + ";");
                    JOptionPane.showMessageDialog(null, "Berhasil menyimpan data");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Perintah Salah:" + e);
            }
        }
    
        public void lendBook() {
        // Mengambil buku dari database dengan mengurangi nilai qty

        }
        
        public int getBookQty(int book_id) throws SQLException {
            // Mengembalikan jumlah buku dari database berdasarkan judul buku
            int qty;
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/book_db", "root", "");
            try (Statement statement = con.createStatement()) {
                ResultSet result = statement.executeQuery("SELECT qty FROM book_table WHERE = " + book_id);
                qty = result.getInt("qtd");
            } catch (SQLException e) { 
                // Mengembalikan nilai qty 0 jika terjadi error
                JOptionPane.showMessageDialog(null, "Perintah Salah:" + e);
                qty = 0;
            }
            return qty;
        }
        
        public boolean checkBookAvailablity(String judulBuku) throws SQLException {
            //stmt = con.createStatement();
            List<String> list;
            list = new ArrayList<>();

            rs = stmt.executeQuery("SELECT * FROM book_table");
            while (rs.next()) {
                list.add(rs.getString("judul_buku"));
                if (list.contains(judulBuku)) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static List getDB() throws SQLException {
        Array listBuku = null;
        String buku;
        int i = 0;
        List<String> list = new ArrayList<>();  

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/book_db", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM book_table");

            while (rs.next()) {
                list.add(rs.getString("judul_buku"));
                //listBuku[i] = rs.getArray(1);
                i += 1;
                //rs.getArray(1);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error");
        }
        return list;
    }
    
}
