import Conta.Conta;

import java.util.List;

public class Banco {

    //atributos
    private String nome;
    private List<Conta> contas;

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
