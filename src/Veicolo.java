import java.util.Date;

public class Veicolo {

    protected String nome;
    protected String marca;
    protected String targa;
    protected Date dataIngresso;      //Per inserire una data

    public Veicolo(String pNome, String pMarca, String pTarga, Date pDataIngresso) {
        this.nome = pNome;
        this.marca = pMarca;
        this.targa = pTarga;
        this.dataIngresso = pDataIngresso;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getTarga() {
        return this.targa;
    }

    public Date getDataIngresso() {
        return this.dataIngresso;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

    public void setMarca(String pMarca) {
        this.marca = pMarca;
    }

    public void setTarga(String pTarga) {
        this.targa = pTarga;
    }

    public void setDataIngresso(Date pDataIngresso) {
        this.dataIngresso = pDataIngresso;
    }

    public double CalcolaCosto(Date dataUscita) {

        return 0;
    }

    public String toString() {

        return "";
    }

}