package Principal;

/**
 * Principal
 */
public class Principal {
    public static void main(String[] args) {

      Horario horario = new Horario(24, 4, 5);

      System.out.println(horario.hora);
      System.out.println(horario.minuto);
      System.out.println(horario.segundos);

    }
}


