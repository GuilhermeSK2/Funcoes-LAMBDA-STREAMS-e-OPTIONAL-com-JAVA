import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Formas de fazer stream

        //Collection
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                //Percorrendo a lista utilizando o metodo forEach dentro do stream
                .forEach(System.out::println);

        //Arrays
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        Arrays.stream(intArray)
                .forEach(System.out::println);

        // Stream.of
        Stream.of("Um", "Dois", "Três", "Quatro", "Cinco")
                .forEach(System.out::println);

        //IntStream.range
        IntStream.range(15, 25)
                .forEach(System.out::println);

        //Para incluir o número utilizado como limite ja que ele não é impresso das formas convencionais utilizadas
        IntStream.rangeClosed(15, 25)
                .forEach(System.out::println);

        //Stream.iterate
        Stream
                .iterate(5, n -> n * 2)
                .limit(10)//Se não limitar fica infinito
                .forEach(System.out::println);

        //Random
        new Random()
                .ints()
                .limit(10)
                .forEach(System.out::println);

        //Pattern
        String s = "Seja bem vindo(a) ao meu repositório!";
        Pattern pa = Pattern.compile(" ");
        pa.splitAsStream(s).forEach(System.out::println);
    }
}