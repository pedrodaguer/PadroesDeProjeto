package br.com.daguer.padroesprojeto;

import br.com.daguer.padroesprojeto.facade.Facade;
import br.com.daguer.padroesprojeto.singleton.SingletonBasico;
import br.com.daguer.padroesprojeto.singleton.SingletonEager;
import br.com.daguer.padroesprojeto.singleton.SingletonHolder;
import br.com.daguer.padroesprojeto.strategy.Animal;
import br.com.daguer.padroesprojeto.strategy.Comportamento;
import br.com.daguer.padroesprojeto.strategy.ComportamentoAnormal;
import br.com.daguer.padroesprojeto.strategy.ComportamentoNormal;

public class Teste {

    public static void main(String[] args) {

        //Singleton - Imprime os mesmos endereços de memória, ou seja, são os mesmos objetos.
        SingletonBasico singletonBasico = SingletonBasico.getInstance();
        System.out.println(singletonBasico);
        singletonBasico = SingletonBasico.getInstance();
        System.out.println(singletonBasico);

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonHolder singletonHolder = SingletonHolder.getInstance();
        System.out.println(singletonHolder);
        singletonHolder = SingletonHolder.getInstance();
        System.out.println(singletonHolder);

        //Strategy
        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoAnormal = new ComportamentoAnormal();

        Animal animal = new Animal();
        animal.setComportamento(comportamentoNormal);
        animal.mover();

        animal.setComportamento(comportamentoAnormal);
        animal.mover();

        //Facade
        Facade facade = Facade.getInstance();
        facade.migrarCliente("PedroDaguer", "88330782");
    }

}
