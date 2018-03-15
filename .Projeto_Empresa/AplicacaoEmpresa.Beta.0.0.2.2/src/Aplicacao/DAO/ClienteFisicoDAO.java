package Aplicacao.DAO;

import Aplicacao.CadMODEL.ClientePFMODEL;
import Aplicacao.aConnection.ConnectionDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lab
 */
public class ClienteFisicoDAO {

    private Connection connection;

    public ClienteFisicoDAO() {
        this.connection = new ConnectionDataBase().getcConnection();
    }

    public void adcionaClienteFisico(ClientePFMODEL Cad) {
        String sql = "Call InserirClienteFisico (?,?,?,?,?,?,?)";

        try (PreparedStatement strConexao = connection.prepareStatement(sql)) {
            strConexao.setString(1, Cad.getNome());
            strConexao.setString(2, Cad.getSobrenome());
            strConexao.setString(3, Cad.getApelido());
            strConexao.setString(4, Cad.getCPF());
            strConexao.setString(5, Cad.getTelefone());
            strConexao.setString(6, Cad.getCelular());
            strConexao.setString(7, Cad.getDataCad());

            strConexao.execute();
            strConexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void ConsFun(String campo, String inf, ClientePFMODEL ConsFun) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select * from ClientePF where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ConsFun.setId_cliente_pf(rs.getInt("id_cliente_pf"));
                ConsFun.setNome(rs.getString("Nome"));
                ConsFun.setSobrenome(rs.getString("sobrenome"));
                ConsFun.setApelido(rs.getString("apelido"));
                ConsFun.setCPF(rs.getString("cpf"));
                ConsFun.setTelefone(rs.getString("telefone"));
                ConsFun.setCelular(rs.getString("celular"));
                ConsFun.setDataCad(rs.getString("dataCadastro"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientePFMODEL> getLisCliFisico(String campo, String inf) {
        try {
            List<ClientePFMODEL> ListConsultaFun = new ArrayList<ClientePFMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select * from ClientePF where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                ClientePFMODEL f = new ClientePFMODEL();
                f.setId_cliente_pf(Integer.parseInt("id_cliente_PF"));
                f.setNome(rs.getString("nome"));
                f.setSobrenome(rs.getString("sobrenome"));
                f.setCPF(rs.getString("cpf"));
                f.setApelido(rs.getString("apelido"));
                f.setTelefone(rs.getString("telefone"));
                f.setCelular(rs.getString("celular"));
                f.setDataCad(rs.getString("dataCadastro"));

                ListConsultaFun.add(f);
            }
            rs.close();
            stmt.close();
            return ListConsultaFun;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void removerFuncionario(ClientePFMODEL f) {
        try {
            PreparedStatement stmt = this.connection.
                    prepareStatement("delete from ClientePF where id_cliente_PF=?");
            stmt.setInt(1, f.getId_cliente_pf());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarFuncionario(ClientePFMODEL altFun) {
        String sql = "update Usuario set Nome=?," + "sobrenome=?," + "cpf=?,"
                + "celular=?," + "telefone=?, "+" DataCadastro=? "
                + " where id_cliente_PF=?;";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, altFun.getNome());
            stmt.setString(2, altFun.getSobrenome());
            stmt.setString(3, altFun.getApelido());
            stmt.setString(4, altFun.getCPF());
            stmt.setString(5, altFun.getTelefone());
            stmt.setString(6, altFun.getCelular());
            stmt.setString(7, altFun.getDataCad());
            stmt.setInt(8, altFun.getId_cliente_pf());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            ///throw new RuntimeException(e);
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public List<ClientePFMODEL> lista() {
        try {
            List<ClientePFMODEL> ListConsultaFun = new ArrayList<ClientePFMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select ClientePF.nome from ClientePF ");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                ClientePFMODEL f = new ClientePFMODEL();
                
                f.setNome(rs.getString("nome"));
                f.setSobrenome(rs.getString("sobrenome"));
                f.setCPF(rs.getString("cpf"));
                f.setApelido(rs.getString("apelido"));
                f.setTelefone(rs.getString("telefone"));
                f.setCelular(rs.getString("celular"));
                f.setDataCad(rs.getString("dataCadastro"));

                ListConsultaFun.add(f);
            }
            rs.close();
            stmt.close();
            return ListConsultaFun;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
