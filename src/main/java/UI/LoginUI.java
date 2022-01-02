package UI;

import Database.*;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginUI extends javax.swing.JFrame {

    public static Component borrowUI;
    public static Component editUI;
    
    public LoginUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        passwdInput = new javax.swing.JPasswordField();
        exitBtn = new javax.swing.JButton();
        pswdLabel = new javax.swing.JLabel();
        usrnameLabel = new javax.swing.JLabel();
        usrnameInput = new javax.swing.JTextField();
        roleComboBox = new javax.swing.JComboBox<>();
        loginBtn = new javax.swing.JButton();
        createAcc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel2.setText("Login Debug");

        exitBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        exitBtn.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        pswdLabel.setText("Password");

        usrnameLabel.setText("Username");

        usrnameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrnameInputActionPerformed(evt);
            }
        });

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        createAcc.setText("Create Account");
        createAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccActionPerformed(evt);
            }
        });

        jLabel1.setText("Role");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(usrnameLabel)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pswdLabel)
                                .addComponent(exitBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usrnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(loginBtn)
                                            .addGap(18, 18, 18)
                                            .addComponent(createAcc))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usrnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usrnameLabel))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pswdLabel)
                            .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createAcc)
                            .addComponent(loginBtn)
                            .addComponent(exitBtn))))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void usrnameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrnameInputActionPerformed

    }//GEN-LAST:event_usrnameInputActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String role = String.valueOf(roleComboBox.getSelectedItem());
        System.out.println(role);
        try {
            if (DB.User.loginAccount(usrnameInput.getText(), passwdInput.getText(), role))
                if (!"".equals(usrnameInput.getText()) && !"".equals(passwdInput.getText())) {
                    if ("admin".equals(role)) {
                        editUI.setVisible(true);
                        //editUI.refresh
                    }
                    else if ("user".equals(role))
                        borrowUI.setVisible(true);
                    setVisible(false);
                } else
                    JOptionPane.showMessageDialog(null, "Semua field harus diisi");
        } catch (SQLException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void createAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccActionPerformed
        String role = String.valueOf(roleComboBox.getSelectedItem());
        try {
            DB.User.addAccount(usrnameInput.getText(), passwdInput.getText(), role);
        } catch (SQLException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createAccActionPerformed

    public static void setBorrowWindow(Component frame) {
        borrowUI = frame;
    }
    
    public static void setEditWindow(Component frame) {
        editUI = frame;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAcc;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwdInput;
    private javax.swing.JLabel pswdLabel;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JTextField usrnameInput;
    private javax.swing.JLabel usrnameLabel;
    // End of variables declaration//GEN-END:variables
}
