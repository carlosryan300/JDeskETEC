
package Aplicacao.ConMODEL;


public class ConClienteMODEL {
    
    private int ID;
    private String RazaoSocial;
    private String CNPJ;
    private String Ramo;
    private String Porte;
    private String TelPrin;
    private String TelSec;
    private String DataCad;

    public String getRazaoSocial() {
        return RazaoSocial;
    }public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }public String getCNPJ() {
        return CNPJ;
    }public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }public String getRamo() {
        return Ramo;
    }public void setRamo(String Ramo) {
        this.Ramo = Ramo;
    }public String getPorte() {
        return Porte;
    }public void setPorte(String Porte) {
        this.Porte = Porte;
    }public String getTelPrin() {
        return TelPrin;
    }public void setTelPrin(String TelPrin) {
        this.TelPrin = TelPrin;
    }public String getTelSec() {
        return TelSec;
    }public void setTelSec(String TelSec) {
        this.TelSec = TelSec;
    }public String getDataCad() {
        return DataCad;
    }public void setDataCad(String DataCad) {
        this.DataCad = DataCad;
    } public int getID() {
        return ID;
    } public void setID(int ID) {
        this.ID = ID;
    }
    
}
