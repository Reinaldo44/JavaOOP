package Ingresso;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso("Lola Palloza", 100, "normal");

        ingresso.info();

        IngressoVip iVip = new IngressoVip("Lolapalloza", 100,"vip", 100);

        iVip.info();    
    }
}