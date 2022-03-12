/**
 * Notas
 */
public class Notas {

   private double Nota1;
   private double Nota2;

   public void setNota1(double nota1) {

       if(nota1 < 0 || nota1 > 10){
          System.out.println("Nota inválida");
       }
       Nota1 = nota1;
     }

   public void setNota2(double nota2) {
    if(nota2 < 0 || nota2 > 10){
        System.out.println("Nota inválida");
     }
       Nota2 = nota2;
     }

   public double getNota1() {

       return Nota1;
    
    }
     
 
   public double getNota2() {
       return Nota2;
     }

    void media(){

        double media = Nota1 + Nota2 / 2;
       
        if(media < 4){
           System.out.println("Aluno reprovado");
        }
        else if(media < 7){
           System.out.println("Aluno em recuperação");
        }
        else{
            System.out.println("Aluno aprovado");
        }

    }


  
}