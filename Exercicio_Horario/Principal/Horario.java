/**
 * Horario
 * 
 */
package Principal;

public class Horario {

    int hora, minuto, segundos;

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

   // public Horario(int hora){
   //     this.hora = hora;
   // }

    //public Horario(){

  //  }

}