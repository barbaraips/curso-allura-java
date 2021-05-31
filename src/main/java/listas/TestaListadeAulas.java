package listas;

import java.util.ArrayList;
import java.util.Comparator;

class TestaListaDeAula {
    
    public static void main(final String[] args) {
        
        final Aula a1 = new Aula("Revistando as ArrayLists", 21);
        final Aula a2 = new Aula("Listas de objetos", 20);
        final Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
        
        // codigo para criar a lista de aulas
        final ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas.toString());
    }
}