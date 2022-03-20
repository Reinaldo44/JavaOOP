package Livro;

public class LivroDigital extends Livro {

    private int download;
    private double tamanho;

    public LivroDigital(int download, double tamanho, String titulo, Autor autor, int edicao, String genero) {
        
        super(titulo, autor, edicao, genero);
        this.tamanho = tamanho;
        this.download = download;
        
    }
    public void setDownload(int download) {
        this.download = download;
    }
    public int getDownload() {
        return download;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public double getTamanho() {
        return tamanho;
    }

    @Override
    public void info(){
       super.info();
       System.out.println("Tamanho: " + tamanho);
       System.out.println("Download: " + download);

    }
    
}
