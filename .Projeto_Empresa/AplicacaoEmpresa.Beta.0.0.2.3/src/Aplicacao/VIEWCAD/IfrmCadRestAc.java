/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao.VIEWCAD;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser;

public class IfrmCadRestAc extends javax.swing.JInternalFrame {

    public IfrmCadRestAc() {
        initComponents();
        btnVoltar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        PainelCadastro = new javax.swing.JPanel();
        cbCadSer = new javax.swing.JCheckBox();
        cbCadCli = new javax.swing.JCheckBox();
        cbCadEmp = new javax.swing.JCheckBox();
        cbCadFun = new javax.swing.JCheckBox();
        cbCadUsu = new javax.swing.JCheckBox();
        cbCadVei = new javax.swing.JCheckBox();
        cbCadRes = new javax.swing.JCheckBox();
        PainelRelatório = new javax.swing.JPanel();
        cbRelSer = new javax.swing.JCheckBox();
        cbRelCli = new javax.swing.JCheckBox();
        cbRelFun = new javax.swing.JCheckBox();
        cbRelUsu = new javax.swing.JCheckBox();
        cbRelVei = new javax.swing.JCheckBox();
        cbRelGas = new javax.swing.JCheckBox();
        cbRelLuc = new javax.swing.JCheckBox();
        PainelConsulta = new javax.swing.JPanel();
        cbConSer = new javax.swing.JCheckBox();
        cbConCli = new javax.swing.JCheckBox();
        cbConEmp = new javax.swing.JCheckBox();
        cbConFun = new javax.swing.JCheckBox();
        cbConUsu = new javax.swing.JCheckBox();
        cbConVei = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelPrincipal.setBackground(new java.awt.Color(0, 51, 51));
        PainelPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        PainelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelCadastro.setBackground(new java.awt.Color(0, 102, 102));
        PainelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true), "Acesso a Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        PainelCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbCadSer.setBackground(new java.awt.Color(51, 51, 51));
        cbCadSer.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbCadSer.setForeground(new java.awt.Color(255, 255, 255));
        cbCadSer.setText("Serviço");
        cbCadSer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelCadastro.add(cbCadSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 210, -1));

        cbCadCli.setBackground(new java.awt.Color(51, 51, 51));
        cbCadCli.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbCadCli.setForeground(new java.awt.Color(255, 255, 255));
        cbCadCli.setText("Cliente(PF)");
        cbCadCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelCadastro.add(cbCadCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 210, -1));

        cbCadEmp.setBackground(new java.awt.Color(51, 51, 51));
        cbCadEmp.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbCadEmp.setForeground(new java.awt.Color(255, 255, 255));
        cbCadEmp.setText("Empresa(PJ)");
        cbCadEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelCadastro.add(cbCadEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, -1));

        cbCadFun.setBackground(new java.awt.Color(51, 51, 51));
        cbCadFun.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbCadFun.setForeground(new java.awt.Color(255, 255, 255));
        cbCadFun.setText("Funciónario");
        cbCadFun.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelCadastro.add(cbCadFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, -1));

        cbCadUsu.setBackground(new java.awt.Color(51, 51, 51));
        cbCadUsu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbCadUsu.setForeground(new java.awt.Color(255, 255, 255));
        cbCadUsu.setText("Usuário do Sistema");
        cbCadUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelCadastro.add(cbCadUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, -1));

        cbCadVei.setBackground(new java.awt.Color(51, 51, 51));
        cbCadVei.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbCadVei.setForeground(new java.awt.Color(255, 255, 255));
        cbCadVei.setText("Veiculo da Empresa");
        cbCadVei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelCadastro.add(cbCadVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, -1));

        cbCadRes.setBackground(new java.awt.Color(51, 51, 51));
        cbCadRes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbCadRes.setForeground(new java.awt.Color(255, 255, 255));
        cbCadRes.setText("Restrições de Usuário");
        cbCadRes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelCadastro.add(cbCadRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 210, -1));

        PainelPrincipal.add(PainelCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 320, 450));

        PainelRelatório.setBackground(new java.awt.Color(0, 102, 102));
        PainelRelatório.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true), "Acesso a Relatório", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        PainelRelatório.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbRelSer.setBackground(new java.awt.Color(153, 153, 153));
        cbRelSer.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbRelSer.setForeground(new java.awt.Color(255, 255, 255));
        cbRelSer.setText("Serviço");
        cbRelSer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelRelatório.add(cbRelSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 200, -1));

        cbRelCli.setBackground(new java.awt.Color(153, 153, 153));
        cbRelCli.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbRelCli.setForeground(new java.awt.Color(255, 255, 255));
        cbRelCli.setText("Clientes");
        cbRelCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelRelatório.add(cbRelCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 200, -1));

        cbRelFun.setBackground(new java.awt.Color(153, 153, 153));
        cbRelFun.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbRelFun.setForeground(new java.awt.Color(255, 255, 255));
        cbRelFun.setText("Funciónario");
        cbRelFun.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelRelatório.add(cbRelFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, -1));

        cbRelUsu.setBackground(new java.awt.Color(153, 153, 153));
        cbRelUsu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbRelUsu.setForeground(new java.awt.Color(255, 255, 255));
        cbRelUsu.setText("Usuário do Sistema");
        cbRelUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelRelatório.add(cbRelUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, -1));

        cbRelVei.setBackground(new java.awt.Color(153, 153, 153));
        cbRelVei.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbRelVei.setForeground(new java.awt.Color(255, 255, 255));
        cbRelVei.setText("Veiculo da Empresa");
        cbRelVei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelRelatório.add(cbRelVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, -1));

        cbRelGas.setBackground(new java.awt.Color(153, 153, 153));
        cbRelGas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbRelGas.setForeground(new java.awt.Color(255, 255, 255));
        cbRelGas.setText("Gastos");
        cbRelGas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelRelatório.add(cbRelGas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 200, -1));

        cbRelLuc.setBackground(new java.awt.Color(153, 153, 153));
        cbRelLuc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbRelLuc.setForeground(new java.awt.Color(255, 255, 255));
        cbRelLuc.setText("Lucros");
        cbRelLuc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelRelatório.add(cbRelLuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 200, -1));

        PainelPrincipal.add(PainelRelatório, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 320, 450));

        PainelConsulta.setBackground(new java.awt.Color(0, 102, 102));
        PainelConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true), "Acesso a Consulta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        PainelConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbConSer.setBackground(new java.awt.Color(102, 102, 102));
        cbConSer.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbConSer.setForeground(new java.awt.Color(255, 255, 255));
        cbConSer.setText("Serviço");
        cbConSer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelConsulta.add(cbConSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 80, 180, -1));

        cbConCli.setBackground(new java.awt.Color(102, 102, 102));
        cbConCli.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbConCli.setForeground(new java.awt.Color(255, 255, 255));
        cbConCli.setText("Cliente(PF)");
        cbConCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelConsulta.add(cbConCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 140, 180, -1));

        cbConEmp.setBackground(new java.awt.Color(102, 102, 102));
        cbConEmp.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbConEmp.setForeground(new java.awt.Color(255, 255, 255));
        cbConEmp.setText("Empresa(PJ)");
        cbConEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelConsulta.add(cbConEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 180, -1));

        cbConFun.setBackground(new java.awt.Color(102, 102, 102));
        cbConFun.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbConFun.setForeground(new java.awt.Color(255, 255, 255));
        cbConFun.setText("Funciónario");
        cbConFun.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelConsulta.add(cbConFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 260, 180, -1));

        cbConUsu.setBackground(new java.awt.Color(102, 102, 102));
        cbConUsu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbConUsu.setForeground(new java.awt.Color(255, 255, 255));
        cbConUsu.setText("Usuário do Sistema");
        cbConUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelConsulta.add(cbConUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 180, -1));

        cbConVei.setBackground(new java.awt.Color(102, 102, 102));
        cbConVei.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbConVei.setForeground(new java.awt.Color(255, 255, 255));
        cbConVei.setText("Veiculo da Empresa");
        cbConVei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        PainelConsulta.add(cbConVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 380, 180, -1));

        PainelPrincipal.add(PainelConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 330, 450));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(0, 0, 102));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 200, 40));

        btnCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel5.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 200, 40));

        btnVoltar.setBackground(new java.awt.Color(0, 102, 0));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel5.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 200, 40));

        PainelPrincipal.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 1030, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--" }));
        PainelPrincipal.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 330, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecione um Usuário");
        PainelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 190, 30));

        getContentPane().add(PainelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        setBounds(0, 0, 1084, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        for (int i = 0; i < PainelConsulta.getComponentCount() && i < PainelCadastro.getComponentCount(); i++) {
            Component Cad = PainelCadastro.getComponent(i);
            Component Con = PainelConsulta.getComponent(i);
            JCheckBox ChecarCad = (JCheckBox) Cad;
            JCheckBox ChecarCon = (JCheckBox) Con;
            if (Cad instanceof JCheckBox) {

                if (ChecarCad.isSelected() || ChecarCon.isSelected()) {
                    btnVoltar.setVisible(true);
                    btnCadastrar.setEnabled(false);
                    btnEditar.setEnabled(false);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione Pelo Menos um Acesso");
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnVoltar.setVisible(true);
        btnCadastrar.setEnabled(false);
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCadastro;
    private javax.swing.JPanel PainelConsulta;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JPanel PainelRelatório;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox cbCadCli;
    private javax.swing.JCheckBox cbCadEmp;
    private javax.swing.JCheckBox cbCadFun;
    private javax.swing.JCheckBox cbCadRes;
    private javax.swing.JCheckBox cbCadSer;
    private javax.swing.JCheckBox cbCadUsu;
    private javax.swing.JCheckBox cbCadVei;
    private javax.swing.JCheckBox cbConCli;
    private javax.swing.JCheckBox cbConEmp;
    private javax.swing.JCheckBox cbConFun;
    private javax.swing.JCheckBox cbConSer;
    private javax.swing.JCheckBox cbConUsu;
    private javax.swing.JCheckBox cbConVei;
    private javax.swing.JCheckBox cbRelCli;
    private javax.swing.JCheckBox cbRelFun;
    private javax.swing.JCheckBox cbRelGas;
    private javax.swing.JCheckBox cbRelLuc;
    private javax.swing.JCheckBox cbRelSer;
    private javax.swing.JCheckBox cbRelUsu;
    private javax.swing.JCheckBox cbRelVei;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
