import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Barney", 3);
        Funcionario f2 = new Funcionario("Jonatan", 1);
        Funcionario f3 = new Funcionario("Guaciara", 1);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenarPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterator = funcionarios.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getNome());
        }




    }

}
