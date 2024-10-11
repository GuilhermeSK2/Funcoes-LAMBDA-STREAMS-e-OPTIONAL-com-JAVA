import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0, 5)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //Caso tenha que declarar o tipo tem que usar parênteses
        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0)
                .forEach(System.out::println);

        //Parênteses obrigatório nesses casos:

        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0)
                .reduce((n1, n2) -> n1 + n2)//Parenteses também são necessários por ter 2 argumentos, caso tenha que definir o tipo, deve-se definir o de todos os argumentos
                .ifPresent(System.out::println);


        Runnable runnable = () -> System.out.println("Seja bem vindo ao meu repositório"); //No caso do  runnable, por não passar argumento, utilizamos parênteses

        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0)
                .reduce((n1, n2) -> n1 + n2)//Parenteses também são necessários por ter 2 argumentos, caso tenha que definir o tipo, deve-se definir o de todos os argumentos
                .ifPresent(System.out::println);

        //Chaves
        IntStream.range(0, 5)
                .filter((int n) -> {
                    System.out.println("Seja bem vindo ao meu repositório");
                    return n % 2 == 0;})//Ao usar chaves, deve-se usar o return e o " ; " no final da expressão
                
                .forEach(n -> System.out.println(n));// Expresão lambda simples
    }
}