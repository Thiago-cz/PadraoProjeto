public class Conta {
    private double balanco;

    public Conta(double balanco) {
        this.balanco = balanco;
    }

    public double getBalanco() {
        return balanco;
    }

    public void depositar(double valor) {
        balanco += valor;
    }

    public boolean sacar(double valor) {
        if (balanco >= valor) {
            balanco -= valor;
            return true;
        }
        return false;
    }
}
