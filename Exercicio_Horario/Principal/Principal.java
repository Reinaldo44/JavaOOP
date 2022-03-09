package Principal;

/**
 * Principal
 */
public class Principal {
    public static void main(String[] args) {

      //Obejeto construido com 3 parâmetros  
      Horario horario1 = new Horario(24, 4, 5);
      //Objeto construido com 1 parâmetro
      Horario horario2 = new Horario(23);
      //Objeto construido sem parâmetro
      Horario horario3 = new Horario();
      horario3.hora = 5;
      horario3.minuto = 45;
      horario3.segundos = 57;

      System.out.println(horario1.hora);
      System.out.println(horario1.minuto);
      System.out.println(horario1.segundos);
      System.out.println(horario2.hora);
      System.out.println(horario3.hora);

    }
}


