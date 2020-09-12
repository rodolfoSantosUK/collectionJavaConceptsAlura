import java.util.HashSet;
import java.util.Set;

public class TestaAlunosSet {


    public static void main(String[] args) {
        Set<String> alunosSet = new HashSet<String>();
        alunosSet.add("Ronaldo Turini");
        alunosSet.add("Alberto Souza");
        alunosSet.add("Nico Steppa");
        alunosSet.add("Sergio Lopes");
        alunosSet.add("Renan Saggio");
        alunosSet.add("Mauricio Aniche");

        alunosSet.forEach(aluno -> {
            System.out.println(aluno);
        });

        boolean pauloEsta = alunosSet.contains("Paulo Silveira");
        System.out.println(" Paulo está no Set " + (pauloEsta ? "SIM" : "NAO"));


    }


}
