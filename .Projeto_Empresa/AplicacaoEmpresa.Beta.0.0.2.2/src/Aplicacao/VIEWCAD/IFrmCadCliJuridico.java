
package Aplicacao.VIEWCAD;
import Aplicacao.DAO.ClienteJuridicoDAO;
import Aplicacao.CadMODEL.ClientePJMODEL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class IFrmCadCliJuridico extends javax.swing.JInternalFrame {

    public IFrmCadCliJuridico() {
        initComponents();
        DesativaCampo();
    }
   
    @SuppressWarnings("unchecked")
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 3));
        setClosable(true);
        setTitle("Cadastrar Pessoa Júridica");
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data de Cadastro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 20));

        txtDatacad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        txtDatacad.setEnabled(false);
        jPanel1.add(txtDatacad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 180, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CNPJ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        txtCNPJ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 220, 28));

        txtRazao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        jPanel1.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, 28));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Razão Social");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ramo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        cbRamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Academia de Esportes / Artes Marciais", "Açúcar e Álcool", "Administração e Participação", "Agências de Turismo / Viagem", "Agricultura / Pecuária / Silvicultura", "Alimentos", "Arquitetura / Paisagismo / Urbanismo", "Assessoria de Imprensa", "Automação", "Automotivo", "Bancário / Financeiro", "Bebidas", "Bens de Capital", "Bens de Consumo (Outros)", "Borracha", "Café", "Calçados", "Comércio Atacadista", "Comércio Varejista", "Comunicação", "Concessionárias / Auto Peças", "Construção Civil", "Consultoria Geral", "Contabilidade/ Auditoria", "Corretagem (Imóveis)", "Corretagem (Seguros)", "Corretagem de Títulos e Valores Imobiliários", "Cosméticos", "Diversão/ Entretenimento", "Educação/ Idiomas", "Eletrônica/ Eletroeletrônica/ Eletrodomésticos", "Embalagens", "Energia/ Eletricidade", "Engenharia", "Equipamentos industriais", "Equipamentos médicos / precisão", "Estética/ Academias", "Eventos", "Farmacêutica/ Veterinária", "Financeiras", "Gráfica/ Editoras", "Importação/ Exportação", "Incorporadora", "Indústrias", "Informática", "Internet/ Sites", "Jornais", "Jurídica", "Logística / Armazéns", "Madeiras", "Materiais de Construção", "Material de Escritório", "Mecânica/ Manutenção", "Metalúrgica / Siderúrgica", "Mineração", "Móveis e Artefatos de decoração", "Órgãos públicos", "Outros", "Papel e Derivados", "Petroquímico/ Petróleo", "Plásticos", "Prestadora de Serviços", "Publicidade / Propaganda", "Recursos Humanos", "Relações Públicas", "Representação Comercial", "Restaurante/ Industrial/ Fast Food", "Saúde", "Segurança Patrimonial", "Seguros/ Previdência Privada", "Sindicatos / Associações / ONGs", "Supermercado / Hipermercado", "Telecomunicações", "Telemarketing/ Call Center", "Têxtil/ Couro", "Transportes", "Turismo/ Hotelaria", "Zoologico" }));
        cbRamo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        jPanel1.add(cbRamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 28));

        cbPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Pequeno", "Médio", "Grande" }));
        cbPorte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        jPanel1.add(cbPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 180, 28));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Porte");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefone Secundário");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, -1, -1));

        txtTel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        try {
            txtTel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 160, 28));

        txtTel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        try {
            txtTel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 150, 28));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone Principal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 840, 110));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Razão Social", "CNPJ", "Ramo", "Porte", "Telefone Primário", "Telefone Secundário"
            }
        ));
        jScrollPane1.setViewportView(tblLista);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 820, 270));

        btnCadastrar.setBackground(new java.awt.Color(0, 153, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastra");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 110, 40));

        btnNovo.setBackground(new java.awt.Color(0, 0, 153));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 110, 40));

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
        jPanel3.add(btnCancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 110, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 840, 340));

        getContentPane().add(jPanel2, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
      LimparCampos();
      AtivarCampo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ClientePJMODEL cad = new ClientePJMODEL();
        cad.setRazaoSocial(txtRazao.getText());
        cad.setCNPJ(txtCNPJ.getText());
        if((cbRamo.getSelectedItem()=="--Selecione--") || (cbPorte.getSelectedItem()=="--Selecione--")) {
            JOptionPane.showMessageDialog(rootPane,"Ramo e Porte!","Selecione",JOptionPane.WARNING_MESSAGE);                  
        }else{
            cad.setRamo((String)cbRamo.getSelectedItem());
            cad.setPorte((String)cbPorte.getSelectedItem());
        }if(txtTel1.getText()=="(  )    -    "){
            JOptionPane.showMessageDialog(rootPane,"Campo Telefone Principal!","Preencha",JOptionPane.WARNING_MESSAGE);
        }else{
            cad.setTelPrin(txtTel1.getText());
        }
        cad.setTelSec(txtTel2.getText());
        cad.setDataCad(txtDatacad.getText());
        
        ClienteJuridicoDAO cdao = new ClienteJuridicoDAO();
        cdao.adcionaClienteJur(cad);
        JOptionPane.showMessageDialog(rootPane,"Cliente Cadastrado com Sucesso!");
        LimparCampos();
    }
    private void AtivarCampo() {
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
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cbPorte;
    private javax.swing.JComboBox<String> cbRamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLista;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtDatacad;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JFormattedTextField txtTel1;
    private javax.swing.JFormattedTextField txtTel2;
    // End of variables declaration//GEN-END:variables
}
