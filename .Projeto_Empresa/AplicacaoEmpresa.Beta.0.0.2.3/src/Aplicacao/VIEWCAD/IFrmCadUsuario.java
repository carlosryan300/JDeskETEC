
package Aplicacao.VIEWCAD;

import Aplicativo.FrmPrincipais.FrmMenu;
import Aplicacao.DAO.LoginDAO;
import Aplicacao.CadMODEL.CadLogMODEL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Aplicacao.VIEWCAD.IfrmCadRestAc;

public class IFrmCadUsuario extends javax.swing.JInternalFrame {

    public IFrmCadUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        cbpes = new javax.swing.JComboBox<String>();
        txtConsultar = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        btnAtivo = new javax.swing.JRadioButton();
        btnDesativado = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        CPF = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRepetirSenha = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAcesso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(103, 113, 169));
        setClosable(true);
        setTitle("Cadastra Usuário do Sistema");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        lblCod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCod.setForeground(new java.awt.Color(255, 0, 0));
        lblCod.setText("....");
        jPanel2.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        cbpes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbpes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "CPF", "Email" }));
        cbpes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        cbpes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cbpes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, 30));

        txtConsultar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        txtConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsultarKeyPressed(evt);
            }
        });
        jPanel2.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 190, 30));

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 90, -1));

        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(btnAtivo);
        btnAtivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtivo.setText("Ativo");
        btnAtivo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        btnAtivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel.add(btnAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        buttonGroup1.add(btnDesativado);
        btnDesativado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDesativado.setText("Desativado");
        btnDesativado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        btnDesativado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel.add(btnDesativado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel2.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 180, 40));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 360, -1));

        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 200, -1));

        CPF.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        CPF.setForeground(new java.awt.Color(255, 255, 255));
        CPF.setText("CPF");
        jPanel2.add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        Login.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        jPanel2.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        txtLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 210, -1));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar Senha");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        txtRepetirSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRepetirSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        txtRepetirSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtRepetirSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 160, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 420, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));
        txtData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 150, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data de Cadastro");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        tblCliente.setBackground(new java.awt.Color(0, 51, 51));
        tblCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblCliente.setForeground(new java.awt.Color(255, 255, 255));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Login", "Email", "Data"
            }
        ));
        tblCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 830, 130));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true), "Selecione o Tipo de Acesso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcesso.setBackground(new java.awt.Color(204, 102, 0));
        btnAcesso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAcesso.setText("Opções");
        btnAcesso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 2, true));
        btnAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessoActionPerformed(evt);
            }
        });
        jPanel4.add(btnAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 200, 150));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 440));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Status");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNovo.setBackground(new java.awt.Color(0, 0, 102));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");
        btnNovo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 40));

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITA");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 120, 40));

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 880, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtCPF.setEnabled(true);
        AtivarCampo();
        LimparCampos();
        btnEditar.setEnabled(false);
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadLogMODEL NovoCad = new CadLogMODEL();
        try {
            if (btnAtivo.isSelected()) {
                NovoCad.setStatus("A");
            } else if (btnDesativado.isSelected()) {
                NovoCad.setStatus("D");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione Uma Opção de Status");
            }
            NovoCad.setNome(txtNome.getText());
            NovoCad.setCpf(txtCPF.getText());
            NovoCad.setLogin(txtLogin.getText());
            NovoCad.setSenha(txtSenha.getText());
            NovoCad.setEmail(txtEmail.getText());
            NovoCad.setDataCadastro(txtData.getText());
        } catch (Exception e) {
        }
        LoginDAO CadDAO = new LoginDAO();
        CadDAO.adciona(NovoCad);
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso");
        btnConsultarActionPerformed(null);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        AtivarCampo();
        txtCPF.setEnabled(false);
        txtData.setEnabled(false);
        btnCadastrar.setEnabled(false);
        LoginDAO cdao = new LoginDAO();
        CadLogMODEL c = new CadLogMODEL();
        String campo = null;
        if (cbpes.getSelectedIndex() == 0) {
            campo = "nome";
        } else if (cbpes.getSelectedIndex() == 1) {
            campo = "cpf";
        } else if (cbpes.getSelectedIndex() == 2) {
            campo = "email";
        }
        cdao.Consultar(campo, txtConsultar.getText(), c);
        lblCod.setText(String.valueOf(c.getId_Login()));
        txtNome.setText(c.getNome());
        txtCPF.setText(c.getCpf());
        txtLogin.setText(c.getLogin());
        txtSenha.setText(c.getSenha());
        txtEmail.setText(c.getEmail());
        txtData.setText(c.getDataCadastro());
        if (c.getStatus().equals("A")) {
            btnAtivo.isSelected();
        } else if (c.getStatus().equals("D")) {
            btnAtivo.isSelected();
        }
        List<CadLogMODEL> cadastros = cdao.getLista(campo, txtConsultar.getText());
        DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
        model.setNumRows(0);
        for (CadLogMODEL cad : cadastros) {
            model.addRow(new Object[]{
                cad.getId_Login(),
                cad.getNome(),
                cad.getCpf(),
                cad.getLogin(),
                cad.getEmail(),
                cad.getDataCadastro()
            });
        }if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cliente Não Cadastrado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        CadLogMODEL edita = new CadLogMODEL();
        if (btnAtivo.isSelected()) {
            edita.setStatus("A");
        } else if (btnDesativado.isSelected()) {
            edita.setStatus("D");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione Uma Opção de Status");
        }
        edita.setId_Login(Integer.valueOf(lblCod.getText()));
        edita.setNome(txtNome.getText());
        edita.setLogin(txtLogin.getText());
        edita.setSenha(txtSenha.getText());
        edita.setEmail(txtEmail.getText());
        edita.setDataCadastro(txtData.getText());
        LoginDAO alter = new LoginDAO();
        alter.alterar(edita);
        JOptionPane.showMessageDialog(null, "Cliente Alterado com Sucesso");
        btnConsultarActionPerformed(null);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtConsultarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarKeyPressed
        btnConsultarActionPerformed(null);
        AtivarCampo();
    }//GEN-LAST:event_txtConsultarKeyPressed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        if (evt.getClickCount() == 1) {
            lblCod.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString());
            txtNome.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 1).toString());
            txtCPF.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 2).toString());
            txtLogin.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 3).toString());
            txtEmail.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 4).toString());
            txtData.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 5).toString());
            txtCPF.setEnabled(false);
            btnEditar.setEnabled(true);
            btnCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessoActionPerformed
        IfrmCadRestAc i = new IfrmCadRestAc();
        FrmMenu.Desktop.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_btnAcessoActionPerformed

    //Metodos
    private void LimparCampos() {
        txtNome.setText("");
        txtLogin.setText("");
        txtSenha.setText("");
        txtRepetirSenha.setText("");
        txtEmail.setText("");
        txtData.setText(PegarDateTime());
        txtCPF.setText("");
        txtData.setEnabled(false);
    }

    private void AtivarCampo() {
        txtNome.setEditable(true);
        txtCPF.setEditable(true);
        txtLogin.setEditable(true);
        txtSenha.setEditable(true);
        txtRepetirSenha.setEditable(true);
        txtEmail.setEditable(true);
        btnAtivo.setEnabled(true);
        btnDesativado.setEnabled(true);
    }

    private void DesativarCampo() {
        txtNome.setEditable(false);
        txtCPF.setEditable(false);
        txtLogin.setEditable(false);
        txtSenha.setEditable(false);
        txtRepetirSenha.setEditable(false);
        txtEmail.setEditable(false);
        txtData.setEditable(false);
        btnAtivo.setEnabled(false);
        btnDesativado.setEnabled(false);
    }

    private String PegarDateTime() {
        DateFormat FormatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.US);
        Date date = new Date();
        return FormatoData.format(date);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Login;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnAcesso;
    private javax.swing.JRadioButton btnAtivo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JRadioButton btnDesativado;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbpes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JTable tblCliente;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtConsultar;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    public javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtRepetirSenha;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
