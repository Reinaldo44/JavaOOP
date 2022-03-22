package Ingresso;

public class Ingresso {

    private String nomeEvento;
    protected double valor;
    protected String tipo;

    public Ingresso(String nomeEvento, double valor, String tipo){

        this.nomeEvento = nomeEvento;
        this.valor = valor;
        this.tipo = tipo;

    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    void info(){

        System.out.println("O nome do evento é: " + nomeEvento);
        System.out.println("O ingresso é do tipo: " + tipo);
        System.out.println("O valor do ingresso é: " + valor);

    }
    
}
