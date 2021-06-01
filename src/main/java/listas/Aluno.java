package listas;

import java.util.Objects;

public class Aluno {
    
    String nome;
    int numeroMatricula;
    
    public Aluno(final String nome, final int numeroMatricula) {
    
        if (nome == null)
            throw new NullPointerException("Nome não pode ser nulo");
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }
    
    @Override
    public boolean equals(final Object o) {
    
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final Aluno aluno = (Aluno) o;
        return numeroMatricula == aluno.numeroMatricula && nome.equals(aluno.nome);
    }
    
    @Override
    public int hashCode() {
        
        return Objects.hash(nome, numeroMatricula);
    }
    
    @Override
    public String toString() {
        
        return "[Aluno: " + nome + ", matricula: " + numeroMatricula + "]";
    }
    
}
