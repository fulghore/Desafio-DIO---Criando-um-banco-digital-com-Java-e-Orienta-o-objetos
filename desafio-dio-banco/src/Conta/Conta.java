package Conta;

import Banco.Cliente.Cliente;
import Banco.Interface.IConta;
import com.sun.javafx.binding.StringFormatter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import Conta.ChequeEspecial.ChequeEspecial;

@Getter
@NoArgsConstructor
public abstract class Conta implements IConta {
    //atributos
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia = AGENCIA_PADRAO;
    private int numero = SEQUENCIAL++;
    private double saldo;
    private Cliente cliente;
    private ChequeEspecial chequeEspecial;

    // O Lombok já vai gerar os getters automaticamente para agencia, numero, e saldo

    // Construtor padrão pode ser gerado automaticamente pelo @NoArgsConstructor
    // Se você quiser adicionar lógica de inicialização, pode manter o construtor manualmente.
    public Conta(String nomeCliente, String telefoneCliente, ChequeEspecial chequeEspecial) {
        this.cliente = new Cliente(nomeCliente, telefoneCliente);
        this.chequeEspecial = chequeEspecial;
    }

    //metodos
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Método para imprimir informações comuns
    protected void imprimirInfosComuns() {
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);

        if (this.cliente != null) {
            System.out.println("Nome: " + this.cliente.getNome());
            System.out.println("Telefone: " + this.cliente.getTelefone());
            String valorFormatado = String.format("%.2f", this.chequeEspecial.getLimiteDisponivel());
            System.out.println("Limite disponível no cheque especial: R$" + valorFormatado);
        } else {
            System.out.println("Nome: Não informado");
            System.out.println("Telefone: Não informado");

        }
    }
}