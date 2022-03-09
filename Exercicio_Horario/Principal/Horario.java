/**
 * Horario
 * 
 */
package Principal;

public class Horario {

    int hora, minuto, segundos;

    //Construtor com 3 parâmetros

    public Horario(int hora, int minuto, int segundos){

        if(hora > 24 || hora < 0 && minuto > 60 || minuto < 0 && segundos > 60 || segundos < 0){

        System.out.println("Numeros para hora não permitido");    

        }
        else{
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
        }
    }

    //Construtor com 1 parâmetro

   public Horario(int hora){

       if(hora < 0 && hora > 24){
           System.out.println("Horario não permitido");
       }

       this.hora = hora;

    }
     
    //Conatrutor sem parâmetro
    public Horario(){

   }

}