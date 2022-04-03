package Bank;

public class ContaPoupanca extends Conta{

    double rendimento;
    int numeroConta = 123456789;

    public ContaPoupanca(String nome, double saldo) {
        super(nome, saldo);
        numeroConta++;
    }

    
}
