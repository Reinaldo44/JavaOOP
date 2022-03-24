package Computador;

public class Notebook extends Computador{

    double polegadasTelas;
    double total;
   
    public Notebook(int gbMemoria, int nProcessadores, double polegadasTelas) {
        super(gbMemoria, nProcessadores);
        
        this.polegadasTelas = polegadasTelas;
    }

    double calcular(){

        total = gbMemoria * 250 + nProcessadores * 500 + polegadasTelas * polegadasTelas;
        return total;

    }
    
}
