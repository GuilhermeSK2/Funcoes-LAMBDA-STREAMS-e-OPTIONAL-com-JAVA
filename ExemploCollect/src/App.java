import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.addAll;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        List<String> nomes = Arrays.asList("Guilherme", "Julia", "Pedro", "Matheus", "Duda", "Vera");
        System.out.println(numeros);
        //Existem 2 formas de fazer um collect:

        //Collector = forma pronta de fazer ja definida pelo java

        //toList
        List<Integer> collect = numeros.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);

        //toSet
        Set<Integer> collect2 = numeros.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(collect2);

        //toCollection
        List<Integer> collect3 = numeros.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println(collect3);


        //joining -> utiliza um string builder (mais performático do que a concatenação com reduce)
        String join = nomes.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining(" "));
        System.out.println(join);

        //averaging -> metodo para tirar a media
        Double media = numeros.stream()
                .collect(Collectors.averagingInt(n -> n.intValue()));
        System.out.println(media);

        //Summing -> soma
        Integer soma = numeros.stream()
                .collect(Collectors.summingInt(n -> n.intValue()));
        System.out.println(soma);

        //Summarizing
        IntSummaryStatistics stats = numeros.stream()
                .collect(Collectors.summarizingInt(n -> n.intValue()));
        System.out.println("IntSummaryStatistics");
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());

        //Counting
        Long counting = numeros.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(counting);

        //max
        numeros.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.maxBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);

        //min
        numeros.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.minBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);

        //groupingBy
        Map<Integer, List<Integer>> groupingBy = numeros.stream()
                .collect(Collectors.groupingBy((n) -> n % 3));
        System.out.println(groupingBy);

        //partitioningBy
        Map<Boolean, List<Integer>> partitioningBy = numeros.stream()
                .collect(Collectors.partitioningBy((n) -> n % 2 == 0));
        System.out.println(partitioningBy);

        //toMap
        Map<Integer, Integer> toMap = numeros.stream()
                .collect(Collectors.toMap(n -> n, n -> n * 3)); //Mapa sempre chave valor
        System.out.println(toMap);


        //3 argumentos (Supplier -> fornecedor, Accumulator -> Acumulação, combiner -> Combinação)
        //Supplier -> é a função lambda que vai fornecer a instância do objeto que vai receber o resultado
        List<String> collect5 = nomes.stream()
                .collect(
                        () -> new ArrayList<>(),
                        (l, e) -> l.add(e),//Acrescenta na lista os argumentos
                        (l1, l2) -> l1.addAll(l2));
        System.out.println(collect5);
    }
}
