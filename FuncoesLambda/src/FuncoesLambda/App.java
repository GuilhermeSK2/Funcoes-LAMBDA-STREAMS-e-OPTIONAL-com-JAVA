package FuncoesLambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main (String[] args) {
        //SAM - Single Abstract Method
        //Qualquer interface que tenha um metodo abstrato


        //Como era feito:

        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Olá mundo!");
            }
        }).run();


        //Como pode ser feito de forma mais simples por meio de uma expressão lambda que segue o padrão SAM:

        new Thread(() -> System.out.println("Olá mundo!")).run();
    }
}
