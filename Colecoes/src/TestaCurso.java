import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Java", "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Novo ArrayList", 10));
        System.out.println(javaColecoes.getAulas());

        System.out.println(javaColecoes);

    }

}
