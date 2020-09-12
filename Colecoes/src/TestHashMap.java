public class TestHashMap {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando Java", "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Novo ArrayList", 10));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Fabiola Silveira", 1587);
        Aluno a3 = new Aluno("Andre Silveira", 5617);

        javaColecoes.adiciona(a1);
        javaColecoes.adiciona(a2);
        javaColecoes.adiciona(a3);

        System.out.println("Quem é o aluno com matricula 5617");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println( aluno);
    }

}
