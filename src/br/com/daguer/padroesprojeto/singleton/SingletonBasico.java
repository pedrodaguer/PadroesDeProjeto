package br.com.daguer.padroesprojeto.singleton;

public class SingletonBasico {

    private static SingletonBasico singletonBasico;

    private SingletonBasico() {
        super();
    }

    public static SingletonBasico getInstance() {
        if (singletonBasico == null) {
            singletonBasico = new SingletonBasico();
        }
        return singletonBasico;
    }

}
