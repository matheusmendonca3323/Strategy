package strategy;

public class Calculadora {
    private Operacao operacao;

    // Permite trocar a estratégia em tempo de execução
    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public int calcular(int a, int b) {
        if (operacao == null) {
            throw new IllegalStateException("Nenhuma operação definida!");
        }
        return operacao.executar(a, b);
    }
}
