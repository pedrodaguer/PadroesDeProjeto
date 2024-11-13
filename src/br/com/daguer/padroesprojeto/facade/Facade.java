package br.com.daguer.padroesprojeto.facade;

import subsistema1.CRM.CrmService;
import subsistema2.CepApi.RecuperarCEP;

public class Facade {

    private static class Holder {
        private static Facade facade = new Facade();
    }
    private Facade() {
        super();
    }

    public static Facade getInstance() {
        return Facade.Holder.facade;
    }

    public void migrarCliente(String nome, String CEP){

        String cidade = RecuperarCEP.getInstance().recuperarCidade(CEP);
        String estado = RecuperarCEP.getInstance().recuperarEstado(CEP);

        CrmService.gravarCliente(nome, CEP, cidade, estado);
    }

}
