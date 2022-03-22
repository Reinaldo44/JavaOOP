package Livro;

public class LivroFisico extends Livro{

    private int tiragem;
    private int peso;

    public LivroFisico(String titulo, Autor autor, int edicao, Genero genero,int tiragem, int peso){
        super(titulo, autor, edicao, genero);

        this.tiragem = tiragem;
        this.peso = peso;

    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getTiragem() {
        return tiragem;
    }
    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    @Override
    public void info(){
       super.info();
       System.out.println("Tiragem: " + tiragem);
       System.out.println("Peso: " + peso);

    }
    
}
