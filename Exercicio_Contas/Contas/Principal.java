package Contas;

public class Principal {

    public static void main(String[] args) {
        
         Conta conta1 = new Conta();
         conta1.correntista = "Reinaldo";
         conta1.saldo = 200;
         conta1.limiteSaque = 100;

         Conta conta2 = new Conta();
         conta2.correntista = "Bruno";
         conta2.saldo = 800;
         conta2.limiteSaque = 250;

         conta1.depositar(500);
         conta1.sacar(100);

         conta2.depositar(100);
         conta2.sacar(230);

         conta1.transferir(conta1, conta2, 55);

         conta1.info();
         conta2.info();
         
         
    }
}