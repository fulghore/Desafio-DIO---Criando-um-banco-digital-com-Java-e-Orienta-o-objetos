package Banco.Interface;

import Conta.Conta;

public interface IConta {
    //metodos
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
