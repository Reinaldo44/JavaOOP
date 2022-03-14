package Cofre;

public class Moedas {

    private String nome;
    private double valor;

    public Moedas(String nome, double valor) {

        this.valor = valor;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
