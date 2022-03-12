/**
 * Classe Notas, responsável por criar as notas de alunos, com 3 atributos private, um construtor que requerer 3 parâmetros para criar um objeto Notas, e possui os metodos set e get para ascessar os atributos, e o método para calcular a média.
 */
public class Notas {

   //Propriedades privada 
   private double Nota1;
   private double Nota2;
   private int Faltas;

   //Construtor de Notas
   public Notas(double nota1, double nota2, int faltas){
        setNota1(nota1);
        setNota2(nota2);
        setFaltas(faltas);   
    }
   
   //Método set para fazer validação e ter acesso ao atributo
   public void setFaltas(int faltas) {
       if(faltas > 40 || faltas < 0){
        Faltas = faltas;
       }
       
   }

   //método get para acessar as propriedades
   public int getFaltas() {
       return Faltas;
   }

   //Método set para fazer validação e ter acesso ao atributo
   public void setNota1(double nota1) {

       if(nota1 < 0 || nota1 > 10){
          System.out.println("Nota inválida");
       }
       Nota1 = nota1;
     }

   //Método set para fazer validação e ter acesso ao atributo
   public void setNota2(double nota2) {
    if(nota2 < 0 || nota2 > 10){
        System.out.println("Nota inválida");
     }
       Nota2 = nota2;
     }

   //método get para acessar as propriedades
   public double getNota1() {

       return Nota1;
    
    }
     
   //método get para acessar as propriedades
   public double getNota2() {
       return Nota2;
     }

    //método que calcula a média de notas
    void media(){

        double media = Nota1 + Nota2 / 2;

        if(Faltas < 10){
            System.out.println("Aluno reprovado por faltas");
        }
       
        else if(media < 4){
           System.out.println("Aluno reprovado");
        }
        else if(media < 7){
           System.out.println("Aluno em recuperação");
        }
        else{
            System.out.println("Aluno aprovado");
        }

        System.out.println("A sua média foi: " + media);


    }


}


  
