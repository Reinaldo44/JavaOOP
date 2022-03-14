public class Aluno {

    String nome;
    int matricula;
    double desconto;
    Curso curso;

    public Aluno(String nome, int matricula, double desconto, Curso curso) {
      
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
    }
    
    void info(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Numero da matrícula: " + matricula);
        System.out.println("Desconto do aluno: " + desconto);
        curso.info();
        System.out.println("O vaor pago com desconto é: " + pagamento());
    }

    double pagamento(){
        return curso.mensalidade * (1-desconto);
    }
}
