package DesignPatterns.Builder.Ada.Person;

public class TestePessoaComBuilder {
    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa.PessoaBuilder().nome("Caio").sobreNome("Silva")
               .documento("22018-2").email("caio@caio.com").apelido("Cain").dataNascimento("08/01/2001")
               .criaPessoa();
        System.out.println(pessoa);
    }
}
