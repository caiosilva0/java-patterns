package Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getIntancia(); //Sempre acessar pela classe.
        System.out.println(lazy);
        lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getIntancia();
        System.out.println(eager);
        eager = SingletonEager.getIntancia();
        System.out.println(eager);
    }
}
