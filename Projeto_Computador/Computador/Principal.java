package Computador;

import java.util.ArrayList;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {

        Desktop desktop = new Desktop(8, 4, 600);

        Notebook notebook = new Notebook(16, 8, 19);

        Computador computador;

        ArrayList<Computador> listaComputadores = new ArrayList<>();

        listaComputadores.add(desktop);
        listaComputadores.add(notebook);
        listaComputadores.add(new Desktop(6, 6, 700));
        listaComputadores.add(new Notebook(12, 6, 18));

        double total = 0;

        for(Computador c : listaComputadores){
           

            total += c.calcular();
        }

        System.out.println("Total do valor dos computadores é: " + total);

        /*computador = desktop;

        System.out.println("Valor do modelo Desktop: " + computador.calcular());

        computador = notebook;

        System.out.println("Valor do modelo Notebook: " + notebook.calcular());

        */
        
        
    }
}