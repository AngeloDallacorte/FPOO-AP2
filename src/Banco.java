import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        for (Conta conta : contas) {
            conta.exibir();
            System.out.println();
        }
    }

    public double saldoTotal() {
        double total = 0.0;

        for (Conta conta : contas) {
            total += conta.getSaldo();
        }

        return total;
    }
}
