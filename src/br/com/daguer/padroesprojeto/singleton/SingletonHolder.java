package br.com.daguer.padroesprojeto.singleton;

public class SingletonHolder {

    private static class Holder {
        private static SingletonHolder singleton = new SingletonHolder();
    }

    private SingletonHolder() {
        super();
    }

    public static SingletonHolder getInstance() {
        return Holder.singleton;
    }

}
