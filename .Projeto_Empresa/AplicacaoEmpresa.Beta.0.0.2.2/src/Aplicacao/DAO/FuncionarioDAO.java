package Aplicacao.DAO;

import Aplicacao.aConnection.ConnectionDataBase;
import Aplicacao.CadMODEL.FuncionarioMODEL;
import Aplicacao.ConMODEL.RelConFunMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    private Connection connection;

    public FuncionarioDAO() {
        this.connection = new ConnectionDataBase().getcConnection();
    }

    public void adcionaFuncionario(FuncionarioMODEL Cad) {
        String sql = "Call InserirFuncionario (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
        try (PreparedStatement strConexao = connection.prepareStatement(sql)) {
            strConexao.setString(1, Cad.getNome());
            strConexao.setString(2, Cad.getSobrenome());
            strConexao.setString(3, Cad.getCPF());
            strConexao.setString(4, Cad.getRG());
            strConexao.setString(5, Cad.getSexo());
            strConexao.setString(6, Cad.getDataNasc());
            strConexao.setString(7, Cad.getEndereco());
            strConexao.setInt(8, Cad.getNumero());
            strConexao.setString(9, Cad.getComplemento());
            strConexao.setString(10, Cad.getBairro());
            strConexao.setString(11, Cad.getCidade());
            strConexao.setString(12, Cad.getEstado());
            strConexao.setString(13, Cad.getCargo());
            strConexao.setString(14, Cad.getSalario());
            strConexao.setString(15, Cad.getHabilitacao());
            strConexao.setString(16, Cad.getTelefone());
            strConexao.setString(17, Cad.getCelular());
            strConexao.setString(18, Cad.getEmail());
            strConexao.setString(19, Cad.getDataCad());
                                  
            strConexao.execute();
            strConexao.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void ConsFun(String campo, String inf, RelConFunMODEL ConsFun) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select * from Usuario where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ConsFun.setId_usuario(rs.getInt("id_Usuario"));
                ConsFun.setNome(rs.getString("Nome"));
                ConsFun.setSobrenome(rs.getString("sobrenome"));
                ConsFun.setCPF(rs.getString("cpf"));
                ConsFun.setRG(rs.getString("rg"));
                ConsFun.setSexo(rs.getString("sexo"));
                ConsFun.setDataNasc(rs.getString("data_nasc"));
                ConsFun.setEndereco(rs.getString("endereco"));
                ConsFun.setNumero(rs.getInt("Nº"));
                ConsFun.setComplemento(rs.getString("complemento"));
                ConsFun.setBairro(rs.getString("bairro"));
                ConsFun.setCidade(rs.getString("cidade"));
                ConsFun.setEstado(rs.getString("estado"));
                ConsFun.setCargo(rs.getString("cargo"));
                ConsFun.setSalario(rs.getString("salario"));
                ConsFun.setHabilitacao(rs.getString("habilitacao"));
                ConsFun.setTelefone(rs.getString("telefone"));
                ConsFun.setCelular(rs.getString("celular"));
                ConsFun.setEmail(rs.getString("email"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}
    public List<RelConFunMODEL> getLisFuncionario(String campo, String inf) {
        try {
            List<RelConFunMODEL> ListConsultaFun = new ArrayList<RelConFunMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select * from Usuario where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                               
                RelConFunMODEL funcionario = new RelConFunMODEL();
                
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSobrenome(rs.getString("sobrenome"));
                funcionario.setCPF(rs.getString("cpf"));
                funcionario.setRG(rs.getString("rg"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setDataNasc(rs.getString("data_nasc"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setNumero(rs.getInt("Nº"));
                funcionario.setComplemento(rs.getString("complemento"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setEstado(rs.getString("estado"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getString("salario"));
                funcionario.setHabilitacao(rs.getString("habilitacao"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setEmail(rs.getString("email"));
                
                
                ListConsultaFun.add(funcionario);
            }
            rs.close();
            stmt.close();
            return ListConsultaFun;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}
    public void removerFuncionario(RelConFunMODEL f){
        try {
            PreparedStatement stmt = this.connection.
                    prepareStatement("delete from Usuario where Id_Usuario=?");
            stmt.setInt(1, f.getId_usuario());
            
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void alterarFuncionario(RelConFunMODEL altFun){
        String sql ="update Usuario set Nome=?,"+"sobrenome=?,"+"cpf=?,"+"rg=?,"+ "sexo=?,"+"data_nasc=?,"
                + " endereco=?,"+"Nº=?,"+"complemento=?,"+"bairro=?,"+"cidade=?,"+"estado=?,"+"cargo=?,"
                +" salario=?,"+"habilitacao=?,"+"telefone=?,"+"celular=?,"+"email=?"
                + " where id_Usuario=?;";
        
        try {
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1, altFun.getNome());
            stmt.setString(2, altFun.getSobrenome());
            stmt.setString(3, altFun.getCPF());
            stmt.setString(4, altFun.getRG());
            stmt.setString(5, altFun.getSexo());
            stmt.setString(6, altFun.getDataNasc());
            stmt.setString(7, altFun.getEndereco());
            stmt.setInt(8, altFun.getNumero());
            stmt.setString(9, altFun.getComplemento());
            stmt.setString(10, altFun.getBairro());
            stmt.setString(11, altFun.getCidade());
            stmt.setString(12, altFun.getEstado());
            stmt.setString(13, altFun.getCargo());
            stmt.setString(14, altFun.getSalario());
            stmt.setString(15, altFun.getHabilitacao());
            stmt.setString(16, altFun.getTelefone());
            stmt.setString(17, altFun.getCelular());
            stmt.setString(18, altFun.getEmail());
            stmt.setInt(19, altFun.getId_usuario());
            
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
            
        }
        
}
}
