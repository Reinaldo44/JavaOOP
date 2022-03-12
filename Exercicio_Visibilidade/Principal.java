public class Principal {
    public static void main(String[] args) {
        
        Notas mario = new Notas();

        mario.setNota1(5);
        mario.setNota2(8);

        System.out.println("A nota 1 foi: " + mario.getNota1());
        System.out.println("A nota 2 foi: " + mario.getNota2());
   
        mario.media();

        

    }
}
