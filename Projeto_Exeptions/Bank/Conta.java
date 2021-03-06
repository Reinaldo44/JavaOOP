package Bank;
 

public class Conta {

    String nome;
    double saldo;

    public Conta(String nome, double saldo){

        super();
        
        this.nome = nome;
        this.saldo = saldo;
        
    }

    public void Sacar(double valor) throws Exception{

        if(valor > saldo){
           throw new RuntimeException("Valor para saque superior ao saldo disponível");
        }
        if(valor < 0){
            throw new RuntimeException("Valor invalido");
         }
        saldo -= valor;

    }

    public void Depositar(double valor) throws Exception{

         if(valor < 0){
             throw new RuntimeException("Valor invalido");
          } 

        saldo += valor;

    }

    public void info(){
        System.out.println("--------------------------");
        System.out.println("O nome é: " + nome);
        System.out.println("O saldo é: " + saldo);
    }
    
}
