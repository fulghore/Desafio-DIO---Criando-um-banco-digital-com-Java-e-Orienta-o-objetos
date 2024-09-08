package Banco;

import Conta.ChequeEspecial.ChequeEspecial;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Aldrin Lima", "99999-9999", new ChequeEspecial(5000));
        cc.depositar(100);

        Conta cp = new ContaPoupanca("Ellen Guedes", "88888-8888", new ChequeEspecial(4000));
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
