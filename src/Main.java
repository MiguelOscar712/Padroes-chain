public class Main {

    public static void main(String[] args) {


        Funcionario atendente = new Atendente();
        Funcionario farmaceutico = new Farmaceutico();
        Funcionario gerente = new Gerente();


        atendente.setProximo(farmaceutico);
        farmaceutico.setProximo(gerente);


        System.out.println("SOLICITAÇÃO SIMPLES");

        Requisicao req1 = new Requisicao("simples");
        atendente.atender(req1);

        System.out.println("\nMEDICAMENTO CONTROLADO");

        Requisicao req2 = new Requisicao("controlado");
        atendente.atender(req2);

        System.out.println("\nPEDIDO ESPECIAL");

        Requisicao req3 = new Requisicao("especial");
        atendente.atender(req3);
    }
}