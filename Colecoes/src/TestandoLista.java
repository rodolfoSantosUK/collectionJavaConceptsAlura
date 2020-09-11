import java.util.ArrayList;
import java.util.Collections;

public class TestandoLista {

    public static void main(String[] args) {

        String aula1 = "COnhecendo mais de lista";
        String aula2 = "Modelando";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<String>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        // aulas.remove(0);
        System.out.println(aulas);

        String primeiraAula = aulas.get(0);
        System.out.println(primeiraAula);

        aulas.forEach(aula -> {
            System.out.println("Percorrando a lista");
            System.out.println("Aula: " + aula);
        });

        aulas.add("Aumentando o nosso conhecimeno");
        System.out.println("Desordenado " +  aulas);
        Collections.sort(aulas);
        System.out.println("Ordenado " +  aulas);
    }

}
