import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Supplier -> recebe nada e retorna algo
        //Consumer -> Recebe um valor e não retorna nada
        //Predicate -> Teste
        //Function -> Recebe um valor e retorna outro
        //BinaryOperator -> Recebe um valor e retorna do mesmo tipo



        //Com suppplier
        Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .forEach(System.out::println);




        List<Integer> list = Arrays.asList(1,2,3,4,5);


        //Interfaces funcionais
        list.stream()
                //O metodo filter recebe um predicate (isso significa que ele vai fazer uma comparação)
                .filter(e -> e % 2 == 0)
                //O map é uma function (Significa que recebe algo e retorna algo)
                .map(e -> e.doubleValue())
                .reduce((e1, e2) -> e1 + e2)//BinaryOperator
                .ifPresent(System.out::println);
    }
}
