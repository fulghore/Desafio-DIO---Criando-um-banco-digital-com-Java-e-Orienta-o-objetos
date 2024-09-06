import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta cp = new ContaPoupanca();
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
