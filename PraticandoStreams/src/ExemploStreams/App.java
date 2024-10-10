package ExemploStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main (String[] args) {

        //Utilizando Stream

        List<Integer> lista = Arrays.asList(1,5,8,7,4,6,3,2,1,8,5,7,4);
        lista.stream()
                .limit(7) //Limita até que indice
                .filter(e -> e % 2 == 0)//Filtra os números pares
                .map(e -> e * 2) //Multiplica eles por 2
                .forEach(System.out::println); //imprime os números pares dentro dos sete primeiros, multiplicados po dois cada um deles.

        //Forma convencional

        /* List<Integer> lista = Arrays.asList(1,5,8,7,4,6,3,2,1,8,5,7,4);
        for (int i = 0; i < 7; i++) {
            Integer numero = lista.get(i);
            if (numero % 2 == 0) {
                System.out.println(numero * 2);
            }
        }
        */
    }
}
