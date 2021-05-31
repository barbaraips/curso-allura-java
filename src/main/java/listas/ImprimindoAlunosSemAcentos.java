package listas;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
    
    public static void main(final String[] args) {
        
        final Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");
        
        //tente imprimir os alunos usando foreach
        alunos.forEach(System.out::println);
    }
}