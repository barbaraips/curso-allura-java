package listas;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    
    public static void main(final String[] args) {
        
        final String aula1 = "Modelando a classe Aula";
        final String aula2 = "Conhecendo mais de listas";
        final String aula3 = "Trabalhando com streams.Cursos e Sets";
        
        final ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        
        System.out.println(aulas);
        
        //remover 2º elemento
        aulas.remove(1);
        System.out.println(aulas);
        
        //pegar 1º da lista
        System.out.println("O primeiro curso da lista eh o: " + aulas.get(0));
        
        //ordenar a lista
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}