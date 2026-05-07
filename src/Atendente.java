public class Atendente extends Funcionario {

    @Override
    public void atender(Requisicao requisicao) {

        if (requisicao.getTipo().equalsIgnoreCase("simples")) {

            System.out.println(
                    "Atendente resolveu a solicitação."
            );

        } else {

            System.out.println(
                    "Atendente encaminhou para o próximo."
            );

            proximo.atender(requisicao);
        }
    }
}