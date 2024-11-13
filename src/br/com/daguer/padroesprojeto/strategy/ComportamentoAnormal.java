package br.com.daguer.padroesprojeto.strategy;

public class ComportamentoAnormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se de forma anormal!");
    }
}
