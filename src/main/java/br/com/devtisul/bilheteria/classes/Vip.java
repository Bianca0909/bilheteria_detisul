package br.com.devtisul.bilheteria.classes;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Vip extends Ingresso {

    public Vip() {
        super.setValor(40.0);
    }

    @Override
    public String resumoIngresso() {
        return "VIP" + getValor();
    }
}
