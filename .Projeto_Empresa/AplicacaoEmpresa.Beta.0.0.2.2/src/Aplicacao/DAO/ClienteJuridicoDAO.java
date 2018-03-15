package Aplicacao.DAO;

import Aplicacao.aConnection.ConnectionDataBase;
import Aplicacao.CadMODEL.ClientePJMODEL;
import Aplicacao.CadMODEL.FuncionarioMODEL;
import Aplicacao.ConMODEL.RelConEmpMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteJuridicoDAO {

    private Connection connection;

    public ClienteJuridicoDAO() {
        this.connection = new ConnectionDataBase().getcConnection();
    }

    public void adcionaClienteJur(ClientePJMODEL Cad) {
        String sql = "Call InserirClienteJuridico (?,?,?,?,?,?,?)";

        try (PreparedStatement strConexao = connection.prepareStatement(sql)) {
            strConexao.setString(1, Cad.getRazaoSocial());
            strConexao.setString(2, Cad.getCNPJ());
            strConexao.setString(3, Cad.getRamo());
            strConexao.setString(4, Cad.getPorte());
            strConexao.setString(5, Cad.getTelPrin());
            strConexao.setString(6, Cad.getTelSec());
            strConexao.setString(7, Cad.getDataCad());

            strConexao.execute();
            strConexao.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void Consultar(String campo, String inf, RelConEmpMODEL ConsultaEmp) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from ClientePJ where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ConsultaEmp.setId_Empresa(rs.getInt("id_cliente_PJ"));
                ConsultaEmp.setRazaoSocial(rs.getString("razaoSocial"));
                ConsultaEmp.setCNPJ(rs.getString("cnpj"));
                ConsultaEmp.setRamo(rs.getString("ramo"));
                ConsultaEmp.setPorte(rs.getString("porte"));
                ConsultaEmp.setTelPrin(rs.getString("telefone1"));
                ConsultaEmp.setTelSec(rs.getString("telefone2"));
                ConsultaEmp.setDataCad(rs.getString("dataCad"));

            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<RelConEmpMODEL> getListaEmpresa(String campo, String inf) {
        try {
            List<RelConEmpMODEL> ListConsultaEmp = new ArrayList<RelConEmpMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select * from ClientePJ where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                RelConEmpMODEL empresa = new RelConEmpMODEL();

                empresa.setRazaoSocial(rs.getString("razaoSocial"));
                empresa.setCNPJ(rs.getString("cnpj"));
                empresa.setRamo(rs.getString("ramo"));
                empresa.setPorte(rs.getString("porte"));
                empresa.setTelPrin(rs.getString("telefone1"));
                empresa.setTelSec(rs.getString("telefone2"));
                empresa.setDataCad(rs.getString("dataCad"));

                ListConsultaEmp.add(empresa);
            }
            rs.close();
            stmt.close();
            return ListConsultaEmp;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void removerEmpresa(RelConEmpMODEL emp) {
        try {
            PreparedStatement stmt = this.connection.
                    prepareStatement("delete from ClientePJ where id_cliente_PJ=?");
            stmt.setInt(1, emp.getId_Empresa());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarEmpresa(RelConEmpMODEL altEmp) {
        String sql = "update ClientePJ set razaoSocial=?," + "cnpj=?," + "ramo=?," + "porte=?," + "telefone1=?," + "telefone2=?,"
                + " dataCad=?" + " where id_cliente_PJ=?;";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, altEmp.getId_Empresa());
            stmt.setString(2, altEmp.getRazaoSocial());
            stmt.setString(3, altEmp.getCNPJ());
            stmt.setString(4, altEmp.getRamo());
            stmt.setString(5, altEmp.getPorte());
            stmt.setString(6, altEmp.getTelPrin());
            stmt.setString(7, altEmp.getTelSec());
            stmt.setString(8, altEmp.getDataCad());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            ///throw new RuntimeException(e);
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public List<RelConEmpMODEL> lista() {
        try {
            List<RelConEmpMODEL> ListConsultaFun = new ArrayList<RelConEmpMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select ClientePJ.razaoSocial from ClientePJ ");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                RelConEmpMODEL empresa = new RelConEmpMODEL();
                //empresa.setId_Empresa(rs.getInt("id_cliente_PJ"));
                empresa.setRazaoSocial(rs.getString("razaoSocial"));
                //empresa.setCNPJ(rs.getString("cnpj"));
                //empresa.setRamo(rs.getString("ramo"));
                //empresa.setPorte(rs.getString("porte"));
               // empresa.setTelPrin(rs.getString("telefone1"));
               // empresa.setTelSec(rs.getString("telefone2"));
               // empresa.setDataCad(rs.getString("dataCadastro"));

                ListConsultaFun.add(empresa);
            }
            rs.close();
            stmt.close();
            return ListConsultaFun;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
