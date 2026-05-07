public class Farmaceutico extends Funcionario {

    @Override
    public void atender(Requisicao requisicao) {

        if (requisicao.getTipo().equalsIgnoreCase("controlado")) {

            System.out.println(
                    "Farmacêutico aprovou o medicamento controlado."
            );

        } else {

            System.out.println(
                    "Farmacêutico encaminhou para o gerente."
            );

            proximo.atender(requisicao);
        }
    }
}