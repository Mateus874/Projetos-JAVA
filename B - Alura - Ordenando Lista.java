/*  No Exercício 2, crie alguns objetos da classe Titulo e adicione-os
    a uma lista. Utilize o método Collections.sort para
    ordenar a lista e, em seguida, imprima os títulos ordenados.*/

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<titulo> lista = new ArrayList<>();
        lista.add(new titulo("harry"));
        lista.add(new titulo("TESTE"));

         Collections.sort(lista);

            for(titulo mostrar: lista){
                System.out.println(mostrar.getNome());
            }
    }
}

public class titulo implements Comparable<titulo> {
    private String nome;

    titulo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(titulo o) {
        return this.nome.compareToIgnoreCase(o.getNome());
    }
}


