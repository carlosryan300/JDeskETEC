package Aplicacao.DAO;

import Aplicacao.aConnection.ConnectionDataBase;
import Aplicacao.CadMODEL.ServicoMODEL;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.fill.JRResourcesFillUtil;
import net.sf.jasperreports.view.JasperViewer;

public class ServicoDAO {

    private Connection connection;

    public ServicoDAO() {
        this.connection = new ConnectionDataBase().getcConnection();
    }

    public void adcionaServico(ServicoMODEL model) {
        String sql = "Call InserirServico (?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement strConexao = connection.prepareStatement(sql)) {
            strConexao.setString(1, model.getMarca());
            strConexao.setString(2, model.getModelo());
            strConexao.setString(3, model.getCor());
            strConexao.setString(4, model.getPlaca());
            strConexao.setString(5, model.getTipoServico());
            strConexao.setString(6, model.getValorCobrado());
            strConexao.setString(7, model.getDataCadastro());
            strConexao.setString(8, model.getId_cliente_PF());
            strConexao.setString(9, model.getId_cliente_PJ());
            strConexao.setString(10, model.getId_marca());
            strConexao.setString(11, model.getId_modelo());

            strConexao.execute();
            strConexao.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(ServicoMODEL model) {
        String sql = "update servico inner join Marca on Marca.id_marca=servico.tbl_marca_id_marca "
                + "inner join modelo  on modelo.id_modelo=servico.tbl_modelo_id_modelo "
                + "set Marca=?,"+"modelo=?,"+"cor=?,"+"placa=?,"+"TipoServico=?,"+"valorCobrado=?,"
                +"data_servico=?"+ " where id_Servico=?";
        try (PreparedStatement strConexao = connection.prepareStatement(sql)) {

            strConexao.setString(1, model.getMarca());
            strConexao.setString(2, model.getModelo());
            strConexao.setString(3, model.getCor());
            strConexao.setString(4, model.getPlaca());
            strConexao.setString(5, model.getTipoServico());
            strConexao.setString(6, model.getValorCobrado());
           // strConexao.setString(7, model.getDataCadastro());
            SimpleDateFormat SimpleDataCad = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date DataCad = new java.sql.Date(SimpleDataCad.parse(model.getDataCadastro()).getTime());
            
            strConexao.setDate(7, DataCad);
            //strConexao.setString(8, model.getId_cliente_PF());
            //strConexao.setString(9, model.getId_cliente_PJ());
            //strConexao.setString(10, model.getId_marca());
            //strConexao.setString(11, model.getId_modelo());
            strConexao.setInt(8,model.getID());

            strConexao.execute();
            strConexao.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void remover(ServicoMODEL model) {
        try {
            PreparedStatement stmt = this.connection.
                    prepareStatement("delete from servico where id_Servico=?");
            stmt.setInt(1, model.getID());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Consultar(String campo, String inf, ServicoMODEL model) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select ClientePF.Nome,ClientePF.Sobrenome,ClientePF.apelido,ClientePF.cpf,"
                    + "ClientePF.celular,ClientePF.telefone,Marca.Marca,"
                    + "modelo.modelo,modelo.cor, modelo.placa,servico.id_Servico, "
                    + "servico.TipoServico,servico.valorCobrado,data_servico from servico"
                    + " inner join ClientePF on ClientePF.id_cliente_PF=servico.tbl_cliente_PF_id_cliente_PF"
                    + " inner join Marca on Marca.id_marca=servico.tbl_marca_id_marca"
                    + " inner join modelo on modelo.id_modelo=servico.tbl_modelo_id_modelo where " + campo + " like '%" + inf + "%'"
            );

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                model.setID(rs.getInt("id_Servico"));
                model.setNome(rs.getString("ClientePF.Nome"));
                model.setSobrenome(rs.getString("ClientePF.sobrenome"));
                model.setApelido(rs.getString("ClientePF.apelido"));
                model.setCPF(rs.getString("ClientePF.cpf"));
                model.setCelular(rs.getString("ClientePF.celular"));
                model.setTelefone(rs.getString("ClientePF.telefone"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setCor(rs.getString("modelo.cor"));
                model.setPlaca(rs.getString("modelo.placa"));
                model.setTipoServico(rs.getString("TipoServico"));
                model.setValorCobrado(rs.getString("valorCobrado"));
                model.setDataCadastro(rs.getString("data_servico"));

            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Listar cliente físico 
    public List<ServicoMODEL> getLista(String campo, String inf) {
        try {
            List<ServicoMODEL> sm = new ArrayList<ServicoMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select ClientePF.Nome,ClientePF.Sobrenome,ClientePF.apelido,ClientePF.cpf,"
                    + "ClientePF.celular,ClientePF.telefone,Marca.Marca,"
                    + "modelo.modelo,modelo.cor, modelo.placa,servico.id_Servico,"
                    + "servico.TipoServico,servico.valorCobrado,data_servico from servico"
                    + " inner join ClientePF on ClientePF.id_cliente_PF=servico.tbl_cliente_PF_id_cliente_PF"
                    + " inner join Marca on Marca.id_marca=servico.tbl_marca_id_marca"
                    + " inner join modelo on modelo.id_modelo=servico.tbl_modelo_id_modelo where " + campo + " like '%" + inf + "%'"
            );

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ServicoMODEL model = new ServicoMODEL();
                model.setID(rs.getInt("id_Servico"));
                model.setNome(rs.getString("ClientePF.Nome"));
                model.setSobrenome(rs.getString("ClientePF.sobrenome"));
                model.setApelido(rs.getString("ClientePF.apelido"));
                model.setCPF(rs.getString("ClientePF.cpf"));
                model.setCelular(rs.getString("ClientePF.celular"));
                model.setTelefone(rs.getString("ClientePF.telefone"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setCor(rs.getString("modelo.cor"));
                model.setPlaca(rs.getString("modelo.placa"));
                model.setTipoServico(rs.getString("TipoServico"));
                model.setValorCobrado(rs.getString("valorCobrado"));
                model.setDataCadastro(rs.getString("data_servico"));

                sm.add(model);

            }
            rs.close();
            stmt.close();
            return sm;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Listar cliente físico por Data 
    public List<ServicoMODEL> getListaData(String data_ini, String data_fim) {
        try {
            List<ServicoMODEL> sm = new ArrayList<ServicoMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select ClientePF.Nome,ClientePF.Sobrenome,Marca.Marca,"
                    + "modelo.modelo,modelo.cor, modelo.placa,"
                    + "servico.TipoServico,servico.valorCobrado, servico.data_servico from servico"
                    + " inner join ClientePF on ClientePF.id_cliente_PF=servico.tbl_cliente_PF_id_cliente_PF"
                    + " inner join Marca on Marca.id_marca=servico.tbl_marca_id_marca"
                    + " inner join modelo on modelo.id_modelo=servico.tbl_modelo_id_modelo where data_servico between '" + data_ini + "' and '" + data_fim + "' order by data_servico"
            );

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ServicoMODEL model = new ServicoMODEL();
                model.setNome(rs.getString("ClientePF.Nome"));
                model.setSobrenome(rs.getString("ClientePF.sobrenome"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setCor(rs.getString("modelo.cor"));
                model.setPlaca(rs.getString("modelo.placa"));
                model.setTipoServico(rs.getString("TipoServico"));
                model.setValorCobrado(rs.getString("valorCobrado"));

                sm.add(model);

            }
            rs.close();
            stmt.close();
            return sm;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Listar Cliente PJ 

    public List<ServicoMODEL> getListaPJ(String campo, String inf) {
        try {
            List<ServicoMODEL> sm = new ArrayList<ServicoMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select ClientePJ.razaoSocial,ClientePJ.cnpj,Marca.Marca,"
                    + "modelo.modelo,modelo.cor, modelo.placa,"
                    + "servico.TipoServico,servico.valorCobrado from servico"
                    + " inner join ClientePJ on ClientePJ.id_cliente_PJ=servico.tbl_cliente_PJ_id_cliente_PJ"
                    + " inner join Marca on Marca.id_marca=servico.tbl_marca_id_marca"
                    + " inner join modelo on modelo.id_modelo=servico.tbl_modelo_id_modelo where " + campo + " like '%" + inf + "%'"
            );

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ServicoMODEL model = new ServicoMODEL();
                model.setRazaoSocial(rs.getString("ClientePJ.razaoSocial"));
                model.setCnpj(rs.getString("ClientePJ.cnpj"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setCor(rs.getString("modelo.cor"));
                model.setPlaca(rs.getString("modelo.placa"));
                model.setTipoServico(rs.getString("TipoServico"));
                model.setValorCobrado(rs.getString("valorCobrado"));

                sm.add(model);

            }
            rs.close();
            stmt.close();
            return sm;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    //Listar PJ por Data
    public List<ServicoMODEL> getListaDataPJ(String data_ini, String data_fim) {
        try {
            List<ServicoMODEL> sm = new ArrayList<ServicoMODEL>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select ClientePJ.razaoSocial,ClientePJ.cnpj,Marca.Marca,"
                    + "modelo.modelo,modelo.cor, modelo.placa,"
                    + "servico.TipoServico,servico.valorCobrado, servico.data_servico from servico"
                    + " inner join ClientePJ on ClientePJ.id_cliente_PJ=servico.tbl_cliente_PJ_id_cliente_PJ"
                    + " inner join Marca on Marca.id_marca=servico.tbl_marca_id_marca"
                    + " inner join modelo on modelo.id_modelo=servico.tbl_modelo_id_modelo where data_servico between '" + data_ini + "' and '" + data_fim + "' order by data_servico"
            );

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ServicoMODEL model = new ServicoMODEL();
                model.setRazaoSocial(rs.getString("ClientePJ.razaoSocial"));
                model.setCnpj(rs.getString("ClientePJ.cnpj"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setMarca(rs.getString("Marca.Marca"));
                model.setModelo(rs.getString("modelo.modelo"));
                model.setCor(rs.getString("modelo.cor"));
                model.setPlaca(rs.getString("modelo.placa"));
                model.setTipoServico(rs.getString("TipoServico"));
                model.setValorCobrado(rs.getString("valorCobrado"));

                sm.add(model);

            }
            rs.close();
            stmt.close();
            return sm;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Relatório cliente físico por tipo de serviço
    public void relRapido(String tipo) {
        try {
            String sql = "select ClientePF.Nome,ClientePF.Sobrenome,Marca.Marca,"
                    + "modelo.modelo,modelo.cor, modelo.placa,"
                    + "servico.TipoServico,servico.valorCobrado from servico"
                    + " inner join ClientePF on ClientePF.id_cliente_PF=servico.tbl_cliente_PF_id_cliente_PF"
                    + " inner join Marca on Marca.id_marca=servico.tbl_marca_id_marca"
                    + " inner join modelo on modelo.id_modelo=servico.tbl_modelo_id_modelo where TipoServico like '" + tipo + "'";

            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            JRResultSetDataSource ds = new JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/Aplicacao/Relatorios/RelServico.jasper", new HashMap(), ds);
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

    //Relatório cliente físico por data
    public void relRapidoFiltrarData(String data_ini, String data_fim) {
        try {
            String sql = "select ClientePF.Nome,ClientePF.Sobrenome,Marca.Marca,"
                    + "modelo.modelo,modelo.cor, modelo.placa,"
                    + "servico.TipoServico,servico.valorCobrado, servico.data_servico from servico"
                    + " inner join ClientePF on ClientePF.id_cliente_PF=servico.tbl_cliente_PF_id_cliente_PF"
                    + " inner join Marca on Marca.id_marca=servico.tbl_marca_id_marca"
                    + " inner join modelo on modelo.id_modelo=servico.tbl_modelo_id_modelo where data_servico between '" + data_ini + "' and '" + data_fim + "' order by data_servico";

            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            JRResultSetDataSource ds = new JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/Aplicacao/Relatorios/RelServicoFiltroData.jasper", new HashMap(), ds);
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

    //Relatório cliente jurídico por data
    public void relRapidoFiltDataCPJ(String data_ini, String data_fim) {
        try {
            String sql = "select ClientePJ.razaoSocial,ClientePJ.cnpj,Marca.Marca,"
                    + "modelo.modelo,modelo.cor, modelo.placa,"
                    + "servico.TipoServico,servico.valorCobrado, servico.data_servico from servico"
                    + " inner join ClientePJ on ClientePJ.id_cliente_PJ=servico.tbl_cliente_PJ_id_cliente_PJ"
                    + " inner join Marca on Marca.id_marca=servico.tbl_marca_id_marca"
                    + " inner join modelo on modelo.id_modelo=servico.tbl_modelo_id_modelo where data_servico between '" + data_ini + "' and '" + data_fim + "' order by data_servico";

            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            JRResultSetDataSource ds = new JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/Aplicacao/Relatorios/RelatórioDataPJ.jasper", new HashMap(), ds);
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
}
