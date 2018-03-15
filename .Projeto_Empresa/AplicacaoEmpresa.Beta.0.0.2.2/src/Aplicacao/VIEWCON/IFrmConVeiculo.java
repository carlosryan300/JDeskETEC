
package Aplicacao.VIEWCON;

import Aplicacao.CadMODEL.CadLogMODEL;
import Aplicacao.DAO.VeiculoEmpDAO;
import Aplicacao.CadMODEL.CadVeiEmpMODEL;
import Aplicacao.ConMODEL.RelConVeiMODEL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class IFrmConVeiculo extends javax.swing.JInternalFrame {

 
    public IFrmConVeiculo() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPlaca = new javax.swing.JFormattedTextField();
        txtChassi = new javax.swing.JFormattedTextField();
        cbCategoriaVeiculo = new javax.swing.JComboBox<>();
        cbModelo = new javax.swing.JComboBox<>();
        cbMarca = new javax.swing.JComboBox<>();
        cbCategoriaHabilitação = new javax.swing.JComboBox<>();
        cbCor = new javax.swing.JComboBox<>();
        txtDataVei = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JFormattedTextField();
        txtDataCad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnCad = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadastro = new javax.swing.JTable();
        cbpes = new javax.swing.JComboBox<>();
        txtConsulta = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPlaca.setEnabled(false);
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, 30));

        try {
            txtChassi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#AA . AAA### . AA . ###### ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtChassi.setEnabled(false);
        jPanel1.add(txtChassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 240, 30));

        cbCategoriaVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D", "A", "B", "C", "D", "E", "AB", "AC", "AD", "AE", "ACC" }));
        cbCategoriaVeiculo.setEnabled(false);
        jPanel1.add(cbCategoriaVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 130, 30));

        cbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caminhão", "Outros", "Caminhoneta", "Conversível", "Esportivo ", "Hatch", "Minivan ", "Pick-up ", "Sedan", "Station Wagon (SW)", "Utilitário esportivo", "Van" }));
        cbModelo.setEnabled(false);
        jPanel1.add(cbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 220, 30));

        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercedes-Bens", "Outros", "Agrale", "Aston Martin", "Audi", "Bentley", "BMW", "Changan", "Chery", "GM/Chevrolet", "Chrysler", "Citroën", "Dodge", "Effa", "Ferrari", "Fiat", "Ford", "Geely", "Hafei", "Hyundai", "Iveco", "Jac Motors", "Jaguar", "Jeep", "Jinbei", "Kia", "Lamborghini", "Land Rover", "Lexus", "Lifan", "Mahindra", "Maserati", "Mercedes-Benz", "MG Motors", "Mini", "Mitsubishi", "Nissan", "Peugeot", "Porsche", "Ram", "Renault", "Smart", "Ssangyong", "Subaru", "Suzuki", "Toyota", "Troller", "Volkswagen", "Volvo" }));
        cbMarca.setEnabled(false);
        jPanel1.add(cbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 240, 30));

        cbCategoriaHabilitação.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesado", "Moto", "Leve", "Semi-Médio", "Médio", "Semi-Pesado", "Pesado" }));
        cbCategoriaHabilitação.setEnabled(false);
        jPanel1.add(cbCategoriaHabilitação, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 160, 30));

        cbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cinza Claro", "Outros", "Azul", "Amarelo", "Branco", "Bege", "Cinza", "Cinza Chumbo", "Laranja", "Lilas", "Marron", "Preto", "Prata", "Roxo", "Vermelho", "Verde" }));
        cbCor.setEnabled(false);
        jPanel1.add(cbCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 210, 30));

        txtDataVei.setEnabled(false);
        jPanel1.add(txtDataVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 170, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Placa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHASSI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ctg. do Veiculo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Habilitação");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ano do Veiculo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Peso Suportado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, -1, -1));

        txtPeso.setEnabled(false);
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 140, 30));

        txtDataCad.setEnabled(false);
        jPanel1.add(txtDataCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 160, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de Cadastro");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNovo.setBackground(new java.awt.Color(0, 0, 153));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, 30));

        btnCad.setBackground(new java.awt.Color(0, 153, 51));
        btnCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCad.setText("Editar");
        btnCad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        btnCad.setEnabled(false);
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });
        jPanel2.add(btnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 100, -1));

        btnCancela.setBackground(new java.awt.Color(51, 51, 51));
        btnCancela.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancela.setForeground(new java.awt.Color(255, 255, 255));
        btnCancela.setText("Cancela");
        btnCancela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 810, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cod:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 40, -1));

        lblCod.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCod.setForeground(new java.awt.Color(153, 0, 0));
        lblCod.setText(".....");
        jPanel1.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, -1));

        tblCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Placa", "Modelo", "Marca", "Cor", "Chassi", "Ctg.Veiculo", "Habilitação", "Ano do Veiculo", "Peso", "Data Cadastro"
            }
        ));
        tblCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCadastroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCadastro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1070, 250));

        cbpes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbpes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa", "Data de Cadastro", "Modelo" }));
        cbpes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        jPanel1.add(cbpes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 150, 27));

        txtConsulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsultaKeyPressed(evt);
            }
        });
        jPanel1.add(txtConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 190, 27));

        btnConsultar.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 110, 27));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        HabilitaCampo();
        LimpaCampo();
        txtDataCad.setText(PegarDateTime());
        btnCad.setEnabled(true);
        btnNovo.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
       
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        HabilitaCampo();
        VeiculoEmpDAO cdao = new VeiculoEmpDAO();
        RelConVeiMODEL c = new RelConVeiMODEL();
        String campo = null;
        if (cbpes.getSelectedIndex() == 0) {
            campo = "placa";
        } else if (cbpes.getSelectedIndex() == 1) {
            campo = "DataCad";
        } else if (cbpes.getSelectedIndex() == 2) {
            campo = "modelo";
        }
//Listar na tabela
        cdao.Consultar(campo, txtConsulta.getText(), c);
        
        lblCod.setText(String.valueOf(c.getCod()));
        txtPlaca.setText(c.getPlaca());
        cbModelo.setSelectedItem(c.getModelo());
        cbMarca.setSelectedItem(c.getMarca());
        cbCor.setSelectedItem(c.getCor());
        txtChassi.setText(c.getChassi());
        cbCategoriaVeiculo.setSelectedItem(c.getCatVei());
        cbCategoriaHabilitação.setSelectedItem(c.getCatHab());      
        txtDataVei.setDateFormatString(c.getAnoVei());
        txtPeso.setText(String.valueOf(c.getLimPeso()));
        txtDataCad.setText(String.valueOf(c.getDataCad()));
        
        List<RelConVeiMODEL> cadastros = cdao.getLista(campo, txtConsulta.getText());
        DefaultTableModel model = (DefaultTableModel) tblCadastro.getModel();
        model.setNumRows(0);
        for (RelConVeiMODEL cad : cadastros) {
            model.addRow(new Object[]{
                cad.getCod(),
                cad.getPlaca(),
                cad.getModelo(),
                cad.getMarca(),
                cad.getCor(),
                cad.getChassi(),
                cad.getCatVei(),
                cad.getCatHab(),
                cad.getAnoVei(),
                cad.getLimPeso(),
                cad.getDataCad()
               
            });
        }if (txtPlaca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Veiculo não está Cadastrado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    
    private void tblCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCadastroMouseClicked
          if (evt.getClickCount() == 1) {
            lblCod.setText(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 0).toString());
            txtPlaca.setText(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 1).toString());
            cbModelo.setSelectedItem(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 2).toString());
            cbMarca.setSelectedItem(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 3).toString());
            cbCor.setSelectedItem(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 4).toString());
            txtChassi.setText(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 5).toString());
            cbCategoriaVeiculo.setSelectedItem(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 6).toString());
            cbCategoriaHabilitação.setSelectedItem(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 7).toString());
            java.util.Date pega = (java.util.Date) tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 8); 
            txtDataVei.setDate(pega);
            txtPeso.setText(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 9).toString());
            txtDataCad.setText(tblCadastro.getValueAt(tblCadastro.getSelectedRow(), 10).toString());
    }//GEN-LAST:event_tblCadastroMouseClicked
    }
    private void txtConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyPressed
        btnConsultarActionPerformed(null);
    }//GEN-LAST:event_txtConsultaKeyPressed
    

     private String ConverterDataVei() {
        java.util.Date pega = txtDataVei.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String data = formato.format(pega);
        return data;
    } 
    private String PegarDateTime() {
        DateFormat FormatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US);
        Date date = new Date();
        return FormatoData.format(date);
    }

    private void LimpaCampo() {
        txtPlaca.setText("");
        txtChassi.setText("");
        txtPeso.setText("");
        txtDataVei.setDate(null);
        txtDataCad.setText("");
        txtPlaca.requestFocus();
    }

    private void HabilitaCampo() {
        txtPlaca.setEnabled(true);
        txtChassi.setEnabled(true);
        txtPeso.setEnabled(true);
        cbCategoriaHabilitação.setEnabled(true);
        cbCategoriaVeiculo.setEnabled(true);
        cbCor.setEnabled(true);
        cbMarca.setEnabled(true);
        cbModelo.setEnabled(true);
        txtDataVei.setEnabled(true);
    }

    private void DesabilitaCampo() {
        txtPlaca.setEnabled(false);
        txtChassi.setEnabled(false);
        txtPeso.setEnabled(false);
        cbCategoriaHabilitação.setEnabled(false);
        cbCategoriaVeiculo.setEnabled(false);
        cbCor.setEnabled(false);
        cbMarca.setEnabled(false);
        cbModelo.setEnabled(false);
        txtDataVei.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cbCategoriaHabilitação;
    private javax.swing.JComboBox<String> cbCategoriaVeiculo;
    private javax.swing.JComboBox<String> cbCor;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JComboBox<String> cbpes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JTable tblCadastro;
    private javax.swing.JFormattedTextField txtChassi;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtDataCad;
    private com.toedter.calendar.JDateChooser txtDataVei;
    private javax.swing.JFormattedTextField txtPeso;
    private javax.swing.JFormattedTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
