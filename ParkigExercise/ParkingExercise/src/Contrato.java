public class Contrato {
    private int numero;
    private String servico;
    private long valor;
    private boolean ativo;
    private Cliente cliente;


    public Contrato(int numero, String servico, long valor, boolean ativo, Cliente cliente) {
        this.numero = numero;
        this.servico = servico;
        this.valor = valor;
        this.ativo = ativo;
        this.cliente = cliente;
    }


    public Contrato() {
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getServico() {
        return this.servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public long getValor() {
        return this.valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
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
            ", servico='" + getServico() + "'" +
            ", valor='" + getValor() + "'" +
            ", ativo='" + isAtivo() + "'" +
            ", cliente='" + getCliente() + "'" +
            "}";
    }


}    