package Aplicacao.CadMODEL;

public class CadLogMODEL {
  //Encapsulamento de variaveis
    
    private int id_Login;
    private String nome;
    private String login;
    private String cpf;
    private String email;
    private String dataCadastro;
    private String senha;
    private String status;
    
    public int getId_Login() {
        return id_Login;
    }public void setId_Login(int id_Login) {
        this.id_Login = id_Login;
    }public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }public String getLogin() {
        return login;
    }public void setLogin(String login) {
        this.login = login;
    }public String getSenha() {
        return senha;
    }public void setSenha(String senha) {
        this.senha = senha;
    }public String getCpf() {
        return cpf;
    }public void setCpf(String cpf) {
        this.cpf = cpf;
    }public String getEmail() {
        return email;
    }public void setEmail(String email) {
        this.email = email;
    }public String getStatus() {
        return status;
    }public void setStatus(String status) {
        this.status = status;
    }public String getDataCadastro() {
        return dataCadastro;
    }public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }   
}
