package Principal;

public class Nota {
    
    int nota1, nota2, nota3, resultado;

    public void mediaPonderada(){
        
        resultado = (nota1*2 + nota2*3 + nota3*4)/3;
         System.out.println("O resultado da média ponderada é: " + resultado);
       
    } 

    public void mediaAritimetica(){
         
        resultado = (nota1 + nota2 + nota3)/3;
        System.out.println("O resultado da média aritimética é: " + resultado);
      
    }
}
