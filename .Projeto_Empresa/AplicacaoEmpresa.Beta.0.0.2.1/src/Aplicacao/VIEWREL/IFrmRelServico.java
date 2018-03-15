/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao.VIEWREL;

import Aplicacao.CadMODEL.ServicoMODEL;
import Aplicacao.DAO.ServicoDAO;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla
 */
public class IFrmRelServico extends javax.swing.JInternalFrame {

    
    public IFrmRelServico() {
        initComponents();
        btnRelServico.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDataIni = new com.toedter.calendar.JDateChooser();
        txtFim = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnFiltrarData = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnFiltrarServico = new javax.swing.JButton();
        btnFiltrarServicoCPJ = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtConsServico = new javax.swing.JTextField();
        btnConsServico = new javax.swing.JButton();
        rbFisico = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnRelServico = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServico = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Relatório de Serviço");
        setDoubleBuffered(true);
        setFocusCycleRoot(false);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data de Início");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("De");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel5.add(txtDataIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 30));
        jPanel5.add(txtFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data de Fim");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Até");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 30, -1));

        btnFiltrarData.setBackground(new java.awt.Color(102, 102, 102));
        btnFiltrarData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFiltrarData.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltrarData.setText("Consultar");
        btnFiltrarData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnFiltrarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarDataActionPerformed(evt);
            }
        });
        jPanel5.add(btnFiltrarData, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 80, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 460, 60));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFiltrarServico.setBackground(new java.awt.Color(51, 51, 51));
        btnFiltrarServico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFiltrarServico.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltrarServico.setText("Relatório Data PF");
        btnFiltrarServico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnFiltrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarServicoActionPerformed(evt);
            }
        });
        jPanel2.add(btnFiltrarServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 40));

        btnFiltrarServicoCPJ.setBackground(new java.awt.Color(51, 51, 51));
        btnFiltrarServicoCPJ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFiltrarServicoCPJ.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltrarServicoCPJ.setText("Relatório Data PJ");
        btnFiltrarServicoCPJ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnFiltrarServicoCPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarServicoCPJActionPerformed(evt);
            }
        });
        jPanel2.add(btnFiltrarServicoCPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 140, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 360, 60));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConsServico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtConsServico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        txtConsServico.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtConsServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsServicoKeyPressed(evt);
            }
        });
        jPanel6.add(txtConsServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 310, 50));

        btnConsServico.setBackground(new java.awt.Color(0, 51, 102));
        btnConsServico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConsServico.setForeground(new java.awt.Color(255, 255, 255));
        btnConsServico.setText("Consultar");
        btnConsServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        btnConsServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsServico.setPreferredSize(new java.awt.Dimension(87, 36));
        btnConsServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsServicoActionPerformed(evt);
            }
        });
        jPanel6.add(btnConsServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 140, 40));

        buttonGroup1.add(rbFisico);
        rbFisico.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        rbFisico.setText("Físico");
        jPanel6.add(rbFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jRadioButton2.setText("Jurídico");
        jPanel6.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        btnRelServico.setBackground(new java.awt.Color(51, 51, 51));
        btnRelServico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRelServico.setForeground(new java.awt.Color(255, 255, 255));
        btnRelServico.setText("Relátorio por Tipo");
        btnRelServico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnRelServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelServicoActionPerformed(evt);
            }
        });
        jPanel6.add(btnRelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 140, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, 840, 70));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Marca", "Modelo", "Placa", "Tipo Produto", "Tipo Serviço", "Valor Cobrado"
            }
        ));
        jScrollPane1.setViewportView(tblServico);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsServicoActionPerformed
        if(rbFisico.isSelected()){
        ServicoDAO sdao = new ServicoDAO();
        String campo = "TipoServico";

        List<ServicoMODEL> s = sdao.getLista(campo, txtConsServico.getText());
        DefaultTableModel model = (DefaultTableModel) tblServico.getModel();
        model.setNumRows(0);
        for (ServicoMODEL sm : s) {
            model.addRow(new Object[]{
                sm.getNome(),
                sm.getSobrenome(),
                sm.getMarca(),
                sm.getModelo(),
                sm.getCor(),
                sm.getPlaca(),
                sm.getTipoServico(),
                sm.getValorCobrado()
            });
        }
        }else{
        ServicoDAO sdao = new ServicoDAO();
        String campo = "TipoServico";

        List<ServicoMODEL> s = sdao.getListaPJ(campo, txtConsServico.getText());
        DefaultTableModel model = (DefaultTableModel) tblServico.getModel();
        model.setNumRows(0);
        for (ServicoMODEL sm : s) {
            model.addRow(new Object[]{
                sm.getRazaoSocial(),
                sm.getCnpj(),
                sm.getMarca(),
                sm.getModelo(),
                sm.getCor(),
                sm.getPlaca(),
                sm.getTipoServico(),
                sm.getValorCobrado()
            });
        }
        }
    }//GEN-LAST:event_btnConsServicoActionPerformed

    private void btnRelServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelServicoActionPerformed
        try {
            ServicoDAO sdao = new ServicoDAO();
            sdao.relRapido(txtConsServico.getText());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo de tipo de serviço");
        }
    }//GEN-LAST:event_btnRelServicoActionPerformed

    private void btnFiltrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarServicoActionPerformed
        try {
            java.util.Date I = txtDataIni.getDate();
            SimpleDateFormat formatoI = new SimpleDateFormat("yyyy/MM/dd");
            String dataInicio = formatoI.format(I);

            java.util.Date F = txtFim.getDate();
            SimpleDateFormat formatF = new SimpleDateFormat("yyyy/MM/dd");
            String dataFim = formatF.format(F);

            ServicoDAO sdao = new ServicoDAO();
            sdao.relRapidoFiltrarData(dataInicio, dataFim);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos de datas");
        }
    }//GEN-LAST:event_btnFiltrarServicoActionPerformed

    private void txtConsServicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsServicoKeyPressed
        btnConsServicoActionPerformed(null);
    }//GEN-LAST:event_txtConsServicoKeyPressed

    private void btnFiltrarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarDataActionPerformed
        try {
            java.util.Date I = txtDataIni.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            String dataInicio = formato.format(I);

            java.util.Date F = txtFim.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
            String dataFim = format1.format(F);
            
             if(rbFisico.isSelected()){

            ServicoDAO sdao = new ServicoDAO();

            List<ServicoMODEL> s = sdao.getListaData(dataInicio, dataFim);
            DefaultTableModel model = (DefaultTableModel) tblServico.getModel();
            model.setNumRows(0);
            for (ServicoMODEL sm : s) {
                model.addRow(new Object[]{
                    sm.getNome(),
                    sm.getSobrenome(),
                    sm.getMarca(),
                    sm.getModelo(),
                    sm.getCor(),
                    sm.getPlaca(),
                    sm.getTipoServico(),
                    sm.getValorCobrado()
                });
            }
             }else{
                 ServicoDAO sdao = new ServicoDAO();

            List<ServicoMODEL> s = sdao.getListaDataPJ(dataInicio, dataFim);
            DefaultTableModel model = (DefaultTableModel) tblServico.getModel();
            model.setNumRows(0);
            for (ServicoMODEL sm : s) {
                model.addRow(new Object[]{
                    sm.getRazaoSocial(),
                    sm.getCnpj(),
                    sm.getMarca(),
                    sm.getModelo(),
                    sm.getCor(),
                    sm.getPlaca(),
                    sm.getTipoServico(),
                    sm.getValorCobrado()
                });
            }
             }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos de datas");
        }
    }//GEN-LAST:event_btnFiltrarDataActionPerformed

    private void btnFiltrarServicoCPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarServicoCPJActionPerformed
        try {
            java.util.Date I = txtDataIni.getDate();
            SimpleDateFormat formatoI = new SimpleDateFormat("yyyy/MM/dd");
            String dataInicio = formatoI.format(I);

            java.util.Date F = txtFim.getDate();
            SimpleDateFormat formatF = new SimpleDateFormat("yyyy/MM/dd");
            String dataFim = formatF.format(F);

            ServicoDAO sdao = new ServicoDAO();
            sdao.relRapidoFiltDataCPJ(dataInicio, dataFim);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos de datas");
        }
    }//GEN-LAST:event_btnFiltrarServicoCPJActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsServico;
    private javax.swing.JButton btnFiltrarData;
    private javax.swing.JButton btnFiltrarServico;
    private javax.swing.JButton btnFiltrarServicoCPJ;
    private javax.swing.JButton btnRelServico;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFisico;
    private javax.swing.JTable tblServico;
    private javax.swing.JTextField txtConsServico;
    private com.toedter.calendar.JDateChooser txtDataIni;
    private com.toedter.calendar.JDateChooser txtFim;
    // End of variables declaration//GEN-END:variables
}
