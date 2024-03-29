package Singleton;

/*
Singleton preguiçoso: no primeiro momento não disponibiliza a instância para o usuário.
 */
public class SingletonLazy {
    private static SingletonLazy intancia; //Instância de Singleton

    private SingletonLazy(){ // construtor sempre privado, garantindo que externamente ninguém consiga instanciar esse construtor.
        super();
    }
    public static SingletonLazy getIntancia(){ //retorna uma instância dele mesmo.
        //Precisamos instânciar primeiro para retornar a instância
        if (intancia == null){
            intancia = new SingletonLazy();
        }
        return intancia;
    }

    //Ela controla sua própria instância, e tem um método que expoe de maneira pública.
}
