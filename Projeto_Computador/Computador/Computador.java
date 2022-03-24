package Computador;

public abstract class Computador {
    
    int gbMemoria;
    int nProcessadores;

    public Computador(int gbMemoria, int nProcessadores){
        super();
        
        this.gbMemoria = gbMemoria;
        this.nProcessadores = nProcessadores;

    }

    abstract double calcular();

}
