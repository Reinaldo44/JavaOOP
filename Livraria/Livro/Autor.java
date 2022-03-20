package Livro;

/**
 * Autor
 */
public class Autor {

    private String nome;
    private String email;
    private String nacionalidade;

    public Autor(String nome, String email, String nacionalidade){

         this.nome = nome;
         this.email = email;
         this.nacionalidade = nacionalidade;
         
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    void info(){

        System.out.println("O nome do autor é: " + getNome());
        System.out.println("O email é: " + getEmail());
        System.out.println("A nacionalidade do email é: " + getNacionalidade());
    }
}