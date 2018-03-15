
package Aplicacao.CadMODEL;


public class ServicoMODEL {
    private String Nome;
    private String Sobrenome;
    private String Apelido;
    private String CPF;
    private String Celular;
    private String Telefone;
    private String dataCadastro;
    
    private String Placa;
    private String TipoProd;
    private String Modelo;
    
    private String Marca;
    private String Cor;
    
    private String TipoServico;
    private String ValorCobrado; 
    
    private String id_cliente_PF;
    private String id_cliente_PJ;
    private String id_marca;
    private String id_modelo;
    
    private String razaoSocial;
    private String cnpj;
    
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    

    public String getId_marca() {
        return id_marca;
    }

    public void setId_marca(String id_marca) {
        this.id_marca = id_marca;
    }

    public String getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(String id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getId_cliente_PF() {
        return id_cliente_PF;
    }

    public void setId_cliente_PF(String id_cliente_PF) {
        this.id_cliente_PF = id_cliente_PF;
    }

    public String getId_cliente_PJ() {
        return id_cliente_PJ;
    }

    public void setId_cliente_PJ(String id_cliente_PJ) {
        this.id_cliente_PJ = id_cliente_PJ;
    }
     
     
    
    public String getNome() {
        return Nome;
    }public void setNome(String nome) {
        this.Nome = nome;
    }public String getSobrenome() {
        return Sobrenome;
    }public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }public String getApelido() {
        return Apelido;
    }public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }public String getCPF() {
        return CPF;
    }public void setCPF(String CPF) {
        this.CPF = CPF;
    }public String getCelular() {
        return Celular;
    }public void setCelular(String Celular) {
        this.Celular = Celular;
    }public String getTelefone() {
        return Telefone;
    }public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }public String getDataCadastro() {
        return dataCadastro;
    }public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }public String getPlaca() {
        return Placa;
    }public void setPlaca(String Placa) {
        this.Placa = Placa;
    }public String getModelo() {
        return Modelo;
    }public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }public String getMarca() {
        return Marca;
    }public void setMarca(String Marca) {
        this.Marca = Marca;
    }public String getCor() {
        return Cor;
    }public void setCor(String Cor) {
        this.Cor = Cor;
    }public String getTipoServico() {
        return TipoServico;
    }public void setTipoServico(String TipoServico) {
        this.TipoServico = TipoServico;
    }public String getValorCobrado() {
        return ValorCobrado;
    }public void setValorCobrado(String Valor) {
        this.ValorCobrado = Valor;
    }public String getTipoProd() {
        return TipoProd;
    }public void setTipoProd(String TipoProd) {
        this.TipoProd = TipoProd;
    }
}
