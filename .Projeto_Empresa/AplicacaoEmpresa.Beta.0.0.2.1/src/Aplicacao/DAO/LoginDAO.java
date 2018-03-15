
package Aplicacao.DAO;

//Importação de classe
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Aplicativo.FrmPrincipais.FrmMenu;
import Aplicacao.aConnection.ConnectionDataBase;
import Aplicacao.CadMODEL.CadLogMODEL;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO{
    
    private Connection connection;
        public LoginDAO(){
          this.connection = new ConnectionDataBase().getcConnection();
        }
        public void adciona(CadLogMODEL Login){
            String sql = "insert into usuariologin"+
                         "(nome,login,senha,cpf,email,status,dataCadastro)"+
                         "values (?,?,?,?,?,?,?)";         
            try(PreparedStatement strConexao = connection.prepareStatement(sql)){
                strConexao.setString(1,Login.getNome());
                strConexao.setString(2,Login.getLogin());
                strConexao.setString(3,Login.getSenha());
                strConexao.setString(4,Login.getCpf());
                strConexao.setString(5,Login.getEmail());
                strConexao.setString(6,Login.getStatus());
                strConexao.setString(7,Login.getDataCadastro());                
                strConexao.execute();
                strConexao.close();
            }catch(Exception e){         
                throw  new RuntimeException(e);              
             }
        }
        public void ConsultarLogin(CadLogMODEL consultar){
            try{
             String sql = "select*from usuariologin where id_Login";        
             PreparedStatement stmt = this.connection.prepareStatement(sql);             
             ResultSet rs = stmt.executeQuery();
                   while (rs.next()){
                     if(consultar.getLogin().equals(rs.getString("login")) && consultar.getSenha().equals(rs.getString("senha"))){
                         FrmMenu abrir = new FrmMenu();
                         abrir.setVisible(true);                        
                   }else{
                     }
                   }rs.close();
              stmt.close();
            }catch(SQLException e){
               throw  new RuntimeException(e);
            }
        }
         
        public void alterar(CadLogMODEL Login){
            String sql = "update usuariologin set nome=?,"+"login=?,"+"senha=?,"+"email=?,"+"status=?,"+"dataCadastro=?"+" where id_Login=?;";
            try(PreparedStatement strCo = connection.prepareStatement(sql)){
                strCo.setString(1,Login.getNome());
                strCo.setString(2,Login.getLogin());
                strCo.setString(3,Login.getSenha());
                strCo.setString(4,Login.getEmail());
                strCo.setString(5,Login.getStatus());
                strCo.setString(6,Login.getDataCadastro());
                strCo.setInt(7,Login.getId_Login());
                strCo.execute();
                strCo.close();
            }catch(Exception e){         
                throw  new RuntimeException(e);              
             }
        }
        public List<CadLogMODEL> getLista(String campo, String inf){
         try{
            List<CadLogMODEL> cadastros= new ArrayList<CadLogMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
              "select*from usuariologin where "+campo+" like '%"+inf+"%'" );
            ResultSet rs = stmt.executeQuery();
             while (rs.next()){
                CadLogMODEL cad = new  CadLogMODEL();
                cad.setId_Login(rs.getInt("id_Login"));
                cad.setNome(rs.getString("nome"));
                cad.setCpf(rs.getString("cpf"));
                cad.setLogin(rs.getString("login"));
                cad.setEmail(rs.getString("email"));
                cad.setDataCadastro(rs.getString("dataCadastro")); 
                cad.setSenha(rs.getString("senha"));
                cad.setStatus(rs.getString("status")); 
                cadastros.add(cad);
             }
             rs.close();
             stmt.close();
             return cadastros;
         }catch(SQLException e){
         throw  new RuntimeException(e);
         }
        }
        public void Consultar(String campo, String inf,CadLogMODEL usuario){
         try{
            PreparedStatement stmt = this.connection.prepareStatement(
            "select*from usuariologin where "+campo+" like '%"+inf+"%'" );
            ResultSet rs = stmt.executeQuery();
             while (rs.next()){
                usuario.setId_Login(rs.getInt("id_Login"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setLogin(rs.getString("login"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setStatus(rs.getString("status"));
                usuario.setDataCadastro(rs.getString("dataCadastro"));
             }
             rs.close();
             stmt.close();
          
         }catch(SQLException e){
         throw  new RuntimeException(e);
         }
}
}
