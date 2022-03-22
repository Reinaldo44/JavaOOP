package Ingresso;

/**
 * IngressoVip
 */
public class IngressoVip extends Ingresso{

     double adicional;
    

    public IngressoVip(String nomeEvento, double valor, String tipo, double adicional) {
        super(nomeEvento, valor, tipo);    
        
        this.adicional = adicional;
    }


    @Override
    void info(){

       super.info();

       double total = adicional + valor;
       
       System.out.println("O valor do ingresso é: " + total );

    }




    
}