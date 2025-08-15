package strategy;

public class Multiplicacao implements Operacao {
    @Override
    public int executar(int a, int b) {
        return a * b;
    }
}
