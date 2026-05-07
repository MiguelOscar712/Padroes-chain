public abstract class Funcionario {

    protected Funcionario proximo;

    public void setProximo(Funcionario proximo) {
        this.proximo = proximo;
    }

    public abstract void atender(Requisicao requisicao);
}