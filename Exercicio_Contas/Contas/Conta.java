package Contas;

import java.util.Calendar;


public class Conta {

    //Propriedades da classe Conta e seus tipos.
    float saldo, limiteSaque, valorTransferido;
    String correntista;
    Calendar dateInscricao = Calendar.getInstance();

    //métodos de Conata bancaria.
    void sacar(float valor){

       if (saldo < 0 ){
           System.out.println("Não há limite para saque");
       }
       else if(saldo <= limiteSaque){
           System.out.println("limite para saque não permitido");
       }

       else{

           saldo = saldo - valor;          
           System.out.println("Saque efetuado com sucesso no valor de: " + valor);
           System.out.println(dateInscricao.getTime());
       }   
    }

    void depositar(float valor){

         saldo = saldo + valor;
    
    }
    
    void transferir(Conta efetuada, Conta destino,float valor){
        
        destino.saldo = destino.saldo + valor;
        efetuada.saldo = efetuada.saldo - valor;
        valorTransferido = valor;
        
        
    }

    void info(){
        
        System.out.println("Correntista: " + correntista);
        System.out.println("Seul saldo é: "+ saldo);
        System.out.println("Transferência: "+ valorTransferido);
    }


}
