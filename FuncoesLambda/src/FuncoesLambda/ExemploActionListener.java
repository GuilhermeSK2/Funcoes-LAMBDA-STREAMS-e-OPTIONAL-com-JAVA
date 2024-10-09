package FuncoesLambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploActionListener {
    public static void main (String[] args) {

        //Como era feito:

        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Olá mundo!");
            }
        });

        //Como pode ser feito de forma mais simples por meio de uma expressão lambda que segue o padrão SAM:

        JButton jButton2 = new JButton();
        jButton2.addActionListener(e -> System.out.println("Olá mundo!"));
    }
}
