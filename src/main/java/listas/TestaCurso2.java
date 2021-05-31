package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    
    public static void main(final String[] args) {
        
        final Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
        
        System.out.println(javaColecoes.getAulas());
        
        final List<Aula> aulasImutaveis = javaColecoes.getAulas();
        
        final List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(javaColecoes.toString());
    }
}