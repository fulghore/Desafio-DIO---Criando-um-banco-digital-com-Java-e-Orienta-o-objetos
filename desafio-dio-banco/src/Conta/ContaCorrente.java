package Conta;

import Conta.ChequeEspecial.ChequeEspecial;
import com.sun.javafx.binding.StringFormatter;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nomeCliente, String telefoneCliente, ChequeEspecial chequeEspecial) {
        super(nomeCliente, telefoneCliente, chequeEspecial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***Extrato da Conta Corrente***");
        super.imprimirInfosComuns();
    }

}
