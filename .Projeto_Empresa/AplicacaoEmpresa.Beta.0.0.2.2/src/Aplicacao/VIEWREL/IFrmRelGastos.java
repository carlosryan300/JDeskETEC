package Aplicacao.VIEWREL;

import Aplicacao.CadMODEL.GastosMODEL;
import Aplicacao.DAO.GastosDAO;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class IFrmRelGastos extends javax.swing.JInternalFrame {


    public IFrmRelGastos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnFiltrarGastos = new javax.swing.JButton();
        btnRelatorioGeral = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtDataIniGasto = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFimGasto = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        btnFiltrar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        cbpes = new javax.swing.JComboBox<>();
        txtConsulta = new javax.swing.JTextField();
        btnConsultarGastos = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGastos = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Gerar Relatório de Gastos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFiltrarGastos.setBackground(new java.awt.Color(70, 31, 31));
        btnFiltrarGastos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFiltrarGastos.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltrarGastos.setText("Gerar");
        btnFiltrarGastos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Gerar Relatório Por Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnFiltrarGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarGastosActionPerformed(evt);
            }
        });
        jPanel2.add(btnFiltrarGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 40));

        btnRelatorioGeral.setBackground(new java.awt.Color(31, 41, 41));
        btnRelatorioGeral.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRelatorioGeral.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorioGeral.setText("Gerar");
        btnRelatorioGeral.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Gerar Relatório Geral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnRelatorioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioGeralActionPerformed(evt);
            }
        });
        jPanel2.add(btnRelatorioGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 40));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 350, 60));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtDataIniGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("De");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Data de Início");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Até");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 30, -1));
        jPanel3.add(txtFimGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 140, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Data de Fim");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 90, -1));

        btnFiltrar.setBackground(new java.awt.Color(102, 102, 102));
        btnFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltrar.setText("Filtrar");
        btnFiltrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 80, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 460, 60));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbpes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbpes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Valor", "Data" }));
        cbpes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 3));
        cbpes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(cbpes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 30));

        txtConsulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        txtConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsultaKeyPressed(evt);
            }
        });
        jPanel6.add(txtConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 9, 450, 48));

        btnConsultarGastos.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultarGastos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConsultarGastos.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarGastos.setText("Consultar");
        btnConsultarGastos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnConsultarGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarGastos.setPreferredSize(new java.awt.Dimension(87, 36));
        btnConsultarGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarGastosActionPerformed(evt);
            }
        });
        jPanel6.add(btnConsultarGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 140, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 830, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 870, 180));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Descrição", "Valor", "Data"
            }
        ));
        jScrollPane1.setViewportView(tblGastos);
        if (tblGastos.getColumnModel().getColumnCount() > 0) {
            tblGastos.getColumnModel().getColumn(0).setMinWidth(50);
            tblGastos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblGastos.getColumnModel().getColumn(0).setMaxWidth(90);
            tblGastos.getColumnModel().getColumn(1).setMinWidth(100);
            tblGastos.getColumnModel().getColumn(1).setPreferredWidth(180);
            tblGastos.getColumnModel().getColumn(1).setMaxWidth(400);
            tblGastos.getColumnModel().getColumn(3).setMinWidth(40);
            tblGastos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblGastos.getColumnModel().getColumn(3).setMaxWidth(120);
            tblGastos.getColumnModel().getColumn(4).setMinWidth(150);
            tblGastos.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblGastos.getColumnModel().getColumn(4).setMaxWidth(180);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 330));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 212, 870, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarGastosActionPerformed

        GastosDAO cdao = new GastosDAO();
        String campo = null;
        switch (cbpes.getSelectedIndex()) {
            case 0:
                campo = "tipo";
                break;
            case 1:
                campo = "valor";
                break;
            case 2:
                campo = "datacad";
                break;
            default:
                break;
        }
        List<GastosMODEL> cadastros = cdao.getLista(campo, txtConsulta.getText());
        DefaultTableModel model = (DefaultTableModel) tblGastos.getModel();
        model.setNumRows(0);
        for (GastosMODEL con : cadastros) {
            model.addRow(new Object[]{
                con.getCod(),
                con.getTipo(),
                con.getDescricao(),
                con.getValor(),
                con.getDataCad()
            });
        }
    }//GEN-LAST:event_btnConsultarGastosActionPerformed

    private void btnFiltrarGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarGastosActionPerformed

        try {
            java.util.Date I = txtDataIniGasto.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            String dataIn = formato.format(I);

            java.util.Date F = txtFimGasto.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
            String datafim = format1.format(F);
            GastosMODEL G = new GastosMODEL();
            GastosDAO cdao = new GastosDAO();
            cdao.gerarRel(dataIn, datafim, G);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos de datas");
        }

    }//GEN-LAST:event_btnFiltrarGastosActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        try {
            java.util.Date I = txtDataIniGasto.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            String dataIn = formato.format(I);

            java.util.Date F = txtFimGasto.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
            String datafim = format1.format(F);
            
            GastosDAO cdao = new GastosDAO();

            List<GastosMODEL> cadastros = cdao.getListData(dataIn, datafim);
            DefaultTableModel model = (DefaultTableModel) tblGastos.getModel();
            model.setNumRows(0);
            for (GastosMODEL con : cadastros) {
                model.addRow(new Object[]{
                    con.getCod(),
                    con.getTipo(),
                    con.getDescricao(),
                    con.getValor(),
                    con.getDataCad()
                });
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos de datas");
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnRelatorioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioGeralActionPerformed

    }//GEN-LAST:event_btnRelatorioGeralActionPerformed

    private void txtConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyPressed
        btnConsultarGastosActionPerformed(null);
    }//GEN-LAST:event_txtConsultaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarGastos;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnFiltrarGastos;
    private javax.swing.JButton btnRelatorioGeral;
    private javax.swing.JComboBox<String> cbpes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGastos;
    private javax.swing.JTextField txtConsulta;
    private com.toedter.calendar.JDateChooser txtDataIniGasto;
    private com.toedter.calendar.JDateChooser txtFimGasto;
    // End of variables declaration//GEN-END:variables
}
