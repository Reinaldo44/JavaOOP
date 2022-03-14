package Cofre;
/**
 * Cofrinho
 */

import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moedas> moeda = new ArrayList<Moedas>();


    public void add(Moedas moedas) {

        moeda.add(moedas);
    }

    public double calculaMoedas(){
      
    double total = 0;

      for(Moedas m : moeda ){

          total += m.getValor();
      }
        
      return total;
         
    }

}