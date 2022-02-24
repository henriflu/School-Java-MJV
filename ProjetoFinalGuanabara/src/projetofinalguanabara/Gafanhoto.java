package projetofinalguanabara;
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login, int totAssistido) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
    
    
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
}
