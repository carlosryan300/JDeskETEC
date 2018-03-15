

package Aplicacao.CadMODEL;


public class ClientePFMODEL {
    private int id_cliente_pf;
    private String nome;
    private String Sobrenome;
    private String Apelido;
    private String CPF;
    private String Telefone;
    private String Celular;
    private String DataCad;

    public int getId_cliente_pf() {
        return id_cliente_pf;
    }

    public void setId_cliente_pf(int id_cliente_pf) {
        this.id_cliente_pf = id_cliente_pf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getDataCad() {
        return DataCad;
    }

    public void setDataCad(String DataCad) {
        this.DataCad = DataCad;
    }
    
    
    
}
