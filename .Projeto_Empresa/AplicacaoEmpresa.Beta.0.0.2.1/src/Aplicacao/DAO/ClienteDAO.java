package Aplicacao.DAO;

import Aplicacao.aConnection.ConnectionDataBase;
import Aplicacao.CadMODEL.ClientePJMODEL;
import Aplicacao.CadMODEL.ServicoMODEL;
import Aplicacao.ConMODEL.ConClienteMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection connection;

    public ClienteDAO() {
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

    public List<ConClienteMODEL> getLista(String campo, String inf) {
        String ind = "";
        if (campo.equals("clientepj")) {
            ind = "razaoSocial";
        } else {
            ind = "nome";
        }
        try {
            List<ConClienteMODEL> cadastros = new ArrayList<ConClienteMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement("select distinct * from " + campo + " where " + ind + " like '%" + inf + "%';");
            ResultSet rs = stmt.executeQuery();
            if (campo.equals("clientepj")) {
                while (rs.next()) {
                    ConClienteMODEL con = new ConClienteMODEL();
                    con.setID(rs.getInt("id_cliente_PJ"));
                    con.setRazaoSocial(rs.getString("razaoSocial"));
                    con.setCNPJ(rs.getString("cnpj"));
                    con.setRamo(rs.getString("ramo"));
                    con.setPorte(rs.getString("porte"));
                    con.setTelPrin(rs.getString("telefone1"));
                    con.setTelSec(rs.getString("telefone2"));
                    con.setDataCad(rs.getString("dataCad"));
                    cadastros.add(con);
                }
            } else if (campo.equals("clientepf")) {
                while (rs.next()) {
                    ConClienteMODEL con = new ConClienteMODEL();
                    con.setID(rs.getInt("id_cliente_PF"));
                    con.setRazaoSocial(rs.getString("nome"));
                    con.setCNPJ(rs.getString("sobrenome"));
                    con.setRamo(rs.getString("apelido"));
                    con.setPorte(rs.getString("cpf"));
                    con.setTelPrin(rs.getString("celular"));
                    con.setTelSec(rs.getString("telefone"));
                    con.setDataCad(rs.getString("dataCad"));
                    cadastros.add(con);
                }
            }
            rs.close();
            stmt.close();
            return cadastros;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Consulta(String campo, String inf, ConClienteMODEL con) {
        String ind = "";
        if (campo.equals("clientepj")) {
            ind = "razaoSocial";
        } else {
            ind = "nome";
        }
        try {
            PreparedStatement stmt = this.connection.prepareStatement("select distinct * from " + campo + " where " + ind + " like '%" + inf + "%';");
            ResultSet rs = stmt.executeQuery();
            if (campo.equals("clientepj")) {
                while (rs.next()) {
                    con.setID(rs.getInt("id_cliente_PJ"));
                    con.setRazaoSocial(rs.getString("razaoSocial"));
                    con.setCNPJ(rs.getString("cnpj"));
                    con.setRamo(rs.getString("ramo"));
                    con.setPorte(rs.getString("porte"));
                    con.setTelPrin(rs.getString("telefone1"));
                    con.setTelSec(rs.getString("telefone2"));
                    con.setDataCad(rs.getString("dataCad"));
                }
            } else if (campo.equals("clientepf")) {
                while (rs.next()) {
                    con.setID(rs.getInt("id_cliente_PF"));
                    con.setRazaoSocial(rs.getString("nome"));
                    con.setCNPJ(rs.getString("sobrenome"));
                    con.setRamo(rs.getString("apelido"));
                    con.setPorte(rs.getString("cpf"));
                    con.setTelPrin(rs.getString("celular"));
                    con.setTelSec(rs.getString("telefone"));
                    con.setDataCad(rs.getString("dataCad"));
                }
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ServicoMODEL> CadList(String Campo, String inf) {

        String ind = null;
        if (Campo.equals("clientepj")) {
            ind = "razaoSocial";
        } else {
            ind = "nome";
        }
        try {
            List<ServicoMODEL> cad = new ArrayList<ServicoMODEL>();
            PreparedStatement sql = this.connection.prepareStatement("select * from " + Campo + " where " + ind + " like '%" + inf + "%';");
            ResultSet rs = sql.executeQuery();

            if (Campo.equals("clientepj")) {
                while (rs.next()) {
                    ServicoMODEL con = new ServicoMODEL();
                    con.setID(rs.getInt("id_cliente_PJ"));
                    con.setNome(rs.getString("razaoSocial"));
                    con.setSobrenome(rs.getString("cnpj"));
                    con.setApelido(rs.getString("ramo"));
                    con.setCPF(rs.getString("porte"));
                    con.setTelefone(rs.getString("telefone1"));
                    con.setCelular(rs.getString("telefone2"));
                    con.setDataCadastro(rs.getString("dataCad"));
                    cad.add(con);
                }
            } else if (Campo.equals("clientepf")) {
                while (rs.next()) {
                    ServicoMODEL con = new ServicoMODEL();
                    con.setID(rs.getInt("id_cliente_pf"));
                    con.setNome(rs.getString("nome"));
                    con.setSobrenome(rs.getString("sobrenome"));
                    con.setApelido(rs.getString("apelido"));
                    con.setCPF(rs.getString("cpf"));
                    con.setTelefone(rs.getString("telefone"));
                    con.setCelular(rs.getString("celular"));
                    con.setDataCadastro(rs.getString("dataCad"));
                    cad.add(con);
                }
            }
            rs.close();
            sql.close();

            return cad;
        } catch (SQLException e) {
            throw new RuntimeException("msg" + e);
        }
    }

    public void Alterar(String mod, ConClienteMODEL c) {
        String ind = null;
        if (mod.equals("clientepj")) {
            ind = "razaoSocial";
        } else {
            ind = "nome";
        }
        String sqlFisico = "update " + mod + " set nome=?," + "sobrenome=?,"
                + "apelido=?," + "cpf=?," + "telefone=?,"
                + "celular=?" + "datacad=?," + " where  id_cliente_PF=?;";

        String sqlJuridico = "update " + mod + " set razaoSocial=?," + "cnpj=?,"
                + "ramo=?," + "porte=?," + "telefone1=?,"
                + "telefone2=?," + "datacad=?" + " where  id_cliente_PJ=?;";
        try {
            PreparedStatement stmt = connection.prepareStatement(sqlFisico);
            stmt.setString(1, c.getRazaoSocial());
            stmt.setString(2, c.getCNPJ());
            stmt.setString(3, c.getRamo());
            stmt.setString(4, c.getPorte());
            stmt.setString(5, c.getTelPrin());
            stmt.setString(6, c.getTelSec());
            
           // SimpleDateFormat formatVei = new SimpleDateFormat("dd/MM/yyyy");
           // java.sql.Date Data = new java.sql.Date(formatVei.parse(c.getDataCad()).getTime());
            
            stmt.setString(7, c.getDataCad());
            stmt.setInt(8, c.getID());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement stmt = connection.prepareStatement(sqlJuridico);
            stmt.setString(1, c.getRazaoSocial());
            stmt.setString(2, c.getCNPJ());
            stmt.setString(3, c.getRamo());
            stmt.setString(4, c.getPorte());
            stmt.setString(5, c.getTelPrin());
            stmt.setString(6, c.getTelSec());  
            
            //SimpleDateFormat formatVei = new SimpleDateFormat("dd/MMyyyy");
            //java.sql.Date Data = new java.sql.Date(formatVei.parse(c.getDataCad()).getTime());            
            stmt.setString(7, c.getDataCad());
            
            stmt.setInt(8, c.getID());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
