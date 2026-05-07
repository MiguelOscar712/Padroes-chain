public class Gerente extends Funcionario {

    @Override
    public void atender(Requisicao requisicao) {

        if (requisicao.getTipo().equalsIgnoreCase("especial")) {

            System.out.println(
                    "Gerente aprovou pedido especial."
            );

        } else {

            System.out.println(
                    "Solicitação não pôde ser resolvida."
            );
        }
    }
}