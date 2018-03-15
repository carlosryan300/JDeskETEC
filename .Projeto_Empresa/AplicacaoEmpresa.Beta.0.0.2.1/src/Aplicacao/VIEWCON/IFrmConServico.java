
package Aplicacao.VIEWCON;

import Aplicacao.DAO.ServicoDAO;
import Aplicacao.CadMODEL.ServicoMODEL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IFrmConServico extends javax.swing.JInternalFrame {


    public IFrmConServico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrinipal = new javax.swing.JPanel();
        PanelCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApelido = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        cbModelo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox<>();
        cbCor = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbTipoProduto = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cbTipoServico = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtValorCobrado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtConsultar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        cbConsulta = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaConsulta = new javax.swing.JTable();

        setClosable(true);
        setTitle("Consulta de Serviços");

        PainelPrinipal.setBackground(new java.awt.Color(0, 51, 51));
        PainelPrinipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelPrinipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PainelPrinipal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PainelPrinipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCliente.setBackground(new java.awt.Color(0, 102, 102));
        PanelCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        PanelCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        PanelCliente.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sobrenome");
        PanelCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        txtSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSobrenome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        PanelCliente.add(txtSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 200, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apelido");
        PanelCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        txtApelido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtApelido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        PanelCliente.add(txtApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 150, 30));

        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelCliente.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 180, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF");
        PanelCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Celular");
        PanelCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        txtCelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelCliente.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 200, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone");
        PanelCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelCliente.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 30));

        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelCliente.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 190, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de Cadastro");
        PanelCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        txtPlaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        txtPlaca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PanelCliente.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 190, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Placa");
        PanelCliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 60, -1));

        cbModelo.setBackground(new java.awt.Color(46, 229, 229));
        cbModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Outros", "Caminhoneta", "Caminhão", "Conversível", "Esportivo ", "Hatch", "Minivan ", "Pick-up ", "Sedan", "Station Wagon (SW)", "Utilitário esportivo", "Van" }));
        cbModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        PanelCliente.add(cbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Modelo");
        PanelCliente.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 60, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Marca");
        PanelCliente.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 60, -1));

        cbMarca.setBackground(new java.awt.Color(46, 229, 229));
        cbMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecionar--", "Outros", "Agrale", "Aston Martin", "Audi", "Bentley", "BMW", "Changan", "Chery", "GM/Chevrolet", "Chrysler", "Citroën", "Dodge", "Effa", "Ferrari", "Fiat", "Ford", "Geely", "Hafei", "Hyundai", "Iveco", "Jac Motors", "Jaguar", "Jeep", "Jinbei", "Kia", "Lamborghini", "Land Rover", "Lexus", "Lifan", "Mahindra", "Maserati", "Mercedes-Benz", "MG Motors", "Mini", "Mitsubishi", "Nissan", "Peugeot", "Porsche", "Ram", "Renault", "Smart", "Ssangyong", "Subaru", "Suzuki", "Toyota", "Troller", "Volkswagen", "Volvo" }));
        cbMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        PanelCliente.add(cbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 160, 30));

        cbCor.setBackground(new java.awt.Color(46, 229, 229));
        cbCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Outros", "Azul", "Amarelo", "Branco", "Bege", "Cinza", "Cinza Chumbo", "Laranja", "Lilas", "Marron", "Preto", "Prata", "Roxo", "Vermelho", "Verde" }));
        cbCor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        PanelCliente.add(cbCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cor");
        PanelCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 40, -1));

        cbTipoProduto.setBackground(new java.awt.Color(46, 229, 229));
        cbTipoProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Outros" }));
        cbTipoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        PanelCliente.add(cbTipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 160, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tipo de Produto");
        PanelCliente.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        cbTipoServico.setBackground(new java.awt.Color(46, 229, 229));
        cbTipoServico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Outros" }));
        cbTipoServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        PanelCliente.add(cbTipoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 160, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tipo de Serviço");
        PanelCliente.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 110, -1));

        txtValorCobrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValorCobrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        PanelCliente.add(txtValorCobrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 120, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Valor do Serviço");
        PanelCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 120, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelCliente.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 80, -1));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Excluir");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelCliente.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 57, 80, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PanelCliente.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 100, 80, 25));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 240, 30));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Consultar");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 90, 30));

        cbConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Sobrenome", "Celular", "Telefone", "Data", "Valor do Serviço" }));
        jPanel1.add(cbConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        PanelCliente.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 480, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cod:");
        PanelCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 40, -1));

        lblCod.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCod.setForeground(new java.awt.Color(153, 0, 0));
        lblCod.setText(".....");
        PanelCliente.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 30, -1));

        PainelPrinipal.add(PanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1180, 200));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "CPF", "Celular", "Telefone", "Placa", "Modelo", "Marca", "Cor", "Tipo de Produto", "Tipo de Produto", "Valor do Serviço ", "Data de Cadastro"
            }
        ));
        jScrollPane1.setViewportView(TabelaConsulta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1160, 310));

        PainelPrinipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1180, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrinipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1202, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrinipal, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ServicoMODEL s = new ServicoMODEL();
        s.setID(Integer.parseInt(lblCod.getText()));
        s.setMarca(cbMarca.getSelectedItem().toString());
        s.setModelo(cbModelo.getSelectedItem().toString());
        s.setCor(cbCor.getSelectedItem().toString());
        s.setPlaca(txtPlaca.getText());
        s.setTipoServico(cbTipoServico.getSelectedItem().toString());
        s.setValorCobrado(txtValorCobrado.getText());
        s.setDataCadastro(txtData.getText());
        
        ServicoDAO sdao = new ServicoDAO();
        sdao.alterar(s);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso");
        jButton4ActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          habilitarCampos();
        
        ServicoDAO sdao = new ServicoDAO();
        ServicoMODEL smodel = new ServicoMODEL();

        String campo = null;
        if (cbConsulta.getSelectedIndex() == 0) {
            campo = "nome";
        } else if (cbConsulta.getSelectedIndex() == 1) {
            campo = "sobrenome";
        } else if (cbConsulta.getSelectedIndex() == 2) {
            campo = "celular";
        } else if (cbConsulta.getSelectedIndex() == 3) {
            campo = "telefone1";
        } else if (cbConsulta.getSelectedIndex() == 4) {
            campo = "data_servico";
        } else if (cbConsulta.getSelectedIndex() == 4) {
            campo = "valorServiço";
        }

        sdao.Consultar(campo, txtConsultar.getText(), smodel);

        lblCod.setText(String.valueOf(smodel.getID()));
        txtNome.setText(smodel.getNome());
        txtSobrenome.setText(smodel.getSobrenome());
        txtCPF.setText(smodel.getCPF());
        txtApelido.setText(smodel.getApelido());
        txtTelefone.setText(smodel.getTelefone());
        txtCelular.setText(smodel.getCelular());
        txtData.setText(smodel.getDataCadastro());
        txtPlaca.setText(smodel.getPlaca());
        cbModelo.setSelectedItem(smodel.getModelo());
        cbMarca.setSelectedItem(smodel.getMarca());
        cbCor.setSelectedItem(smodel.getCor());
        cbTipoServico.setSelectedItem(smodel.getTipoServico());
        txtValorCobrado.setText(smodel.getValorCobrado());

        List<ServicoMODEL> s = sdao.getLista(campo, txtConsultar.getText());
        DefaultTableModel model = (DefaultTableModel) TabelaConsulta.getModel();
        model.setNumRows(0);
        for (ServicoMODEL sm : s) {
            model.addRow(new Object[]{
                sm.getID(),
                sm.getNome(),
                sm.getSobrenome(),
                sm.getApelido(),
                sm.getCPF(),
                sm.getCelular(),
                sm.getTelefone(),
                sm.getPlaca(),
                sm.getMarca(),
                sm.getModelo(),
                sm.getCor(),             
                sm.getTipoServico(),
                sm.getValorCobrado(),
                sm.getDataCadastro()
            });
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ServicoMODEL s = new ServicoMODEL();
        int remover = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro da empresa?");
        if (remover == 0) {
            s.setID(Integer.parseInt(lblCod.getText()));
            ServicoDAO sdao = new ServicoDAO();
            sdao.remover(s);
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso");
            jButton4ActionPerformed(evt);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void LimparCampos() {
        txtNome.setText("");
        txtSobrenome.setText("");
        txtApelido.setText("");
        txtCPF.setText("");
        txtCelular.setText("");
        txtTelefone.setText("");
        txtData.setText("");
    }
    private void habilitarCampos(){
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtApelido.setEnabled(true);
        txtCPF.setEnabled(true);
        txtCelular.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtData.setEnabled(true);
    }
    private void desabilitarCampos(){
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtApelido.setEnabled(false);
        txtCPF.setEnabled(false);
        txtCelular.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtData.setEnabled(false);
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrinipal;
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JTable TabelaConsulta;
    private javax.swing.JComboBox<String> cbConsulta;
    private javax.swing.JComboBox<String> cbCor;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JComboBox<String> cbTipoProduto;
    private javax.swing.JComboBox<String> cbTipoServico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtConsultar;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtValorCobrado;
    // End of variables declaration//GEN-END:variables
}
