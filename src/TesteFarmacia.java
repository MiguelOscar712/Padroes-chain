public class TesteFarmacia {

    public static void main(String[] args) {

        System.out.println("===== TESTE FARMÁCIA =====");

        Funcionario atendente = new Atendente();
        Funcionario farmaceutico = new Farmaceutico();
        Funcionario gerente = new Gerente();

        atendente.setProximo(farmaceutico);
        farmaceutico.setProximo(gerente);

        System.out.println("\nTESTE 1 - Solicitação Simples");

        Requisicao requisicao1 =
                new Requisicao("simples");

        atendente.atender(requisicao1);

        System.out.println(
                "\nTESTE 2 - Medicamento Controlado");

        Requisicao requisicao2 =
                new Requisicao("controlado");

        atendente.atender(requisicao2);

        System.out.println(
                "\nTESTE 3 - Pedido Especial");

        Requisicao requisicao3 =
                new Requisicao("especial");

        atendente.atender(requisicao3);

        System.out.println(
                "\nTESTE 4 - Solicitação Inválida");

        Requisicao requisicao4 =
                new Requisicao("desconhecido");

        atendente.atender(requisicao4);

        System.out.println("\nFIM DOS TESTES");
    }
}