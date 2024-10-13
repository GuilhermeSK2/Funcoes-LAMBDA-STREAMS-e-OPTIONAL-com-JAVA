import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cuidado ao debugar funções lambda

        List<Integer> list = Arrays.asList(1,2,5,8,9);


        //Peek (Feito para utilizar com o modo debug)
        list.stream()
                .peek(n -> System.out.println(n + " Opa!"))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println(n + " Uepa!"))
                .forEach(System.out::println);

        //Usando metodo
        list.stream()
                .map((n) -> converteParaStringBuilder(n))
                .forEach(System.out::println);

        //Função Lambda separada em mais linhas
        list.stream()
                .map((n) -> {
                        StringBuilder builder = new StringBuilder();
                        builder.append(n);
                        builder.append("s");
                        builder.append("a");
                        return builder;
                })
                .forEach(System.out::println);

        //Função lambda grande
        list.stream()
                .map((n) -> new StringBuilder().append(n).append("s").append("a"))
                .forEach(System.out::println);
    }

    private static StringBuilder converteParaStringBuilder(Integer n) {
        StringBuilder builder = new StringBuilder();
        builder.append(n);
        builder.append("s");
        builder.append("a");
        return builder;
    }
}