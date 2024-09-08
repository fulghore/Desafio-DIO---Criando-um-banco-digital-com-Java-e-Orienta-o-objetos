package Conta;

import Conta.ChequeEspecial.ChequeEspecial;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nomeCliente, String telefoneCliente, ChequeEspecial chequeEspecial) {
        super(nomeCliente, telefoneCliente, chequeEspecial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***Extrato da Conta Poupança***");
        super.imprimirInfosComuns();
    }
}
