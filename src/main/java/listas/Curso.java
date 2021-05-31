package listas;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
    
    private final String nome;
    private final String instrutor;
    private final List<Aula> aulas = new LinkedList<Aula>();
    private final Set<Aluno> alunos = new HashSet<>();
    
    public Curso(final String nome, final String instrutor) {
        
        this.nome = nome;
        this.instrutor = instrutor;
    }
    
    public String getNome() {
        
        return nome;
    }
    
    public String getInstrutor() {
        
        return instrutor;
    }
    
    public List<Aula> getAulas() {
        
        return Collections.unmodifiableList(aulas);
    }
    
    public void adiciona(final Aula aula) {
        
        aulas.add(aula);
    }
    
    public int getTempoTotal() {
        
        return aulas.stream().mapToInt(Aula::getTempo).sum();
    }
    
    @Override
    public String toString() {
        
        return "[Curso:" + getNome() + ",tempo total:" + getTempoTotal() + ", aulas: [" + aulas + "] ]";
    }
    
    public void matricula(final Aluno aluno) {
        
        alunos.add(aluno);
    }
    
    public Set<Aluno> getAlunos() {
        
        return Collections.unmodifiableSet(alunos);
    }
    
    public boolean estaMatriculado(final Aluno aluno) {
        
        return alunos.contains(aluno);
    }
}
