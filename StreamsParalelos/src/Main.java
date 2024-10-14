import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        /*
        //Quando se está numa lista (parallelStream).
        list.parallelStream()

        //Quando não se está em uma lista e esta utilizando stream (parallel).
        IntStream.range(0,5).parallel()
        */

        //Stream parallel -> para ganho de performance

        list.parallelStream()
                //imprime de forma desordenada por conta do parallelStream
                .forEach(System.out::println);

        System.out.println("----------");

        list.parallelStream()
                //Mantem a ordem dos elementos
                .forEachOrdered(System.out::println);

        System.out.println("----------");

        //findAny
        list.parallelStream()
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("----------");

        list.stream()
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("----------");

        //unordered
        list.parallelStream()
                .unordered()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //Reduce (Para operar de forma correta utilize para operações associativas)
        list.parallelStream()
                .unordered()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
    }
}