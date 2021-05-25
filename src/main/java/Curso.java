import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
    
    private final String nome;
    private final int alunos;
    
    public Curso(final String nome, final int alunos) {
        
        this.nome = nome;
        this.alunos = alunos;
    }
    
    public static void main(final String[] args) {
        
        final List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));
        
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        
        //cursos com mais de 50 alunos
        cursos.stream().filter(curso -> curso.getAlunos() > 50).forEach(curso -> System.out.println(curso.getNome()));
        final Stream<String> nomes = cursos.stream().map(Curso::getNome);
        
        //quantidade de alunos nos cursos com mais de 50 alunos
        cursos.stream().filter(c -> c.getAlunos() > 50).map(Curso::getAlunos).forEach(System.out::println);
        
        //primeiro curso com mais de 50 alunos
        final Optional<Curso> first = cursos.stream().filter(c -> c.getAlunos() > 50).findFirst();
        System.out.println(first.get().getNome());
        
        //quantidade média de alunos de todos os cursos
        final OptionalDouble average = cursos.stream().mapToInt(Curso::getAlunos).average();
        System.out.println("Media de alunos: " + average.getAsDouble());
        
        //transformar stream em lista
        final List<Curso> cursosFiltrados = cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
    }
    
    public String getNome() {
        
        return nome;
    }
    
    public int getAlunos() {
        
        return alunos;
    }
    
}


