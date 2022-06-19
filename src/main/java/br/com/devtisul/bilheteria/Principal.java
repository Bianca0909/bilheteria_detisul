package br.com.devtisul.bilheteria;

import br.com.devtisul.bilheteria.classes.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;


@Getter
@Setter
public class Principal {
    public static void main(String[] args) {

        Evento evento = new Evento();

        String menu = "Menu: \n \n " + "1- Pista \n 2- VIP \n " +
                "3 - Camarote \n 4- Mostrar resumo e sair";
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));


            if (op == 1) {
                Ingresso pista = new Pista();
                evento.ComprarIngresso(pista);
            }
            if (op == 2) {
                Ingresso vip = new Vip();
                evento.ComprarIngresso(vip);
            }
            if (op == 3) {
                Ingresso camarote = new Camarote();
                evento.ComprarIngresso(camarote);
            }
            if (op == 4) {

                System.out.println(evento.resumoVendas());
                System.exit(0);
            }
        } while (op != 4);

    }
}



