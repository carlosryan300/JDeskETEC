package Aplicacao.VIEWCAD;

import Aplicacao.CadMODEL.ServicoMODEL;
import Aplicacao.DAO.ClienteDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IFrmServico extends javax.swing.JInternalFrame {

    public IFrmServico() {
        initComponents();
        PanelFisico.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        rbGrupo = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        PanelServico = new javax.swing.JPanel();
        rbFisico = new javax.swing.JRadioButton();
        rbJuridico = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        txtConsulta = new javax.swing.JTextField();
        PanelJuridico = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJuridico = new javax.swing.JTable();
        PanelFisico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFisico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Cadastro de Serviços");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(0, 51, 51));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelServico.setBackground(new java.awt.Color(0, 102, 102));
        PanelServico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelServico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbGrupo.add(rbFisico);
        rbFisico.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        rbFisico.setForeground(new java.awt.Color(255, 255, 255));
        rbFisico.setText("Fisico");
        rbFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFisicoActionPerformed(evt);
            }
        });
        PanelServico.add(rbFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        rbGrupo.add(rbJuridico);
        rbJuridico.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        rbJuridico.setForeground(new java.awt.Color(255, 255, 255));
        rbJuridico.setText("Juridico");
        rbJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuridicoActionPerformed(evt);
            }
        });
        PanelServico.add(rbJuridico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        PanelServico.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 170, 30));

        txtConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsultaKeyPressed(evt);
            }
        });
        PanelServico.add(txtConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 340, 50));

        PanelJuridico.setBackground(new java.awt.Color(0, 51, 51));
        PanelJuridico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelJuridico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelJuridicoMouseClicked(evt);
            }
        });
        PanelJuridico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblJuridico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Razão Social", "CNPJ", "Ramo", "Porte", "Telefone1", "Telefone2", "Data de Cadastro"
            }
        ));
        jScrollPane2.setViewportView(tblJuridico);

        PanelJuridico.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 820, 140));

        PanelFisico.setBackground(new java.awt.Color(0, 51, 51));
        PanelFisico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelFisico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFisico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sobrenome", "Apelido", "CPF", "Telefone", "Celular", "Data de Cadastro"
            }
        ));
        jScrollPane1.setViewportView(tblFisico);

        PanelFisico.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 820, 140));

        PanelJuridico.add(PanelFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 840, 160));

        PanelServico.add(PanelJuridico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 840, 310));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID:");
        PanelServico.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, -1, -1));

        lblCod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCod.setText(".......");
        PanelServico.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 35, -1, -1));

        PanelPrincipal.add(PanelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 860, 380));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ServicoMODEL mod = new ServicoMODEL();
        ClienteDAO cdao = new ClienteDAO();
        String campo = null;
        if (rbFisico.isSelected()) {
            campo = "clientepf";
            PanelJuridico.setVisible(false);
            PanelFisico.setVisible(true);
        } else if (rbJuridico.isSelected()) {
            campo = "clientepj";
            PanelFisico.setVisible(false);
            PanelJuridico.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        }

        List<ServicoMODEL> cadastros = cdao.CadList(campo, txtConsulta.getText());

        if (rbFisico.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tblFisico.getModel();
            model.setNumRows(0);
            for (ServicoMODEL cad : cadastros) {
                model.addRow(new Object[]{
                    cad.getID(),
                    cad.getNome(),
                    cad.getSobrenome(),
                    cad.getApelido(),
                    cad.getCPF(),
                    cad.getTelefone(),
                    cad.getCelular(),
                    cad.getDataCadastro()
                });
            }
        } else if (rbJuridico.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tblJuridico.getModel();
            model.setNumRows(0);
            for (ServicoMODEL cad : cadastros) {
                model.addRow(new Object[]{
                    cad.getID(),
                    cad.getNome(),
                    cad.getSobrenome(),
                    cad.getApelido(),
                    cad.getCPF(),
                    cad.getTelefone(),
                    cad.getCelular(),
                    cad.getDataCadastro()
                });
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void rbFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFisicoActionPerformed
        btnConsultarActionPerformed(null);
    }//GEN-LAST:event_rbFisicoActionPerformed

    private void rbJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuridicoActionPerformed
        btnConsultarActionPerformed(null);
    }//GEN-LAST:event_rbJuridicoActionPerformed

    private void txtConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyPressed
        btnConsultarActionPerformed(null);
    }//GEN-LAST:event_txtConsultaKeyPressed

    private void PanelJuridicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelJuridicoMouseClicked
       if (evt.getClickCount() == 1) {
                lblCod.setText(tblJuridico.getValueAt(tblJuridico.getSelectedRow(), 0).toString());
       }
    }//GEN-LAST:event_PanelJuridicoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFisico;
    private javax.swing.JPanel PanelJuridico;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelServico;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCod;
    private javax.swing.JRadioButton rbFisico;
    private javax.swing.ButtonGroup rbGrupo;
    private javax.swing.JRadioButton rbJuridico;
    private javax.swing.JTable tblFisico;
    private javax.swing.JTable tblJuridico;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
