
package Aplicacao.aConnection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {
   //Criando Conexão
    
     public Connection getcConnection(){
   System.out.println("Conectado ao Banco de Dados");
   try{
       return 
     DriverManager.getConnection("jdbc:mysql://localhost/db_empresa","root","");
   }catch(SQLException e){
     throw new RuntimeException(e);
    }
   }
    public  static void main(String[]args){
      new ConnectionDataBase().getcConnection();
        System.out.println("Conexão Criada com Sucesso");
    }
}
