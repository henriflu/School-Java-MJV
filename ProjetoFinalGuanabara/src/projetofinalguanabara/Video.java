package projetofinalguanabara;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private long views;
    private long curtidas;
    private boolean reproduzindo;

    public Video(String titulo, int avaliacao, long views, long curtidas, boolean reproduzindo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public long getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(long curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play(){
        this.reproduzindo = true;
    }
    
     @Override
    public void pause(){
        this.reproduzindo = false;
    }

     @Override
    public void like(){
        this.setCurtidas(getCurtidas() +1);
    }

    
}
