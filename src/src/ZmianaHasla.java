import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ZmianaHasla extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;

    

    public ZmianaHasla() {
        initComponents();
         con= Polaczenie.ConnectDB();
        setLocationRelativeTo(null);
        
        txtLogin.setText(Login.login);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnChangePassword = new javax.swing.JButton();
        txtStareHaslo = new javax.swing.JPasswordField();
        txtNoweHaslo = new javax.swing.JPasswordField();
        txtPotwierdzNoweHaslo = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zmiana hasła");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Stare hasło");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nowe hasło");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Potwierdz nowe hasło");

        txtLogin.setEditable(false);

        btnChangePassword.setBackground(new java.awt.Color(204, 204, 204));
        btnChangePassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChangePassword.setText("Zmień hasło");
        btnChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangePasswordMouseClicked(evt);
            }
        });
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        txtPotwierdzNoweHaslo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPotwierdzNoweHasloKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStareHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoweHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPotwierdzNoweHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnChangePassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStareHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoweHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPotwierdzNoweHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtLogin, txtNoweHaslo, txtPotwierdzNoweHaslo, txtStareHaslo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePasswordMouseClicked
       
    }//GEN-LAST:event_btnChangePasswordMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        try{
         String Newpass=String.valueOf(txtNoweHaslo.getPassword());
         String ConfPass=String.valueOf(txtPotwierdzNoweHaslo.getPassword());
        String OldPass=String.valueOf(txtStareHaslo.getPassword());
        String uName=txtLogin.getText();
        if (uName.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Podaj login",
                                          "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (OldPass.equals("")) {
            
                JOptionPane.showMessageDialog( this, "Podaj stare hasło",
                                          "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (Newpass.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Podaj nowe hasło",
                                          "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
                
            } else if (ConfPass.equals("")) {
               
                JOptionPane.showMessageDialog( this, "Potwierdz nowe hasło",
                                          "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
            } 
               else if (Newpass.length()< 5) {
               
                JOptionPane.showMessageDialog(this,
                                         "Hasło musi mieć przynajmniej 5 znaków",
                                         "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
               }
            
           
            
            else if ((Newpass).equals(OldPass)) {
                
               JOptionPane.showMessageDialog(this,
                                         "Hasło jest takie same jak stare","Błąd !", JOptionPane.ERROR_MESSAGE);
               return;
            }
    else if (!(Newpass).equals(ConfPass)) {
               
                JOptionPane.showMessageDialog(this,
                                         "Nowe hasło nie zgadza się z potwierdzonym",
                                         "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
            }
       
       
      con=Polaczenie.ConnectDB();
      String sql= "select LOGIN,HASLO from SZPITAL_DB.LOGOWANIE where LOGIN='" + txtLogin + "' and HASLO= '" + txtStareHaslo.getText() + "'";
      pst=con.prepareStatement(sql);
      rs= pst.executeQuery();
      while(rs.next())
        {
            String usrname = rs.getString("login").trim();
            String passwd = rs.getString("haslo").trim();
            if(uName.equals(usrname) && OldPass.equals(passwd))
            {
                con=Polaczenie.ConnectDB();
                 String sql1= "update SZPITAL_DB.LOGOWANIE set HASLO= '" + txtNoweHaslo + "' where LOGIN= '" + txtLogin + "'";
                 Statement stmt = con.createStatement();
                 stmt.execute(sql1.toString());
                 stmt.close();
                 JOptionPane.showMessageDialog(this,"Hasło zostało zmienione");
                 this.dispose();
                 return;
              }
            else
            {
             JOptionPane.showMessageDialog(this,"Błędny login lub hasło","Błąd !", JOptionPane.ERROR_MESSAGE);   
             txtLogin.setText("");
             txtStareHaslo.setText("");
             txtNoweHaslo.setText("");
             txtPotwierdzNoweHaslo.setText("");
             return;
            }
        }  
        }catch(SQLException | HeadlessException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void txtPotwierdzNoweHasloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPotwierdzNoweHasloKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
              try{
         String Newpass=String.valueOf(txtNoweHaslo.getPassword());
         String ConfPass=String.valueOf(txtPotwierdzNoweHaslo.getPassword());
        String OldPass=String.valueOf(txtStareHaslo.getPassword());
        String uName=txtLogin.getText();
        if (uName.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Podaj login",
                                          "Bląd !", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (OldPass.equals("")) {
            
                JOptionPane.showMessageDialog( this, "Podaj stare hasło",
                                          "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (Newpass.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Podaj nowe hasło",
                                          "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
                
            } else if (ConfPass.equals("")) {
               
                JOptionPane.showMessageDialog( this, "Potwierdz hasło",
                                          "Błąd", JOptionPane.ERROR_MESSAGE);
                return;
            } 
               else if (Newpass.length()< 5) {
               
                JOptionPane.showMessageDialog(this,
                                         "Hasło musi mieć przynajmniej 5 znaków ",
                                         "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
               }
            
           
            
            else if ((Newpass).equals(OldPass)) {
                
               JOptionPane.showMessageDialog(this,
                                         "Hasło jest takie samo jak stare","Błąd !", JOptionPane.ERROR_MESSAGE);
               return;
            }
    else if (!(Newpass).equals(ConfPass)) {
               
                JOptionPane.showMessageDialog(this,
                                         "Hasła nie zgadzają się",
                                         "Błąd !", JOptionPane.ERROR_MESSAGE);
                return;
            }
       
      con=Polaczenie.ConnectDB();
      String sql= "select LOGIN,HASLO from SZPITAL_DB.LOGOWANIE where LOGIN='" + txtLogin + "' and HASLO= '" + txtStareHaslo.getText() + "'";
      pst=con.prepareStatement(sql);
      rs= pst.executeQuery();
      while(rs.next())
        {
            String usrname = rs.getString("login").trim();
            String passwd = rs.getString("haslo").trim();
            if(uName.equals(usrname) && OldPass.equals(passwd))
            {
                con=Polaczenie.ConnectDB();
                 String sql1= "update SZPITAL_DB.LOGOWANIE set LOGIN= '" + Newpass + "' where LOGIN= '" + uName + "' and HASLO = '" + OldPass + "'";
                 Statement stmt = con.createStatement();
                 stmt.execute(sql1.toString());
                 stmt.close();
                 JOptionPane.showMessageDialog(this,"Hasło zostało zmienione !");
                 this.dispose();
                 return;
              }
            else
            {
             JOptionPane.showMessageDialog(this,"Błędny login lub hasło","Błąd !", JOptionPane.ERROR_MESSAGE);   
             txtLogin.setText("");
             txtStareHaslo.setText("");
             txtNoweHaslo.setText("");
             txtPotwierdzNoweHaslo.setText("");
             return;
            }
        }    
        }catch(SQLException | HeadlessException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
            
        }
    }//GEN-LAST:event_txtPotwierdzNoweHasloKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZmianaHasla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ZmianaHasla().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtNoweHaslo;
    private javax.swing.JPasswordField txtPotwierdzNoweHaslo;
    private javax.swing.JPasswordField txtStareHaslo;
    // End of variables declaration//GEN-END:variables
}
