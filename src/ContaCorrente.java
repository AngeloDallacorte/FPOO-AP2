
public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, String titular,
                         double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    public boolean sacarComLimite(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
