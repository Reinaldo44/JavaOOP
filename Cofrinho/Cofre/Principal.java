package Cofre;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {

        Cofrinho c = new Cofrinho();

        c.add(new Moedas("Euro", 0.5));
        c.add(new Moedas("Euro",0.10));
        c.add(new Moedas("Euro", 1));
        c.add(new Moedas("Euro",0.25));

        System.out.println("O valor total das moedas é: " + c.calculaMoedas());
        
    }
}