package Singleton;
//No Singleton tudo tem um controle estático.
public class SingletonLazyHolder {
    public static class IntanceHolder {  //encapsula essa intância em uma classe estática interna.
        public static SingletonLazyHolder intancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){ // construtor sempre privado, garantindo que externamente ninguém consiga instanciar esse construtor.
    }
    public static SingletonLazyHolder getIntancia(){ //retorna uma instância dele mesmo.
        return IntanceHolder.intancia;
    }
}
