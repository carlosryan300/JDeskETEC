package Aplicacao.DAO;

import Aplicacao.CadMODEL.CadLogMODEL;
import Aplicacao.aConnection.ConnectionDataBase;
import Aplicacao.CadMODEL.CadVeiEmpMODEL;
import Aplicacao.ConMODEL.RelConVeiMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class VeiculoEmpDAO {
    //Inicio de Classe  

    private Connection connection;

    public VeiculoEmpDAO() {
        this.connection = new ConnectionDataBase().getcConnection();
    }

    public void adcionaVeiculo(CadVeiEmpMODEL Cad) {
        String sql = "Call InserirVeiculo (?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement strConexao = connection.prepareStatement(sql)) {
            strConexao.setString(1, Cad.getPlaca());
            strConexao.setString(2, Cad.getModelo());
            strConexao.setString(3, Cad.getMarca());
            strConexao.setString(4, Cad.getCor());
            strConexao.setString(5, Cad.getChassi());
            strConexao.setString(6, Cad.getCatVei());
            strConexao.setString(7, Cad.getCatHab());

            SimpleDateFormat formatVei = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date DataVei = new java.sql.Date(formatVei.parse(Cad.getAnoVei()).getTime());
            strConexao.setDate(8, DataVei);

            strConexao.setDouble(9, Cad.getLimPeso());

            SimpleDateFormat formatDataCad = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date DataCad = new java.sql.Date(formatDataCad.parse(Cad.getAnoVei()).getTime());
            strConexao.setDate(10, DataCad);

            strConexao.execute();
            strConexao.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarVei(RelConVeiMODEL Alter) {
        String sql = "update veiculoempresa set placa=?," + "modelo=?," + "marca=?," + "cor=?," + "chassi=?," + "categoria_Vei=?"
                + "categoria_Hab=?" + "LimitePeso=?" + "anoVeiculo=?" + "DataCad=?" + " where id_VeiculoEmp=?;";
        try (PreparedStatement strCo = connection.prepareStatement(sql)) {
            strCo.setString(1, Alter.getPlaca());
            strCo.setString(2, Alter.getModelo());
            strCo.setString(3, Alter.getMarca());
            strCo.setString(4, Alter.getCor());
            strCo.setString(5, Alter.getChassi());
            strCo.setString(6, Alter.getCatVei());
            strCo.setString(7, Alter.getCatHab());
            strCo.setDouble(8, Alter.getLimPeso());
            
            SimpleDateFormat AnoVei = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date DataAnoVei = new java.sql.Date(AnoVei.parse(Alter.getAnoVei()).getTime());
            strCo.setDate(9, DataAnoVei);
            
            SimpleDateFormat SimpleDataCad = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date DataCad = new java.sql.Date(SimpleDataCad.parse(Alter.getDataCad()).getTime());
            strCo.setDate(10, DataCad);
            strCo.setInt(11, Alter.getCod());

            strCo.execute();
            strCo.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<RelConVeiMODEL> getLista(String campo, String inf) {
        try {
            List<RelConVeiMODEL> ListConsultaVei = new ArrayList<RelConVeiMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from veiculoempresa where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                               
                RelConVeiMODEL cad = new RelConVeiMODEL();
                cad.setCod(rs.getInt("id_VeiculoEmp"));
                cad.setPlaca(rs.getString("placa"));
                cad.setModelo(rs.getString("modelo"));
                cad.setMarca(rs.getString("marca"));
                cad.setCor(rs.getString("cor"));
                cad.setChassi(rs.getString("chassi"));
                cad.setCatVei(rs.getString("categoria_Vei"));
                cad.setCatHab(rs.getString("categoria_Hab"));
                cad.setAnoVei(rs.getString("anoVeiculo"));
                cad.setLimPeso(rs.getDouble("LimitePeso"));
                cad.setDataCad(rs.getString("DataCad"));
                ListConsultaVei.add(cad);
            }
            rs.close();
            stmt.close();
            return ListConsultaVei;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Consultar(String campo, String inf, RelConVeiMODEL ConsultaVei) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from veiculoempresa where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ConsultaVei.setCod(rs.getInt("id_VeiculoEmp"));
                ConsultaVei.setPlaca(rs.getString("placa"));
                ConsultaVei.setModelo(rs.getString("modelo"));
                ConsultaVei.setMarca(rs.getString("marca"));
                ConsultaVei.setCor(rs.getString("cor"));
                ConsultaVei.setChassi(rs.getString("chassi"));
                ConsultaVei.setCatVei(rs.getString("categoria_Vei"));
                ConsultaVei.setCatHab(rs.getString("categoria_Hab"));
                ConsultaVei.setAnoVei(rs.getString("anoVeiculo"));
                ConsultaVei.setLimPeso(rs.getDouble("LimitePeso"));
                ConsultaVei.setDataCad(rs.getString("DataCad"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}//Fim de Classe 
