package subsistema1.CRM;

//Subsistema feito para utilizar o padrão Facade

public class CrmService {

    public CrmService() {
        super();
    }

    public static void gravarCliente (String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente gravado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }

}
