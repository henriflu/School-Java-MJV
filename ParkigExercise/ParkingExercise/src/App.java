import javax.sound.sampled.SourceDataLine;


public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("Henrique");
        c1.setSexo("maculino");
        c1.setIdade(31);
        c1.setTelefone("10389520");

        Endereco e1 = new Endereco();
        e1.setLogradouro("Rua Ministro Otavio Kelly");
        e1.setNumero(508);
        e1.setBairro("Icaraí");
        e1.setCidade("Niterói");
        e1.setUf("RJ"); 

        Veiculo v1 = new Veiculo();
        v1.setTipo("carro");
        v1.setMarca("toyota");
        v1.setModelo("Hilux");
        v1.setPlaca("KJH9U08");

        Contrato co1 = new Contrato();
        co1.setNumero(1);
        co1.setServico("Lavagem geral");
        co1.setValor(76);
        co1.setAtivo(true);

        System.out.println(c1.toString());
    }
}
