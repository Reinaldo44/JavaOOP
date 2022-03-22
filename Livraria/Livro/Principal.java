package Livro;

public class Principal {

    public static void main(String[] args) {

    //Foi aplicado na classe livro como classe abstract, sendo assim não podendo criar um objeto de instância da classe Livro, na linha abaixo.

    //Livro livro = new Livro(String titulo, Autor autor, int edicao, String genero);

       
     LivroFisico livroFisico = new LivroFisico("Homem Aranha", new Autor("reinaldo", "reinaldo@hotmail.com", "Brasileiro"), 2022 , Genero.Romance, 3000, 300);
        
     livroFisico.info();

     System.out.println("-----------------------------");

     LivroDigital livroDigital = new LivroDigital("Desvendendo o Java", new Autor("Paulo Junior", "Pjr@hotmail", "Chileno"), 2023, Genero.Tecnologia, 300, 4000.8);

     livroDigital.info();

    
     System.out.println("Aqui foi feito uma referência de livroDigital e livroFisico e não uma instância do objeto");

     // Aqui foi aplicado o polimorfismo 

     Livro livro;

     livro = livroDigital;

     livro.info();

     System.out.println("----------------------");

     livro = livroFisico;

     livro.info();


        
    }
    
}
