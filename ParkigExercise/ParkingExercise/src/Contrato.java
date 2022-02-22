public class Contrato {
    private int numero;
    private boolean ativo;
    private Cliente cliente;


    public Contrato(int numero, boolean ativo, Cliente cliente) {
        this.numero = numero;
        this.ativo = ativo;
        this.cliente = cliente;
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", ativo='" + isAtivo() + "'" +
            ", cliente='" + getCliente() + "'" +
            "}";
    }

}
