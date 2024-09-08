package Conta.ChequeEspecial;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ChequeEspecial {
    private double limiteDisponivel;

    public ChequeEspecial(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
}
