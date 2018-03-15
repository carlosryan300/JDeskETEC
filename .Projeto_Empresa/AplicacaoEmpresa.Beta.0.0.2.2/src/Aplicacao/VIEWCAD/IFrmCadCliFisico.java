package Aplicacao.VIEWCAD;

import Aplicacao.CadMODEL.ClientePFMODEL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import Aplicacao.CadMODEL.ClientePJMODEL;
import Aplicacao.DAO.ClienteFisicoDAO;
import Aplicacao.DAO.ServicoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class IFrmCadCliFisico extends javax.swing.JInternalFrame {

    public IFrmCadCliFisico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCliente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        txtApelido = new javax.swing.JTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        cbpes = new javax.swing.JComboBox<String>();
        txtConsultar = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 51, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        setClosable(true);
        setTitle("Cadastra Cliente");
        setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PanelCliente.setBackground(new java.awt.Color(0, 51, 51));
        PanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(0), "Cadastro de Cliente", 4, 1, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 150, 50));

        btnNovo.setBackground(new java.awt.Color(0, 0, 102));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 50));

        btnEdita.setBackground(new java.awt.Color(0, 0, 0));
        btnEdita.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEdita.setForeground(new java.awt.Color(255, 255, 255));
        btnEdita.setText("Editar");
        btnEdita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdita, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 130, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicação/Imagem/arrows (1).png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 40, 40));

        btnDeletar.setBackground(new java.awt.Color(0, 0, 0));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 130, 50));

        PanelCliente.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 780, 70));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtNome.setEnabled(false);
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 200, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        lblCPF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(204, 0, 0));
        lblCPF.setText("Obrigatório...");
        lblCPF.setEnabled(false);
        jPanel2.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 90, 20));

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(204, 0, 0));
        lblNome.setText("Obrigatório...");
        lblNome.setEnabled(false);
        jPanel2.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 90, 20));

        txtCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setEnabled(false);
        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 250, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("*");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 10, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("*");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 10, 40));

        txtSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSobrenome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSobrenome.setEnabled(false);
        jPanel2.add(txtSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 240, 30));

        txtApelido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApelido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtApelido.setEnabled(false);
        jPanel2.add(txtApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 160, 30));

        txtCelular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setEnabled(false);
        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 180, 30));

        lblCelular.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(204, 0, 0));
        lblCelular.setText("Obrigatório...");
        lblCelular.setEnabled(false);
        jPanel2.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 90, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Celular");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 10, 40));

        txtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setEnabled(false);
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 160, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apelido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sobrenome");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        txtData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtData.setEnabled(false);
        txtData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 160, 30));

        cbpes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbpes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "CPF", "Email" }));
        cbpes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cbpes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cbpes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 150, 30));

        txtConsultar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtConsultar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsultarKeyPressed(evt);
            }
        });
        jPanel2.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 230, 30));

        btnConsultar.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.setPreferredSize(new java.awt.Dimension(87, 36));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 35, 110, 36));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de Cadastro");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setText("....");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 30, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Código:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        PanelCliente.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 780, 200));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Apelido", "CPF", "Celular", "Telefone", "Data de Cadastro"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 780, 240));

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Apelido", "CPF", "Celular", "Telefone", "Data de Cadastro"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 220));

        PanelCliente.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 780, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsultarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarKeyPressed
        btnConsultarActionPerformed(null);
        AtivarCampo();
    }//GEN-LAST:event_txtConsultarKeyPressed
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ClientePFMODEL cli = new ClientePFMODEL();
        ClienteFisicoDAO cdao = new ClienteFisicoDAO();
        String campo = null;
        if (cbpes.getSelectedIndex() == 0) {
            campo = "nome";
        } else if (cbpes.getSelectedIndex() == 1) {
            campo = "cpf";
        } else if (cbpes.getSelectedIndex() == 2) {
            campo = "email";
        }

        cdao.ConsFun(campo, txtConsultar.getText(), cli);
        lblCodigo.setText(String.valueOf(cli.getId_cliente_pf()));
        txtNome.setText(cli.getNome());
        txtSobrenome.setText(cli.getSobrenome());
        txtApelido.setText(cli.getApelido());
        txtCPF.setText(cli.getCPF());
        txtCelular.setText(cli.getCelular());
        txtTelefone.setText(cli.getTelefone());
        txtData.setText(cli.getDataCad());

        List<ClientePFMODEL> cadastros = cdao.getLisCliFisico(campo, txtConsultar.getText());
        DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
        model.setNumRows(0);

        for (ClientePFMODEL cad : cadastros) {
            model.addRow(new Object[]{
                cad.getNome(),
                cad.getSobrenome(),
                cad.getApelido(),
                cad.getCPF(),
                cad.getCelular(),
                cad.getTelefone(),
                cad.getDataCad()

            });
        }
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cliente Não Cadastrado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        AtivarCampo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        AtivaLabel();
        try {
            ClientePFMODEL cli = new ClientePFMODEL();

            cli.setNome(txtNome.getText());
            cli.setSobrenome(txtSobrenome.getText());
            cli.setApelido(txtApelido.getText());
            cli.setCPF(txtCPF.getText());
            cli.setCelular(txtCelular.getText());
            cli.setTelefone(txtTelefone.getText());

            ClienteFisicoDAO cdao = new ClienteFisicoDAO();
            cdao.adcionaClienteFisico(cli);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            LimparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        IFrmCadFuncionario sair = new IFrmCadFuncionario();
        sair.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        if (evt.getClickCount() == 1) {
            txtNome.setText((tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString()));
            txtSobrenome.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 1).toString());
            txtApelido.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 2).toString());
            txtCPF.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 3).toString());
            txtCelular.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 4).toString());
            txtTelefone.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 5).toString());
            txtData.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        try {
            ClientePFMODEL c = new ClientePFMODEL();
            c.setId_cliente_pf(Integer.parseInt(lblCodigo.getText()));
            c.setNome(txtNome.getText());
            c.setSobrenome(txtSobrenome.getText());
            c.setApelido(txtApelido.getText());
            c.setCPF(txtCPF.getText());
            c.setCelular(txtCelular.getText());
            c.setTelefone(txtTelefone.getText());
            c.setDataCad(txtData.getText());

            ClienteFisicoDAO fdao = new ClienteFisicoDAO();
            fdao.alterarFuncionario(c);
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
            btnConsultarActionPerformed(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try{
            ClientePFMODEL cli = new ClientePFMODEL();
            int deletar = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?");
            if (deletar == 0) {
                cli.setId_cliente_pf(Integer.parseInt(lblCodigo.getText()));

                ClienteFisicoDAO fdao = new ClienteFisicoDAO();
                fdao.removerFuncionario(cli);
                JOptionPane.showMessageDialog(null,"Removido com sucesso!");
                btnConsultarActionPerformed(null);
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Preencha todos os campos!");
            }
    }//GEN-LAST:event_btnDeletarActionPerformed

    

    private void AtivarCampo() {
        txtNome.setEditable(true);
        txtCPF.setEditable(true);
        txtCelular.setEditable(true);
        txtApelido.setEditable(true);
        txtSobrenome.setEditable(true);
        txtTelefone.setEditable(true);
        txtData.setEditable(true);
    }

    private void LimparCampos() {
        txtNome.setText("");
        txtSobrenome.setText("");
        txtApelido.setText("");
        txtCPF.setText("");
        txtCelular.setText("");
        txtTelefone.setText("");
        txtData.setText(PegarDate());
    }

    private void AtivaLabel() {
        lblCPF.setEnabled(true);
        lblCelular.setEnabled(true);
        lblNome.setEnabled(true);
    }

    private void Verifica() {
        if (txtNome.getText() == null || txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os Campos Obrigatótio", "Aviso", JOptionPane.WARNING_MESSAGE);
            AtivaLabel();
            txtNome.requestFocus();
            return;
        } else if (txtCPF.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Preencha os Campos Obrigatótio", "Aviso", JOptionPane.ERROR_MESSAGE);
            AtivaLabel();
            txtCPF.requestFocus();
            return;
        } else if (txtCelular.getText().equals("(  )     -    ")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Celular é Obrigatótio", "Aviso", JOptionPane.WARNING_MESSAGE);
            AtivaLabel();
            txtCelular.requestFocus();
            return;
        }
    }

    private String PegarDate() {

        DateFormat FormatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return FormatoData.format(date);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cbpes;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtConsultar;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
