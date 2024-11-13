package subsistema2.CepApi;

//Subsistema feito para utilizar o padrão Facade

public class RecuperarCEP {

    private static RecuperarCEP recuperarCEP = new RecuperarCEP();

    private RecuperarCEP() {
        super();
    }

    public static RecuperarCEP getInstance() {
        return recuperarCEP;
    }

    public String recuperarCidade(String cep) {
        return "Balneário Camboriú";
    }

    public String recuperarEstado(String cep) {
        return "SC";
    }

}
