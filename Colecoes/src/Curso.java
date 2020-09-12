import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private Integer tempoTotal;
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

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

    public void adiciona(Aula aula){
        this.aulas.add(aula);
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
}
