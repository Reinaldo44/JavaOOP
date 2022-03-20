package Livro;

public class Livro {
    
    private String titulo;
    private Autor autor;
    private int edicao;
    private String genero; 

    public Livro(String titulo, Autor autor, int edicao, String genero){
        
        
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.genero = genero;

    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public int getEdicao() {
        return edicao;
    }
    public String getGenero() {

        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    void info(){

        System.out.println("O titulo do livro é: " + genero);
        System.out.println("A edição do livro é: " + titulo);
        System.out.println("O gênero do livro é: " + genero);
        autor.info();

    }
}
