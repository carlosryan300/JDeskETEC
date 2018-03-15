package Aplicacao.VIEWCON;

import Aplicacao.ConMODEL.ConClienteMODEL;
import Aplicacao.DAO.ClienteDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class IFrmConCliente extends javax.swing.JInternalFrame {

    public IFrmConCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        dataCad = new javax.swing.JLabel();
        txtDatacad = new javax.swing.JFormattedTextField();
        lbl2 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtRazao = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        txtTel2 = new javax.swing.JFormattedTextField();
        txtTel1 = new javax.swing.JFormattedTextField();
        lbl6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        txtApelido = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtConsulta = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        rbFisico = new javax.swing.JRadioButton();
        rbJuridico = new javax.swing.JRadioButton();
        PanelFisico = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFisico = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setTitle("Consulta de Clientes");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataCad.setBackground(new java.awt.Color(255, 255, 255));
        dataCad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dataCad.setForeground(new java.awt.Color(255, 255, 255));
        dataCad.setText("Data de Cadastro");
        jPanel1.add(dataCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, 20));

        txtDatacad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtDatacad.setEnabled(false);
        jPanel1.add(txtDatacad, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 180, 28));

        lbl2.setBackground(new java.awt.Color(255, 255, 255));
        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("CNPJ");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        txtCNPJ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        jPanel1.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 200, 28));

        txtRazao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 450, 28));

        lbl1.setBackground(new java.awt.Color(255, 255, 255));
        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("Razão Social");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        lbl4.setBackground(new java.awt.Color(255, 255, 255));
        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("Ramo");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lbl5.setBackground(new java.awt.Color(255, 255, 255));
        lbl5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setText("Porte");
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        lbl7.setBackground(new java.awt.Color(255, 255, 255));
        lbl7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        lbl7.setText("Telefone Secundário");
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        txtTel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(txtTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 160, 28));

        txtTel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(txtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 160, 28));

        lbl6.setBackground(new java.awt.Color(255, 255, 255));
        lbl6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        lbl6.setText("Telefone Principal");
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cod:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblID.setForeground(new java.awt.Color(153, 0, 0));
        lblID.setText("......");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 8, -1, -1));

        btnCadastrar.setBackground(new java.awt.Color(13, 17, 30));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Editar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 110, 30));

        btnCancela.setBackground(new java.awt.Color(102, 0, 0));
        btnCancela.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancela.setForeground(new java.awt.Color(255, 255, 255));
        btnCancela.setText("Excluir");
        btnCancela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, 110, 30));

        txtApelido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 28));

        txtCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 230, 28));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1050, 150));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConsulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsultaKeyPressed(evt);
            }
        });
        jPanel3.add(txtConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 550, 50));

        btnConsultar.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/searching-for-a-businessman.png"))); // NOI18N
        btnConsultar.setText("Consulta");
        btnConsultar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 120, 40));

        buttonGroup1.add(rbFisico);
        rbFisico.setText("Cliente Fisico");
        rbFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFisicoActionPerformed(evt);
            }
        });
        jPanel3.add(rbFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 15, 100, -1));

        buttonGroup1.add(rbJuridico);
        rbJuridico.setText("Cliente Juridico");
        rbJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuridicoActionPerformed(evt);
            }
        });
        jPanel3.add(rbJuridico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 100, -1));

        PanelFisico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelFisico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFisico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sobrenome", "Apelido", "CPF", "Telefone", "Celular", "Data de Cadastro"
            }
        ));
        tblFisico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFisicoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFisico);

        PanelFisico.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1010, 200));

        jPanel3.add(PanelFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1030, 220));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1050, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cliente = "";
        if (rbFisico.isSelected()) {
            MudaLB();
            txtConsulta.setEnabled(true);
            cliente = "clientepf";
        } else if (rbJuridico.isSelected()) {
            MudaLB();
            txtConsulta.setEnabled(true);
            cliente = "clientepj";
        } else {
            txtConsulta.setText("");
            JOptionPane.showMessageDialog(null, "Selecione qual Tipo de cliente");
        }
        /*Lista Nos Campos*/
        ConClienteMODEL con = new ConClienteMODEL();
        ClienteDAO recebe = new ClienteDAO();
        recebe.Consulta(cliente, txtConsulta.getText(), con);
        lblID.setText("" + con.getID());
        txtRazao.setText(con.getRazaoSocial());
        txtCNPJ.setText(con.getCNPJ());
        txtApelido.setText(con.getRamo());
        txtCPF.setText(con.getPorte());
        txtTel1.setText(con.getTelPrin());
        txtTel2.setText(con.getTelSec());
        txtDatacad.setText(con.getDataCad());
        /*Lista Nos Campos*/

 /*Listar Na Tabela*/
        List<ConClienteMODEL> funcionarios = recebe.getLista(cliente, txtConsulta.getText());
        DefaultTableModel m = (DefaultTableModel) tblFisico.getModel();
        m.setNumRows(0);
        for (ConClienteMODEL list : funcionarios) {
            m.addRow(new Object[]{
                list.getID(),
                list.getRazaoSocial(),
                list.getCNPJ(),
                list.getRamo(),
                list.getPorte(),
                list.getTelPrin(),
                list.getTelSec(),
                list.getDataCad()
            });
        }
        /*Listar Na Tabela*/
    }//GEN-LAST:event_btnConsultarActionPerformed
    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ConClienteMODEL c = new ConClienteMODEL();
        ClienteDAO cdao = new ClienteDAO();
        String cliente = "";
        try{
        if (rbFisico.isSelected()) {
            MudaLB();
            txtConsulta.setEnabled(true);
            cliente = "clientepf";
        } else if (rbJuridico.isSelected()) {
            MudaLB();
            txtConsulta.setEnabled(true);
            cliente = "clientepj";
        } else {
            txtConsulta.setText("");
            JOptionPane.showMessageDialog(null, "Selecione qual Tipo de cliente");
        }       
        c.setID(Integer.valueOf(lblID.getText()));
        c.setRazaoSocial(txtRazao.getText());
        c.setCNPJ(txtCNPJ.getText());
        c.setRamo(txtApelido.getText());
        c.setPorte(txtCPF.getText());
        c.setTelPrin(txtTel1.getText());
        c.setTelSec(txtTel2.getText());   
        c.setDataCad(txtDatacad.getText());
        cdao.Alterar(cliente,c);
        JOptionPane.showMessageDialog(null, "Cadastro de cliente Alterado com sucesso");
        }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro"+e);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed
    private void txtConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyPressed
        btnConsultarActionPerformed(null);
    }//GEN-LAST:event_txtConsultaKeyPressed

    private void rbFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFisicoActionPerformed
        btnConsultarActionPerformed(null);
    }//GEN-LAST:event_rbFisicoActionPerformed

    private void rbJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuridicoActionPerformed
        btnConsultarActionPerformed(null);
    }//GEN-LAST:event_rbJuridicoActionPerformed

    private void tblFisicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFisicoMouseClicked
        if (evt.getClickCount() == 1) {
            if (rbFisico.isSelected()) {
                lblID.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 0).toString());
                txtRazao.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 1).toString());
                txtCNPJ.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 2).toString());
                txtApelido.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 3).toString());
                txtCPF.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 4).toString());
                txtTel1.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 5).toString());
                txtTel2.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 6).toString());
                txtDatacad.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 7).toString());
            } else if (rbJuridico.isSelected()) {
                lblID.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 0).toString());
                txtRazao.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 1).toString());
                txtCNPJ.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 2).toString());
                txtApelido.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 3).toString());
                txtCPF.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 4).toString());
                txtTel1.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 5).toString());
                txtTel2.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 6).toString());
                txtDatacad.setText(tblFisico.getValueAt(tblFisico.getSelectedRow(), 7).toString());
            }
        }
    }//GEN-LAST:event_tblFisicoMouseClicked
    private String PegarDate() {
        DateFormat FormatoData = new SimpleDateFormat("EE, dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return FormatoData.format(date);
    }

    private void MudaLB() {
        if (rbFisico.isSelected()) {
            lbl1.setText("Nome");
            lbl2.setText("Sobrenome");
            lbl4.setText("Apelido");
            lbl5.setText("CPF");
            lbl6.setText("Celular");
            lbl7.setText("Telefone");
        } else if (rbJuridico.isSelected()) {
            lbl1.setText("Razão Social");
            lbl2.setText("CNPJ");
            lbl4.setText("Ramo");
            lbl5.setText("Porte");
            lbl6.setText("Telefone Principal");
            lbl7.setText("Telefone Secundaria");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFisico;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnConsultar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel dataCad;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lblID;
    private javax.swing.JRadioButton rbFisico;
    private javax.swing.JRadioButton rbJuridico;
    private javax.swing.JTable tblFisico;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtCPF;
    public static javax.swing.JTextField txtConsulta;
    private javax.swing.JFormattedTextField txtDatacad;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JFormattedTextField txtTel1;
    private javax.swing.JFormattedTextField txtTel2;
    // End of variables declaration//GEN-END:variables
}
