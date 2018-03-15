
package Aplicacao.CadMODEL;


public class GastosMODEL {
     private int Cod;
    private String Tipo;
    private String Descricao;
    private Double Valor;
    private String dataCad;


    public int getCod() {
        return Cod;
    }public void setCod(int Cod) {
        this.Cod = Cod;
    }public String getTipo() {
        return Tipo;
    }public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }public String getDescricao() {
        return Descricao;
    }public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }public Double getValor() {
        return Valor;
    }public void setValor(Double Valor) {
        this.Valor = Valor;
    }public String getDataCad() {
        return dataCad;
    }public void setDataCad(String dataCad) {
        this.dataCad = dataCad;
    }
    
}
