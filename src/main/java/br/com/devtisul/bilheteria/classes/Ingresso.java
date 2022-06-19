package br.com.devtisul.bilheteria.classes;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public abstract class Ingresso {
    private double valor;

    public Ingresso() {
        this.valor = valor;
    }

    public abstract String resumoIngresso();
}
