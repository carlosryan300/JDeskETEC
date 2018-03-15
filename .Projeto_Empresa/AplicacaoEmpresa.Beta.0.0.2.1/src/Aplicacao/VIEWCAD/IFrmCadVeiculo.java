package Aplicacao.VIEWCAD;

import Aplicacao.DAO.VeiculoEmpDAO;
import Aplicacao.CadMODEL.CadVeiEmpMODEL;
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class IFrmCadVeiculo extends javax.swing.JInternalFrame {

    public IFrmCadVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPlaca = new javax.swing.JFormattedTextField();
        txtChassi = new javax.swing.JFormattedTextField();
        cbCatHab = new javax.swing.JComboBox<>();
        cbModelo = new javax.swing.JComboBox<>();
        cbMarca = new javax.swing.JComboBox<>();
        cbCatVeiculo = new javax.swing.JComboBox<>();
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
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadstro Veículo da Empresa");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true), "Cadastro de Veiculo da Empresa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPlaca.setEnabled(false);
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, 30));

        try {
            txtChassi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#AA . AAA### . AA . ###### ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtChassi.setEnabled(false);
        jPanel1.add(txtChassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 220, 30));

        cbCatHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D", "A", "B", "C", "D", "E", "AB", "AC", "AD", "AE", "ACC" }));
        cbCatHab.setEnabled(false);
        jPanel1.add(cbCatHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 150, 30));

        cbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caminhão", "Outros", "Caminhoneta", "Conversível", "Esportivo ", "Hatch", "Minivan ", "Pick-up ", "Sedan", "Station Wagon (SW)", "Utilitário esportivo", "Van" }));
        cbModelo.setEnabled(false);
        jPanel1.add(cbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 160, 30));

        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercedes-Bens", "Outros", "Agrale", "Aston Martin", "Audi", "Bentley", "BMW", "Changan", "Chery", "GM/Chevrolet", "Chrysler", "Citroën", "Dodge", "Effa", "Ferrari", "Fiat", "Ford", "Geely", "Hafei", "Hyundai", "Iveco", "Jac Motors", "Jaguar", "Jeep", "Jinbei", "Kia", "Lamborghini", "Land Rover", "Lexus", "Lifan", "Mahindra", "Maserati", "Mercedes-Benz", "MG Motors", "Mini", "Mitsubishi", "Nissan", "Peugeot", "Porsche", "Ram", "Renault", "Smart", "Ssangyong", "Subaru", "Suzuki", "Toyota", "Troller", "Volkswagen", "Volvo" }));
        cbMarca.setEnabled(false);
        jPanel1.add(cbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 180, 30));

        cbCatVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesado", "Moto", "Leve", "Semi-Médio", "Médio", "Semi-Pesado", "Pesado" }));
        cbCatVeiculo.setEnabled(false);
        jPanel1.add(cbCatVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 120, 30));

        cbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cinza Claro", "Outros", "Azul", "Amarelo", "Branco", "Bege", "Cinza", "Cinza Chumbo", "Laranja", "Lilas", "Marron", "Preto", "Prata", "Roxo", "Vermelho", "Verde" }));
        cbCor.setEnabled(false);
        jPanel1.add(cbCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 130, 30));

        txtDataVei.setEnabled(false);
        jPanel1.add(txtDataVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 160, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Placa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHASSI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ctg. do Veiculo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ctg. de Habilitação");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ano do Veiculo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Peso Suportado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        txtPeso.setEnabled(false);
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 140, 30));

        txtDataCad.setEnabled(false);
        jPanel1.add(txtDataCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 160, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de Cadastro");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

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
        jPanel2.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, 30));

        btnCad.setBackground(new java.awt.Color(0, 153, 51));
        btnCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCad.setText("Cadastrar");
        btnCad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        btnCad.setEnabled(false);
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });
        jPanel2.add(btnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, -1));

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
        jPanel2.add(btnCancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 600, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cod:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 40, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText(".....");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

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
        CadVeiEmpMODEL cad = new CadVeiEmpMODEL();
        if (txtPlaca.getText().equals("   -    ") || txtChassi.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É Obrigatorio Preencher Todos os Campos", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if (txtPeso.getText().equals("") || txtDataVei.getDate().equals(null)) {
            JOptionPane.showMessageDialog(rootPane, "É Obrigatorio Preencher Todos os Campos", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
            cad.setPlaca(txtPlaca.getText());
            cad.setChassi(txtChassi.getText());
            cad.setAnoVei(ConverterDataVei());
            cad.setLimPeso(Double.valueOf(txtPeso.getText()));
        }
        cad.setModelo((String) cbModelo.getSelectedItem());
        cad.setMarca((String) cbMarca.getSelectedItem());
        cad.setCor((String) cbCor.getSelectedItem());
        cad.setCatVei((String) cbCatVeiculo.getSelectedItem());
        cad.setCatHab((String) cbCatHab.getSelectedItem());     
        cad.setDataCad(txtDataCad.getText());

        VeiculoEmpDAO cdao = new VeiculoEmpDAO();
        cdao.adcionaVeiculo(cad);

        JOptionPane.showMessageDialog(rootPane, "Veiculo Cadastrado");
        DesabilitaCampo();
        LimpaCampo();
        btnCad.setEnabled(false);
        btnNovo.setEnabled(true);
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

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
        cbCatVeiculo.setEnabled(true);
        cbCatHab.setEnabled(true);
        cbCor.setEnabled(true);
        cbMarca.setEnabled(true);
        cbModelo.setEnabled(true);
        txtDataVei.setEnabled(true);
    }

    private void DesabilitaCampo() {
        txtPlaca.setEnabled(false);
        txtChassi.setEnabled(false);
        txtPeso.setEnabled(false);
        cbCatVeiculo.setEnabled(false);
        cbCatHab.setEnabled(false);
        cbCor.setEnabled(false);
        cbMarca.setEnabled(false);
        cbModelo.setEnabled(false);
        txtDataVei.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cbCatHab;
    private javax.swing.JComboBox<String> cbCatVeiculo;
    private javax.swing.JComboBox<String> cbCor;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JFormattedTextField txtChassi;
    private javax.swing.JTextField txtDataCad;
    private com.toedter.calendar.JDateChooser txtDataVei;
    private javax.swing.JFormattedTextField txtPeso;
    private javax.swing.JFormattedTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
