package listas;

import java.util.List;

public class TestaCurso {
    
    public static void main(final String[] args) {
        // crie um novo curso passando o nome e instrutor no construtor
        final Curso curso = new Curso("Java Listas", "Paulo");
        final List<Aula> aulas = curso.getAulas();
        
        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando uma Aula", 20));
        curso.adiciona(new Aula("Modelando com colecoes", 24));
        
        System.out.println(aulas);
    }
}

