
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        Banco bancoUlbra = new Banco();

        Conta conta1 = new Conta(1, "Angelo");

        ContaPoupanca conta2 =
                new ContaPoupanca(2, "Euzébio", 0.05);

        ContaCorrente conta3 =
                new ContaCorrente(3, "Maristela", 500);

        bancoUlbra.adicionarConta(conta1);
        bancoUlbra.adicionarConta(conta2);
        bancoUlbra.adicionarConta(conta3);

        System.out.println("Depósitos:");

        conta1.depositar(1000);
        conta2.depositar(2000);
        conta3.depositar(300);

        System.out.println("\nSaques:");

        boolean saque1 = conta1.sacar(200);
        System.out.println("Saque de R$ 200,00: " + saque1);

        boolean saque2 = conta1.sacar(1500);
        System.out.println("Saque de R$ 1.500,00: " + saque2);

        System.out.println("\nPoupança:");

        System.out.printf("Saldo antes: R$ %,.2f%n",
                conta2.getSaldo());

        conta2.aplicarRendimento();

        System.out.printf("Saldo depois: R$ %,.2f%n",
                conta2.getSaldo());

        System.out.println("\nConta Corrente:");

        System.out.printf("Saldo antes: R$ %,.2f%n",
                conta3.getSaldo());

        boolean saqueLimite = conta3.sacarComLimite(600);

        System.out.println("Saque com limite: " + saqueLimite);

        System.out.printf("Saldo depois: R$ %,.2f%n",
                conta3.getSaldo());

        System.out.println("\nBuscar Conta:");

        Conta contaEncontrada =
                bancoUlbra.buscarPorNumero(2);

        if (contaEncontrada != null) {
            contaEncontrada.exibir();
        } else {
            System.out.println("Conta não encontrada.");
        }

        System.out.println("\nTodas as contas:");

        bancoUlbra.listarContas();

        System.out.println("Saldo do Banco:");

        System.out.printf("R$ %,.2f%n",
                bancoUlbra.saldoTotal());
    }
}
