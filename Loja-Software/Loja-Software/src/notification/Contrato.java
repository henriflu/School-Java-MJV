package notification;
public class Contrato {
    private long numeroProtocolo;
    private Cadastro cadastro;


    public long getNumeroProtocolo() {
        return this.numeroProtocolo;
    }

    public void setNumeroProtocolo(long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public Cadastro getCadastro() {
        return this.cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

}
