package Principal;

public class Principal {
    public static void main(String[] args) {

        System.out.println(
            "Hello Java"
        );  
       
        Nota nota = new Nota();
        nota.nota1 = 6;
        nota.nota2  = 7;
        nota.nota3 = 8;

        nota.mediaAritimetica();
        nota.mediaPonderada();

    
    } 

}
