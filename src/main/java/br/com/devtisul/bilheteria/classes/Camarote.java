package br.com.devtisul.bilheteria.classes;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Camarote extends Ingresso{

    public Camarote() {
        super.setValor(1000.00);
    }

    @Override
    public String resumoIngresso() {
        return "Camarote" + getValor();
    }
}
