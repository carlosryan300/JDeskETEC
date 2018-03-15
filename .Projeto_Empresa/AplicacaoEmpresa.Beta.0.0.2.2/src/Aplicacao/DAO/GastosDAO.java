package Aplicacao.DAO;

import Aplicacao.aConnection.ConnectionDataBase;
import Aplicacao.CadMODEL.GastosMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap; 
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class GastosDAO {

    private Connection connection;

    public GastosDAO() {
        this.connection = new ConnectionDataBase().getcConnection();
    }

    public void adciona(GastosMODEL modelo) {
        String sql = "insert into Gastos"
                + "(tipo,descricao,valor,dataCad)" + "values (?,?,?,?)";
        try (PreparedStatement strConexao = connection.prepareStatement(sql)) {
            strConexao.setString(1, modelo.getTipo());
            strConexao.setString(2, modelo.getDescricao());
            strConexao.setDouble(3, modelo.getValor());

            //SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
            //java.sql.Date converte = (modelo.getDataCad());
            //String value = formatar.format(converte);
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String n = modelo.getDataCad();
            java.sql.Date data = new java.sql.Date(format.parse(n).getTime());

            strConexao.setDate(4, data);
            strConexao.execute();
            strConexao.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private java.sql.Date value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void gerarRel(String Inicio, String Fim, GastosMODEL G) {

        String Arquivo = "src/Relatorio/RelatorioGastos.jasper";
        try {
            String sql = "select * from gastos  where datacad between '" + Inicio + "' and '" + Fim + "'";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            JRResultSetDataSource jrRs = new JRResultSetDataSource(rs);

            Map<String, Object> Parametro = new HashMap<String, Object>();
            Parametro.put("DataInicio", Inicio);
            Parametro.put("DataFim", Fim);
            JasperPrint Print = JasperFillManager.fillReport(Arquivo, Parametro, jrRs);
            JasperViewer jv = new JasperViewer(Print, false);
            jv.setVisible(true);
            jv.toFront();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro sql" + e);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao chamar" + ex);
        }
    }

    public void Consultar(String campo, String inf, GastosMODEL model) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("select*from Gastos where " + campo + " like '%" + inf + "%'");
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                model.setCod(rs.getInt("ID"));
                model.setTipo(rs.getString("tipo"));
                model.setDescricao(rs.getString("descricao"));
                model.setValor(rs.getDouble("valor"));
                model.setDataCad(rs.getString("datacad"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
     public List<GastosMODEL> getLista(String campo, String inf){
         try{
            List<GastosMODEL> cadastros= new ArrayList<GastosMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement("select*from gastos where "+campo+" like '%"+inf+"%'" );
            ResultSet rs = stmt.executeQuery();
             while (rs.next()){
                GastosMODEL con = new  GastosMODEL();
                con.setCod(rs.getInt("ID"));
                con.setTipo(rs.getString("tipo"));
                con.setDescricao(rs.getString("descricao"));
                con.setValor(rs.getDouble("valor"));
                con.setDataCad(rs.getString("datacad"));
                cadastros.add(con);
             }
             rs.close();
             stmt.close();
             return cadastros;
         }catch(SQLException e){
         throw  new RuntimeException(e);
         }
        }
     public List<GastosMODEL> getListData(String Inicio, String Fim){
         try{
            List<GastosMODEL> cadastros= new ArrayList<GastosMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from gastos  where datacad between '" + Inicio + "' and '" + Fim + "'" );
            ResultSet rs = stmt.executeQuery();
             while (rs.next()){
                GastosMODEL con = new  GastosMODEL();
                
                con.setCod(rs.getInt("ID"));
                con.setTipo(rs.getString("tipo"));
                con.setDescricao(rs.getString("descricao"));
                con.setValor(rs.getDouble("valor"));
                con.setDataCad(rs.getString("datacad"));
                cadastros.add(con);
             }
             rs.close();
             stmt.close();
             return cadastros;
         }catch(SQLException e){
         throw  new RuntimeException(e);
         }
        }
}
