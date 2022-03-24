package Computador;

public class Desktop extends Computador{

    int acessorios;
    int total;

    public Desktop(int gbMemoria, int nProcessadores, int acessorios) {
        super(gbMemoria, nProcessadores);
        this.acessorios = acessorios;
    }

    double calcular(){

       total = gbMemoria * 200 + nProcessadores * 400 + acessorios;

       return total;

    }

}
