public class Principal {
    public static void main(String[] args) {
        //Cria um novo objeto mario com tres parametros
        Notas mario = new Notas(5, 6, 11);

       // mario.setNota1(5);
       // mario.setNota2(8);
       // mario.setFaltas(11);

        
        System.out.println("A nota 1 foi: " + mario.getNota1());
        System.out.println("A nota 2 foi: " + mario.getNota2());
   
        mario.media();        

    }
}
