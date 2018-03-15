package Aplicativo.FrmPrincipais;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

import Aplicacao.VIEWCAD.IFmCadGastos;
import Aplicacao.VIEWCAD.IFrmCadCliJuridico;
import Aplicacao.VIEWCAD.IFrmCadFuncionario;
import Aplicacao.VIEWCAD.IFrmServico;
import Aplicacao.VIEWCAD.IFrmCadUsuario;
import Aplicacao.VIEWCAD.IFrmCadVeiculo;
import Aplicacao.VIEWCON.IFrmConServico;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static Aplicativo.FrmPrincipais.FrmLogin.txtLogin;
import Aplicacao.VIEWCON.IFrmConEmpresaPJ;
import Aplicacao.VIEWCON.IFrmConFuncionario;
import Aplicacao.VIEWCON.IFrmConVeiculo;
import Aplicacao.VIEWREL.IFrmRelGastos;
import Aplicacao.VIEWREL.IFrmRelLucro;
import Aplicacao.VIEWREL.IFrmRelServico;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FrmMenu extends javax.swing.JFrame {
    
    public FrmMenu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //Login();
        PegarDataHora();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jSeparator38 = new javax.swing.JToolBar.Separator();
        jSeparator37 = new javax.swing.JToolBar.Separator();
        jSeparator39 = new javax.swing.JToolBar.Separator();
        jSeparator36 = new javax.swing.JToolBar.Separator();
        jSeparator35 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator33 = new javax.swing.JToolBar.Separator();
        jSeparator32 = new javax.swing.JToolBar.Separator();
        jSeparator29 = new javax.swing.JToolBar.Separator();
        jSeparator28 = new javax.swing.JToolBar.Separator();
        jSeparator24 = new javax.swing.JToolBar.Separator();
        jSeparator21 = new javax.swing.JToolBar.Separator();
        jSeparator26 = new javax.swing.JToolBar.Separator();
        jSeparator23 = new javax.swing.JToolBar.Separator();
        jSeparator22 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        jSeparator30 = new javax.swing.JToolBar.Separator();
        jSeparator31 = new javax.swing.JToolBar.Separator();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jSeparator19 = new javax.swing.JToolBar.Separator();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        jSeparator34 = new javax.swing.JToolBar.Separator();
        jSeparator27 = new javax.swing.JToolBar.Separator();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jSeparator46 = new javax.swing.JToolBar.Separator();
        jSeparator48 = new javax.swing.JToolBar.Separator();
        jSeparator49 = new javax.swing.JToolBar.Separator();
        jSeparator47 = new javax.swing.JToolBar.Separator();
        jSeparator55 = new javax.swing.JToolBar.Separator();
        jSeparator53 = new javax.swing.JToolBar.Separator();
        jSeparator56 = new javax.swing.JToolBar.Separator();
        jSeparator54 = new javax.swing.JToolBar.Separator();
        jSeparator44 = new javax.swing.JToolBar.Separator();
        jSeparator45 = new javax.swing.JToolBar.Separator();
        jSeparator43 = new javax.swing.JToolBar.Separator();
        jSeparator42 = new javax.swing.JToolBar.Separator();
        jSeparator50 = new javax.swing.JToolBar.Separator();
        jSeparator51 = new javax.swing.JToolBar.Separator();
        jSeparator40 = new javax.swing.JToolBar.Separator();
        jSeparator52 = new javax.swing.JToolBar.Separator();
        jSeparator41 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jSeparator25 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        ImageIcon icon =  new ImageIcon(getClass().getResource("/Image/image4.jpg"));
        Image image = icon.getImage();
        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        AbaMenuCad = new javax.swing.JMenu();
        SubMenuCadSer = new javax.swing.JMenuItem();
        SubMenuCadEmp = new javax.swing.JMenuItem();
        SubMenuCadVei = new javax.swing.JMenuItem();
        SubMenuCadFun = new javax.swing.JMenuItem();
        SubMenuCadUsu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AbaMenuCon = new javax.swing.JMenu();
        SubServico = new javax.swing.JMenuItem();
        SubVeiculo = new javax.swing.JMenuItem();
        SubFuncionario = new javax.swing.JMenuItem();
        SubEmpresa = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        SubMenuRelCli = new javax.swing.JMenu();
        SubMenuRelGas = new javax.swing.JMenuItem();
        SubMenuRelSer = new javax.swing.JMenuItem();
        SubMenuRelLuc = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        AbaMenuAju = new javax.swing.JMenu();
        SubMenuAjudaInd = new javax.swing.JMenuItem();
        SubMenuAjudaBus = new javax.swing.JMenuItem();
        SubMenuAjudaMan = new javax.swing.JMenuItem();
        SubMenuAjudaTer = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        try {
            jMenu1 =(javax.swing.JMenu)java.beans.Beans.instantiate(getClass().getClassLoader(), "Aplicativo/FrmPrincipais.FrmMenu_jMenu1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        AbaMenuSair1 = new javax.swing.JMenu();
        lblUsuario = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        AbaMenuSair = new javax.swing.JMenu();
        btnSair = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(153, 153, 153));
        jToolBar1.setRollover(true);
        jToolBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator1.setEnabled(false);
        jToolBar1.add(jSeparator1);

        jSeparator2.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator2.setEnabled(false);
        jSeparator2.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator2);

        jSeparator9.setEnabled(false);
        jSeparator9.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator9);

        jSeparator38.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator38.setEnabled(false);
        jSeparator38.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator38);

        jSeparator37.setEnabled(false);
        jSeparator37.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator37);

        jSeparator39.setEnabled(false);
        jSeparator39.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator39);

        jSeparator36.setEnabled(false);
        jSeparator36.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator36);

        jSeparator35.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator35.setEnabled(false);
        jSeparator35.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator35);

        jSeparator8.setEnabled(false);
        jSeparator8.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator8);

        jSeparator7.setEnabled(false);
        jSeparator7.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator7);

        jSeparator33.setEnabled(false);
        jSeparator33.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator33);

        jSeparator32.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator32.setEnabled(false);
        jSeparator32.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator32);

        jSeparator29.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator29.setEnabled(false);
        jSeparator29.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator29);

        jSeparator28.setEnabled(false);
        jSeparator28.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator28);

        jSeparator24.setEnabled(false);
        jSeparator24.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator24);

        jSeparator21.setEnabled(false);
        jSeparator21.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator21);

        jSeparator26.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator26.setEnabled(false);
        jSeparator26.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator26);

        jSeparator23.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator23.setEnabled(false);
        jSeparator23.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator23);

        jSeparator22.setEnabled(false);
        jSeparator22.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator22);

        jSeparator3.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator3.setEnabled(false);
        jSeparator3.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator3);

        jSeparator11.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator11.setEnabled(false);
        jSeparator11.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator11);

        jSeparator17.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator17.setEnabled(false);
        jSeparator17.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator17);

        jSeparator30.setEnabled(false);
        jSeparator30.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator30);

        jSeparator31.setEnabled(false);
        jSeparator31.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator31);

        jSeparator18.setEnabled(false);
        jSeparator18.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator18);

        jSeparator13.setEnabled(false);
        jSeparator13.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator13);

        jSeparator19.setEnabled(false);
        jSeparator19.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator19);

        jSeparator20.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator20.setEnabled(false);
        jSeparator20.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator20);

        jSeparator34.setEnabled(false);
        jSeparator34.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator34);

        jSeparator27.setEnabled(false);
        jSeparator27.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator27);

        jSeparator12.setEnabled(false);
        jSeparator12.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator12);

        jSeparator10.setEnabled(false);
        jSeparator10.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator10);

        jSeparator46.setEnabled(false);
        jSeparator46.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator46);

        jSeparator48.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator48.setEnabled(false);
        jSeparator48.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator48);

        jSeparator49.setEnabled(false);
        jSeparator49.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator49);

        jSeparator47.setEnabled(false);
        jSeparator47.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator47);

        jSeparator55.setEnabled(false);
        jSeparator55.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator55);

        jSeparator53.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator53.setEnabled(false);
        jSeparator53.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator53);

        jSeparator56.setEnabled(false);
        jSeparator56.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator56);

        jSeparator54.setEnabled(false);
        jSeparator54.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator54);

        jSeparator44.setEnabled(false);
        jSeparator44.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator44);

        jSeparator45.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator45.setEnabled(false);
        jSeparator45.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator45);

        jSeparator43.setEnabled(false);
        jSeparator43.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator43);

        jSeparator42.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator42.setEnabled(false);
        jSeparator42.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator42);

        jSeparator50.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator50.setEnabled(false);
        jSeparator50.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator50);

        jSeparator51.setEnabled(false);
        jSeparator51.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator51);

        jSeparator40.setEnabled(false);
        jSeparator40.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator40);

        jSeparator52.setEnabled(false);
        jSeparator52.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator52);

        jSeparator41.setEnabled(false);
        jSeparator41.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator41);

        jSeparator4.setEnabled(false);
        jSeparator4.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator4);

        jSeparator16.setEnabled(false);
        jSeparator16.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator16);

        jSeparator15.setEnabled(false);
        jSeparator15.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator15);

        jSeparator25.setEnabled(false);
        jSeparator25.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator25);

        jSeparator6.setEnabled(false);
        jSeparator6.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator6);

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Data e Hora: ");
        jToolBar1.add(jLabel2);

        lbldata.setBackground(new java.awt.Color(0, 0, 51));
        lbldata.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldata.setForeground(new java.awt.Color(0, 0, 51));
        jToolBar1.add(lbldata);

        jSeparator5.setEnabled(false);
        jToolBar1.add(jSeparator5);

        jSeparator14.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator14.setEnabled(false);
        jToolBar1.add(jSeparator14);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        AbaMenuCad.setBackground(new java.awt.Color(204, 204, 204));
        AbaMenuCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        AbaMenuCad.setText("Cadastro");
        AbaMenuCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbaMenuCad.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        SubMenuCadSer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SubMenuCadSer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuCadSer.setText("Serviço");
        SubMenuCadSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        SubMenuCadSer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubMenuCadSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuCadSerActionPerformed(evt);
            }
        });
        AbaMenuCad.add(SubMenuCadSer);

        SubMenuCadEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SubMenuCadEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuCadEmp.setText("Empresa (PJ)");
        SubMenuCadEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        SubMenuCadEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubMenuCadEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuCadEmpActionPerformed(evt);
            }
        });
        AbaMenuCad.add(SubMenuCadEmp);

        SubMenuCadVei.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SubMenuCadVei.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuCadVei.setText("Veículo da Empresa");
        SubMenuCadVei.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        SubMenuCadVei.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubMenuCadVei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuCadVeiActionPerformed(evt);
            }
        });
        AbaMenuCad.add(SubMenuCadVei);

        SubMenuCadFun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SubMenuCadFun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuCadFun.setText("Funcionário");
        SubMenuCadFun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        SubMenuCadFun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubMenuCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuCadFunActionPerformed(evt);
            }
        });
        AbaMenuCad.add(SubMenuCadFun);

        SubMenuCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SubMenuCadUsu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuCadUsu.setText("Usuário do Sistema");
        SubMenuCadUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        SubMenuCadUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubMenuCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuCadUsuActionPerformed(evt);
            }
        });
        AbaMenuCad.add(SubMenuCadUsu);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setText("Gastos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        AbaMenuCad.add(jMenuItem1);

        jMenuBar1.add(AbaMenuCad);

        jMenu2.setBorder(null);
        jMenu2.setForeground(new java.awt.Color(0, 0, 153));
        jMenu2.setText("|");
        jMenu2.setEnabled(false);
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuBar1.add(jMenu2);

        AbaMenuCon.setBackground(new java.awt.Color(204, 204, 204));
        AbaMenuCon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        AbaMenuCon.setText("Consulta");
        AbaMenuCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbaMenuCon.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        SubServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SubServico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubServico.setText("Serviço");
        SubServico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        SubServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubServicoActionPerformed(evt);
            }
        });
        AbaMenuCon.add(SubServico);

        SubVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        SubVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubVeiculo.setText("Veículo");
        SubVeiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        SubVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubVeiculoActionPerformed(evt);
            }
        });
        AbaMenuCon.add(SubVeiculo);

        SubFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        SubFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubFuncionario.setText("Funcionário");
        SubFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        SubFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubFuncionarioActionPerformed(evt);
            }
        });
        AbaMenuCon.add(SubFuncionario);

        SubEmpresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        SubEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubEmpresa.setText("Clientes");
        SubEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        SubEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubEmpresaActionPerformed(evt);
            }
        });
        AbaMenuCon.add(SubEmpresa);

        jMenuBar1.add(AbaMenuCon);

        jMenu4.setBorder(null);
        jMenu4.setForeground(new java.awt.Color(0, 0, 153));
        jMenu4.setText("|");
        jMenu4.setEnabled(false);
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuBar1.add(jMenu4);

        SubMenuRelCli.setBackground(new java.awt.Color(204, 204, 204));
        SubMenuRelCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        SubMenuRelCli.setText("Relatórios");
        SubMenuRelCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubMenuRelCli.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        SubMenuRelGas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK));
        SubMenuRelGas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuRelGas.setText("Gastos");
        SubMenuRelGas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        SubMenuRelGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuRelGasActionPerformed(evt);
            }
        });
        SubMenuRelCli.add(SubMenuRelGas);

        SubMenuRelSer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        SubMenuRelSer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuRelSer.setText("Serviço");
        SubMenuRelSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        SubMenuRelSer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubMenuRelSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuRelSerActionPerformed(evt);
            }
        });
        SubMenuRelCli.add(SubMenuRelSer);

        SubMenuRelLuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        SubMenuRelLuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuRelLuc.setText("Lucro ");
        SubMenuRelLuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        SubMenuRelLuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubMenuRelLuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuRelLucActionPerformed(evt);
            }
        });
        SubMenuRelCli.add(SubMenuRelLuc);

        jMenuBar1.add(SubMenuRelCli);

        jMenu6.setBorder(null);
        jMenu6.setForeground(new java.awt.Color(0, 0, 153));
        jMenu6.setText("|");
        jMenu6.setEnabled(false);
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuBar1.add(jMenu6);

        AbaMenuAju.setBackground(new java.awt.Color(204, 204, 204));
        AbaMenuAju.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        AbaMenuAju.setText("Ajuda ");
        AbaMenuAju.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbaMenuAju.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        SubMenuAjudaInd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PAGE_UP, java.awt.event.InputEvent.CTRL_MASK));
        SubMenuAjudaInd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuAjudaInd.setText("Indice");
        SubMenuAjudaInd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        AbaMenuAju.add(SubMenuAjudaInd);

        SubMenuAjudaBus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PAGE_DOWN, java.awt.event.InputEvent.CTRL_MASK));
        SubMenuAjudaBus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuAjudaBus.setText("Buscar");
        SubMenuAjudaBus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        AbaMenuAju.add(SubMenuAjudaBus);

        SubMenuAjudaMan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, java.awt.event.InputEvent.CTRL_MASK));
        SubMenuAjudaMan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuAjudaMan.setText("Manual");
        SubMenuAjudaMan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        AbaMenuAju.add(SubMenuAjudaMan);

        SubMenuAjudaTer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_HOME, java.awt.event.InputEvent.CTRL_MASK));
        SubMenuAjudaTer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubMenuAjudaTer.setText("Termos de Uso");
        SubMenuAjudaTer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        AbaMenuAju.add(SubMenuAjudaTer);

        jMenuBar1.add(AbaMenuAju);

        jMenu8.setForeground(new java.awt.Color(0, 0, 153));
        jMenu8.setText("|");
        jMenu8.setEnabled(false);
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuBar1.add(jMenu8);
        jMenuBar1.add(jMenu1);

        AbaMenuSair1.setBackground(new java.awt.Color(204, 204, 204));
        AbaMenuSair1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        AbaMenuSair1.setText("Usuário:");
        AbaMenuSair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbaMenuSair1.setEnabled(false);
        AbaMenuSair1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuBar1.add(AbaMenuSair1);

        lblUsuario.setBackground(new java.awt.Color(204, 204, 204));
        lblUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        lblUsuario.setForeground(new java.awt.Color(0, 0, 102));
        lblUsuario.setText(".................");
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuBar1.add(lblUsuario);

        jMenu9.setForeground(new java.awt.Color(0, 0, 153));
        jMenu9.setText("|    ");
        jMenu9.setEnabled(false);
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuBar1.add(jMenu9);

        AbaMenuSair.setBackground(new java.awt.Color(204, 204, 204));
        AbaMenuSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        AbaMenuSair.setText("Sair");
        AbaMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbaMenuSair.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        btnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        btnSair.setSelected(true);
        btnSair.setText("Sair do Sistema");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        AbaMenuSair.add(btnSair);

        jMenuBar1.add(AbaMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Login() {
        String nome;
        nome = txtLogin.getText();
        lblUsuario.setText(nome);
    }

    private void SubMenuCadEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuCadEmpActionPerformed
        IFrmCadCliJuridico i = new IFrmCadCliJuridico();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true); 
    }//GEN-LAST:event_SubMenuCadEmpActionPerformed
    private void SubMenuCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuCadUsuActionPerformed
      IFrmCadUsuario i = new IFrmCadUsuario();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubMenuCadUsuActionPerformed

    private void SubMenuCadSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuCadSerActionPerformed
        IFrmServico i = new IFrmServico();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubMenuCadSerActionPerformed

    private void SubMenuCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuCadFunActionPerformed
        IFrmCadFuncionario i = new IFrmCadFuncionario();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true); 
    }//GEN-LAST:event_SubMenuCadFunActionPerformed

    private void SubMenuCadVeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuCadVeiActionPerformed
        IFrmCadVeiculo i = new IFrmCadVeiculo();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubMenuCadVeiActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void SubServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubServicoActionPerformed
        IFrmConServico i = new IFrmConServico();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubServicoActionPerformed

    private void SubVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubVeiculoActionPerformed
        IFrmConVeiculo i = new IFrmConVeiculo();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubVeiculoActionPerformed

    private void SubFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubFuncionarioActionPerformed
         IFrmConFuncionario i = new IFrmConFuncionario();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubFuncionarioActionPerformed

    private void SubEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubEmpresaActionPerformed
        IFrmConEmpresaPJ i = new IFrmConEmpresaPJ();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubEmpresaActionPerformed

    private void SubMenuRelSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuRelSerActionPerformed
       IFrmRelServico i = new IFrmRelServico();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubMenuRelSerActionPerformed

    private void SubMenuRelGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuRelGasActionPerformed
        IFrmRelGastos i = new IFrmRelGastos();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubMenuRelGasActionPerformed

    private void SubMenuRelLucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuRelLucActionPerformed
        IFrmRelLucro i = new IFrmRelLucro();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_SubMenuRelLucActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IFmCadGastos i = new IFmCadGastos();
        Desktop.add(i);
        int x = (Desktop.getWidth()/2)-i.getWidth()/2;
        int y = (Desktop.getHeight()/2)-i.getHeight()/2;
        i.setLocation(x, y);
        i.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    String pega;
    
    private void PegarDataHora() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(
                new Runnable() {
            public void run() {
                pega = (new SimpleDateFormat("EE, dd/MM/yyyy HH:mm:ss").format(new Date()));
                lbldata.setText(pega);
            }
        }, 1, 1, TimeUnit.SECONDS);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (!"Nimbus".equals(info.getName())) {
                } else {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AbaMenuAju;
    private javax.swing.JMenu AbaMenuCad;
    private javax.swing.JMenu AbaMenuCon;
    private javax.swing.JMenu AbaMenuSair;
    private javax.swing.JMenu AbaMenuSair1;
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem SubEmpresa;
    private javax.swing.JMenuItem SubFuncionario;
    private javax.swing.JMenuItem SubMenuAjudaBus;
    private javax.swing.JMenuItem SubMenuAjudaInd;
    private javax.swing.JMenuItem SubMenuAjudaMan;
    private javax.swing.JMenuItem SubMenuAjudaTer;
    private javax.swing.JMenuItem SubMenuCadEmp;
    private javax.swing.JMenuItem SubMenuCadFun;
    private javax.swing.JMenuItem SubMenuCadSer;
    private javax.swing.JMenuItem SubMenuCadUsu;
    private javax.swing.JMenuItem SubMenuCadVei;
    private javax.swing.JMenu SubMenuRelCli;
    private javax.swing.JMenuItem SubMenuRelGas;
    private javax.swing.JMenuItem SubMenuRelLuc;
    private javax.swing.JMenuItem SubMenuRelSer;
    private javax.swing.JMenuItem SubServico;
    private javax.swing.JMenuItem SubVeiculo;
    private javax.swing.JRadioButtonMenuItem btnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JToolBar.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator21;
    private javax.swing.JToolBar.Separator jSeparator22;
    private javax.swing.JToolBar.Separator jSeparator23;
    private javax.swing.JToolBar.Separator jSeparator24;
    private javax.swing.JToolBar.Separator jSeparator25;
    private javax.swing.JToolBar.Separator jSeparator26;
    private javax.swing.JToolBar.Separator jSeparator27;
    private javax.swing.JToolBar.Separator jSeparator28;
    private javax.swing.JToolBar.Separator jSeparator29;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator30;
    private javax.swing.JToolBar.Separator jSeparator31;
    private javax.swing.JToolBar.Separator jSeparator32;
    private javax.swing.JToolBar.Separator jSeparator33;
    private javax.swing.JToolBar.Separator jSeparator34;
    private javax.swing.JToolBar.Separator jSeparator35;
    private javax.swing.JToolBar.Separator jSeparator36;
    private javax.swing.JToolBar.Separator jSeparator37;
    private javax.swing.JToolBar.Separator jSeparator38;
    private javax.swing.JToolBar.Separator jSeparator39;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator40;
    private javax.swing.JToolBar.Separator jSeparator41;
    private javax.swing.JToolBar.Separator jSeparator42;
    private javax.swing.JToolBar.Separator jSeparator43;
    private javax.swing.JToolBar.Separator jSeparator44;
    private javax.swing.JToolBar.Separator jSeparator45;
    private javax.swing.JToolBar.Separator jSeparator46;
    private javax.swing.JToolBar.Separator jSeparator47;
    private javax.swing.JToolBar.Separator jSeparator48;
    private javax.swing.JToolBar.Separator jSeparator49;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator50;
    private javax.swing.JToolBar.Separator jSeparator51;
    private javax.swing.JToolBar.Separator jSeparator52;
    private javax.swing.JToolBar.Separator jSeparator53;
    private javax.swing.JToolBar.Separator jSeparator54;
    private javax.swing.JToolBar.Separator jSeparator55;
    private javax.swing.JToolBar.Separator jSeparator56;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu lblUsuario;
    private javax.swing.JLabel lbldata;
    // End of variables declaration//GEN-END:variables
}
