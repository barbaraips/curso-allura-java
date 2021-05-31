package listas;

public class TestaAlunos {
    
    public static void main(final String[] args) {
        
        final Aluno a1 = new Aluno("Maria", 1);
        final Aluno a2 = new Aluno("Joana", 2);
        final Aluno a3 = new Aluno("Raquel", 3);
        final Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        
        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando uma Aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 24));
        
        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);
        
        System.out.println(curso.getAlunos());
        
    }
    
}
