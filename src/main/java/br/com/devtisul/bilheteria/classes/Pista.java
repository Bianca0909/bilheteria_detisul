package br.com.devtisul.bilheteria.classes;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Pista extends Ingresso {

    public Pista() {
        super.setValor(20.00);
    }

    @Override
    public String resumoIngresso() {
        return "Pista" + getValor();
    }


}
