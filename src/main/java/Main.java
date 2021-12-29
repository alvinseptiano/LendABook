import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Database.*;
import UI.*;

public class Main extends javax.swing.JPanel {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        DB.getDB();
        
        java.awt.EventQueue.invokeLater(() -> {
            // Initialize Flatlaf Theme 
            try {
                UIManager.setLookAndFeel( new FlatDarkLaf() );
            } catch( UnsupportedLookAndFeelException ex ) {
                System.err.println( "Failed to initialize Laf" );
            }
            
            //LoginUI login = new LoginUI();
            PinjamUI pinjam = new PinjamUI();
            //login.setVisible(true);
            pinjam.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
