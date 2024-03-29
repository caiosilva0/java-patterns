package DesignPatterns.Builder.DevDojo;

public class Pessoa {
    private String nome;
    private String email;

    private Pessoa(String nome, String email) { //Para forçar a usar o Builder
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PessoaBuilder{
        private String nome;
        private String email;

        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        public PessoaBuilder email(String email){
            this.email = email;
            return this;
        }
        public Pessoa build(){
            return new Pessoa(nome, email);
        }

    }

}
