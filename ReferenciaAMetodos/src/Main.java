import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //method reference é basicamente outra forma de representar uma expressão lambda
        

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                .forEach(System.out::println);//Com method reference (ele é referenciado por " :: ")

        list.stream()
                .forEach((n) -> System.out.println(n));//Sem method reference

        //Metodos estáticos

        //Sem method reference
        list.stream()
                .map((n) -> multipliquePorDois(n))
                .forEach(System.out::println);

        //Com method reference
        list.stream()
                .map(Main::multipliquePorDois)
                .forEach(System.out::println);

        //Construtores

        //Sem method reference
        list.stream()
                .map((n) -> new BigDecimal(n))
                .forEach(System.out::println);

        //Com method reference
        list.stream()
                .map(BigDecimal::new)
                .forEach(System.out::println);


        //Varias instancias

        //Sem method reference
        list.stream()
                .map((n) -> n.doubleValue())
                .forEach(System.out::println);

        //Com method reference
        list.stream()
                .map(Integer::doubleValue)
                .forEach(System.out::println);


        //Única instancia


        BigDecimal dois = new BigDecimal(2);

        //Sem method referece (Utilizando expressão LAMBDA comum)
        list.stream()
                .map(BigDecimal::new)
                .map(b -> dois.multiply(b))
                .forEach(System.out::println);

        //Com method reference
        list.stream()
                .map(BigDecimal::new)
                .map(dois::multiply)
                .forEach(System.out::println);
    }

    private static Integer multipliquePorDois(Integer i){
        return i* 2;
    }
}