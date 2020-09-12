import java.util.*;

public class Curso {

    private Integer tempoTotal;
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<Aluno>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public String getNome() {
        return nome;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return  Collections.unmodifiableSet(alunos) ;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public void adiciona(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Integer getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula:: getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tempoTotal=" + this.getTempoTotal() +
                ", nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                '}';
    }

    public boolean estaMatriculado(Aluno a1) {
        return this.getAlunos().contains(a1);
    }

    public Aluno buscaMatriculado(int i) {
        if(!matriculaParaAluno.containsKey(i))
            throw new NoSuchElementException();
        return matriculaParaAluno.get(i);
    }
}
