package ExemploStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main (String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        //Java 8: Streams
        //Operação intermediárias -> pode ser repetida durante o stream antes da operação final.
        //


        //Stream = loops implícitos
        //For - while - do while = loops explícitos

        String collect = lista.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(";"));

            System.out.println(collect);

        //.forEach(e -> System.out.println(e)); //Operação final, chamou uma vez o stream acaba

        //Java 5
        /*
        for (Integer integer : lista) {
            System.out.println(integer);//Não é possivel remover ou alterar algo da lista enquanto está sendo utilizada aqui
        }
         */

        // Java 4
        /*for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext(); ) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
         */
    }
}
