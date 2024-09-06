package Conta;

import com.sun.javafx.binding.StringFormatter;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("***Extrato da Conta Corrente***");
        super.imprimirInfosComuns();
    }

}
