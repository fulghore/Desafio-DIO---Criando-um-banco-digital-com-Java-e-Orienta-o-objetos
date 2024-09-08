package Banco;

import Conta.Conta;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Banco {

    //getters and setters
    //atributos
    @Setter
    @Getter
    private String nome;
    private List<Conta> contas;

}
