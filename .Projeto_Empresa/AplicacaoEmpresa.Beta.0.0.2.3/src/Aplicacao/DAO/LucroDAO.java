/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao.DAO;

import Aplicacao.ConMODEL.LucroMODEL;
import Aplicacao.aConnection.ConnectionDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Carla
 */
public class LucroDAO {

    private Connection connection;

    public LucroDAO() {
        this.connection = new ConnectionDataBase().getcConnection();
    }

    //Relatório de Lucros.
    public void relatorioLucros() {
        try {
            String sql = "select * from lucro ";

            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            JRResultSetDataSource ds = new JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/Relatorio/relLucros.jasper", new HashMap(), ds);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
            viewer.toFront();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public void Consultar(LucroMODEL model) {
        try {
            PreparedStatement stmt
                    = this.connection.prepareStatement("select * from lucro ");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                model.setvCobrado(rs.getDouble("vc"));
                model.setValor(rs.getDouble("v"));
                model.setTotal(rs.getDouble("Total"));

            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<LucroMODEL> getLista() {
        try {
            List<LucroMODEL> cadastros = new ArrayList<LucroMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from lucro ");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                LucroMODEL model = new LucroMODEL();
                model.setvCobrado(rs.getDouble("vc"));
                model.setValor(rs.getDouble("v"));
                model.setTotal(rs.getDouble("Total"));
                cadastros.add(model);
            }
            rs.close();
            stmt.close();
            return cadastros;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
