package Singleton;
/*
Singleton apressado: não realiza a verificação no getInstância
 */
public class SingletonEager {
    private static SingletonEager intancia = new SingletonEager(); //Instância de Singleton

    private SingletonEager(){ // construtor sempre privado, garantindo que externamente ninguém consiga instanciar esse construtor.
        super();
    }
    public static SingletonEager getIntancia(){ //retorna uma instância dele mesmo.
        return intancia;
    }
}
