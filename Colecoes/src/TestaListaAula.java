import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisando as arrayLIst ", 21);
        Aula a2 = new Aula("Lista de objetos ", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos ", 15);

        ArrayList<Aula> aulas = new ArrayList<Aula>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(" Aulas ordenadas pelo titulo");
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(" Aulas ordenadas pelo tempo  ");
        System.out.println(aulas);








    }




}
