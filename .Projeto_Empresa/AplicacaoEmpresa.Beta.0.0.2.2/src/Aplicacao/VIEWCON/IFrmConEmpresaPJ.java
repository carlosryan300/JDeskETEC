package Aplicacao.VIEWCON;

import Aplicacao.DAO.ClienteJuridicoDAO;
import Aplicacao.CadMODEL.ClientePJMODEL;
import Aplicacao.ConMODEL.RelConEmpMODEL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CarlosRyan
 */
public class IFrmConEmpresaPJ extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmConEmpresaPJ
     */
    public IFrmConEmpresaPJ() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void habilitarCampos() {
        txtRazao.setEnabled(true);
        txtCNPJ.setEnabled(true);
        txtTel1.setEnabled(true);
        txtTel2.setEnabled(true);
        cbPorte.setEnabled(true);
        cbRamo.setEnabled(true);
        txtDatacad.setText(PegarDate());
    }

    private void DesativaCampo() {
        txtRazao.setEnabled(false);
        txtCNPJ.setEnabled(false);
        txtTel1.setEnabled(false);
        txtTel2.setEnabled(false);
        cbPorte.setEnabled(false);
        cbRamo.setEnabled(false);
    }

    private void LimparCampos() {
        txtRazao.setText("");
        txtCNPJ.setText("");
        txtTel1.setText("");
        txtTel2.setText("");
        txtDatacad.setText("");
        cbRamo.setSelectedIndex(0);
        cbPorte.setSelectedIndex(0);
        txtRazao.requestFocus();
    }

    private String PegarDate() {
        DateFormat FormatoData = new SimpleDateFormat("EE, dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return FormatoData.format(date);
    }
   /* public String ConvercaoData(){
        java.util.Date data = txtDatacad.getDate();
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        String novaData = formatarData.format(data);
        return novaData;
}*/
    public String PegarFormatoDataHora(){
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US);
        Date data = new Date();
        return formato.format(data);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDatacad = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtRazao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbRamo = new javax.swing.JComboBox<>();
        cbPorte = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTel2 = new javax.swing.JFormattedTextField();
        txtTel1 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        cbConsulta = new javax.swing.JComboBox<>();
        txtConsulta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data de Cadastro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, 20));

        txtDatacad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        txtDatacad.setEnabled(false);
        jPanel1.add(txtDatacad, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 180, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CNPJ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        txtCNPJ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 220, 28));

        txtRazao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        jPanel1.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 380, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Razão Social");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ramo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        cbRamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Academia de Esportes / Artes Marciais", "Açúcar e Álcool", "Administração e Participação", "Agências de Turismo / Viagem", "Agricultura / Pecuária / Silvicultura", "Alimentos", "Arquitetura / Paisagismo / Urbanismo", "Assessoria de Imprensa", "Automação", "Automotivo", "Bancário / Financeiro", "Bebidas", "Bens de Capital", "Bens de Consumo (Outros)", "Borracha", "Café", "Calçados", "Comércio Atacadista", "Comércio Varejista", "Comunicação", "Concessionárias / Auto Peças", "Construção Civil", "Consultoria Geral", "Contabilidade/ Auditoria", "Corretagem (Imóveis)", "Corretagem (Seguros)", "Corretagem de Títulos e Valores Imobiliários", "Cosméticos", "Diversão/ Entretenimento", "Educação/ Idiomas", "Eletrônica/ Eletroeletrônica/ Eletrodomésticos", "Embalagens", "Energia/ Eletricidade", "Engenharia", "Equipamentos industriais", "Equipamentos médicos / precisão", "Estética/ Academias", "Eventos", "Farmacêutica/ Veterinária", "Financeiras", "Gráfica/ Editoras", "Importação/ Exportação", "Incorporadora", "Indústrias", "Informática", "Internet/ Sites", "Jornais", "Jurídica", "Logística / Armazéns", "Madeiras", "Materiais de Construção", "Material de Escritório", "Mecânica/ Manutenção", "Metalúrgica / Siderúrgica", "Mineração", "Móveis e Artefatos de decoração", "Órgãos públicos", "Outros", "Papel e Derivados", "Petroquímico/ Petróleo", "Plásticos", "Prestadora de Serviços", "Publicidade / Propaganda", "Recursos Humanos", "Relações Públicas", "Representação Comercial", "Restaurante/ Industrial/ Fast Food", "Saúde", "Segurança Patrimonial", "Seguros/ Previdência Privada", "Sindicatos / Associações / ONGs", "Supermercado / Hipermercado", "Telecomunicações", "Telemarketing/ Call Center", "Têxtil/ Couro", "Transportes", "Turismo/ Hotelaria", "Zoologico" }));
        cbRamo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        jPanel1.add(cbRamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 28));

        cbPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Pequeno", "Médio", "Grande" }));
        cbPorte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        jPanel1.add(cbPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 220, 28));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Porte");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefone Secundário");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, -1, -1));

        txtTel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        try {
            txtTel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 160, 28));

        txtTel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        try {
            txtTel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 160, 28));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone Principal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cod:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblCod.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCod.setForeground(new java.awt.Color(153, 0, 0));
        lblCod.setText("......");
        jPanel1.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 970, 110));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Razão Social", "CNPJ", "Ramo", "Porte", "Telefone Primário", "Telefone Secundário"
            }
        ));
        jScrollPane1.setViewportView(tblLista);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 950, 270));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, 970, 290));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setBackground(new java.awt.Color(0, 153, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 110, 40));

        btnExcluir.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel4.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 110, 40));

        btnNovo.setBackground(new java.awt.Color(0, 0, 153));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Editar");
        btnNovo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 110, 40));

        cbConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Razão Social", "Ramo", "Telefone", "Data" }));
        cbConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        jPanel4.add(cbConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 110, 30));

        txtConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        jPanel4.add(txtConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 15, 200, 30));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consulta");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 15, 100, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 204, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 10, 60));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, 970, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        RelConEmpMODEL e = new RelConEmpMODEL();

        e.setId_Empresa(Integer.parseInt(lblCod.getText()));
        e.setRazaoSocial(txtRazao.getText());
        e.setCNPJ(txtCNPJ.getText());
        e.setDataCad(txtDatacad.getText());
        e.setRamo(cbRamo.getSelectedItem().toString());
        e.setPorte(cbPorte.getSelectedItem().toString());
        e.setTelPrin(txtTel1.getText());
        e.setTelSec(txtTel2.getText());

        ClienteJuridicoDAO edao = new ClienteJuridicoDAO();
        edao.alterarEmpresa(e);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        RelConEmpMODEL e = new RelConEmpMODEL();
        int deletar = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro da empresa?");
        if (deletar == 0) {
            e.setId_Empresa(Integer.parseInt(lblCod.getText()));

            ClienteJuridicoDAO edao = new ClienteJuridicoDAO();
            edao.removerEmpresa(e);
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso");
            jButton1ActionPerformed(evt);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        habilitarCampos();

        ClienteJuridicoDAO cdao = new ClienteJuridicoDAO();
        RelConEmpMODEL e = new RelConEmpMODEL();
        String campo = null;
        if (cbConsulta.getSelectedIndex() == 0) {
            campo = "Razão Social";
        } else if (cbConsulta.getSelectedIndex() == 1) {
            campo = "Ramo";
        } else if (cbConsulta.getSelectedIndex() == 2) {
            campo = "Telefone";
        } else if (cbConsulta.getSelectedIndex() == 3) {
            campo = "Data de Cadastro";
        }
        cdao.Consultar(campo, txtConsulta.getText(), e);
        lblCod.setText(String.valueOf(e.getId_Empresa()));
        txtRazao.setText(e.getRazaoSocial());
        txtCNPJ.setText(e.getCNPJ());
        txtDatacad.setText(e.getDataCad());
        cbRamo.setSelectedItem(e.getRamo());
        cbPorte.setSelectedItem(e.getPorte());
        txtTel1.setText(e.getTelPrin());
        txtTel2.setText(e.getTelSec());

        List<RelConEmpMODEL> ClienteJuridico = cdao.getListaEmpresa(campo, txtConsulta.getText());
        DefaultTableModel m = (DefaultTableModel) tblLista.getModel();
        m.setNumRows(0);
        for (RelConEmpMODEL emp : ClienteJuridico) {
            m.addRow(new Object[]{
                emp.getRazaoSocial(),
                emp.getCNPJ(),
                emp.getDataCad(),
                emp.getRamo(),
                emp.getPorte(),
                emp.getTelPrin(),
                emp.getTelSec()

            });
            if (txtCNPJ.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Empresa não encontrada", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cbConsulta;
    private javax.swing.JComboBox<String> cbPorte;
    private javax.swing.JComboBox<String> cbRamo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JTable tblLista;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JFormattedTextField txtDatacad;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JFormattedTextField txtTel1;
    private javax.swing.JFormattedTextField txtTel2;
    // End of variables declaration//GEN-END:variables
}
