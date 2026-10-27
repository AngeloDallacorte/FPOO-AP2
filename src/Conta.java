public class Conta {

    private int numero;
    private String titular;
    protected double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void exibir() {
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %,.2f%n", saldo);
    }
}
