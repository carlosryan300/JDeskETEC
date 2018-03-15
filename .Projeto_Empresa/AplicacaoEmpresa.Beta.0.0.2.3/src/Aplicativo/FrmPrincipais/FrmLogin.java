package Aplicativo.FrmPrincipais;

import java.awt.Color;
import Aplicacao.CadMODEL.CadLogMODEL;
import Aplicacao.DAO.LoginDAO;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;


public class FrmLogin extends javax.swing.JFrame {

    
    public FrmLogin() {
        initComponents();
        lblAce.setVisible(false);
        lblnega.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        lblAce = new javax.swing.JLabel();
        lblnega = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLogin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtLogin.setToolTipText("Digite seu Usuário");
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 250, 30));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtSenha.setToolTipText("Digite Sua Senha");
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 250, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        btnEntrar.setBackground(new java.awt.Color(0, 102, 102));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 110, 40));

        btnCancelar.setBackground(new java.awt.Color(0, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 110, 40));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicação/Imagem/avatar.png"))); // NOI18N
        lblImagem.setToolTipText("");
        lblImagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        jPanel1.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 134, 140));

        lblAce.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAce.setForeground(new java.awt.Color(255, 0, 0));
        lblAce.setText("Acesso");
        lblAce.setEnabled(false);
        jPanel1.add(lblAce, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));
        lblAce.getAccessibleContext().setAccessibleParent(lblImagem);

        lblnega.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblnega.setForeground(new java.awt.Color(255, 0, 0));
        lblnega.setText("Negado");
        lblnega.setEnabled(false);
        jPanel1.add(lblnega, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Acessar Sistema");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 339));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
      
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
     if(txtLogin.getText().trim().equals("") || txtSenha.getText().trim().equals("")){
       JOptionPane.showMessageDialog(null,"Usuário ou Senha Invalida");
       lblAce.setEnabled(true);
       lblnega.setEnabled(true);
       lblImagem.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
       if(txtLogin.getText().trim().equals("")){
          txtLogin.requestFocus(true);
          txtLogin.setBorder(BorderFactory.createLineBorder(Color.cyan,3));
       }else if(txtSenha.getText().trim().equals("")){
          txtSenha.requestFocus(true);
          txtSenha.setBorder(BorderFactory.createLineBorder(Color.cyan,3));
       }
     } else{
       CadLogMODEL select = new CadLogMODEL();
       select.setLogin(txtLogin.getText());
       select.setSenha(txtSenha.getText());
       LoginDAO cdao = new LoginDAO();
       cdao.ConsultarLogin(select);
     }
    }//GEN-LAST:event_btnEntrarActionPerformed
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     
      System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
                 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (!"Nimbus".equals(info.getName())) {
                } else {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAce;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblnega;
    public static javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
