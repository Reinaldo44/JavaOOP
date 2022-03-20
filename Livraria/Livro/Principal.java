package Livro;

public class Principal {

    public static void main(String[] args) {

        LivroDigital livroDigital = new LivroDigital(4, 560.70, "Uma lenda alem das montanhs", new Autor("Reinaldo", "reinaldoap82@hotmail.com", "Jamaicano") , 3, "Aventura");

        LivroFisico lFisico = new LivroFisico(200, 3, "Ola mundo", "Java na pratiaca", new Autor("Reinaldo", "reinaldoap82@hotmail.com", "Brasileiro"), 2, "tecnologia");

        livroDigital.info();
        lFisico.info();
       
    }
    
}
