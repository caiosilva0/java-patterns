package DesignPatterns.Builder.DevDojo;

public class PessoaBuilder {
    public static void main(String[] args) {
        Pessoa build = new Pessoa.PessoaBuilder().nome("Caio").email("caio@caio.com").build();
        System.out.println(build);
    }
}
