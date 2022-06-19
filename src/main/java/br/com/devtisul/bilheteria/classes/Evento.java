package br.com.devtisul.bilheteria.classes;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Evento {
    private String nome;
    private LocalDate dataEvento;
    private List<Ingresso> ingresssosVendidos;

    private Ingresso ingresso;

    public Evento() {
        this.nome = "Evento A";
        this.dataEvento = LocalDate.ofEpochDay(12 - 01 - 2022);
        this.ingresssosVendidos = new ArrayList<>();
    }


    public List<Ingresso> ComprarIngresso(Ingresso ingresso) {
        ingresssosVendidos.add(ingresso);
        return ingresssosVendidos;
    }

    public String resumoVendas() {

        Integer qtdPista = 0;
        Integer qtdVip = 0;
        Integer qtdCamarote = 0;
        String resultadoVendas = "Resumo de Vendas \n\n";

        for (Ingresso ingresso : ingresssosVendidos) {

            if (ingresso instanceof Pista) {
                qtdPista++;
            } else if (ingresso instanceof Vip) {
                qtdVip++;
            } else if (ingresso instanceof Camarote) {
                qtdCamarote++;
            }
        }
        resultadoVendas += "Quantidade pista: " + qtdPista + "\n" +
                "Quantidade vip: " + qtdVip + "\n" +
                "Quantidade camarote: " + qtdCamarote + "\n";

        return resultadoVendas;
    }

}
