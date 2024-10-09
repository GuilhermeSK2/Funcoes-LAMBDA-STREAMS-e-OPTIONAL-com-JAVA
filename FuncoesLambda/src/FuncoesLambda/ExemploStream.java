package FuncoesLambda;

import java.util.Arrays;
import java.util.List;

public class ExemploStream {
    public static void main(String[] args){
        //API DE STREAM
        //STREAM - FLUXO DE DADOS

        //Java 8

        List<Integer> asList = Arrays.asList(1,2,3,4);
        asList.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));



        /*
         Até o JAVA 7:

        for (Integer integer : asList) {

            System.out.println(integer);
        }
        */
    }
}
