package Banco.Cliente;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {

    //getters

    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}
