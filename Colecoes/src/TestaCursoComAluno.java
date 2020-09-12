public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Java", "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Novo ArrayList", 10));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Adriano Silveira", 1587);
        Aluno a3 = new Aluno("Bruno Silveira", 1587);

        javaColecoes.adiciona(a1);
        javaColecoes.adiciona(a2);
        javaColecoes.adiciona(a3);

        System.out.println("Todos os alunos : ");

        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        } );

        System.out.println("O aluno " + a1 +  " está matriculado ? ");
        System.out.println(javaColecoes.estaMatriculado(a1));

        // Testando equals e hashCode

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse Turini, está matriculado ? ");
        System.out.println( javaColecoes.estaMatriculado(turini));

        System.out.println("  O a1 é equals ao Turini? ");
        System.out.println(a1.equals(turini) );



    }

}
