import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "Seja bem vindo(a) ao meu repositório!";
        String[] split = s.split(" ");
        List<String> listStr = Arrays.asList(split);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Reduce passando indentidade

        //Soma
        Integer soma = list.stream()
                .reduce(0, (n1, n2) -> n1 + n2);//O valor passado como identidade será o primeiro a operar com os demais (Ele deve retornar inicialmente o primeiro valor do array)
        System.out.println(soma);

        Integer multiplicacao = list.stream()
                .reduce(1, (n1, n2) -> n1 * n2);//O valor passado como identidade será o primeiro a operar com os demais (Ele deve retornar inicialmente o primeiro valor do array)
        System.out.println(multiplicacao);

        //Reduce - Concatenação
        String concatenacao = listStr.stream()
                .reduce("",(s1, s2) -> s1.concat(s2));//Neste caso de concatenação, inicia-se com uma string vazia que concatenara com o restante do valor de listStr
        System.out.println(concatenacao);

        //Reduce de soma
        List<Integer> listVazia = Arrays.asList();

        Integer soma2 = listVazia.stream()
                //O reduce utiliza da identidade para
                .reduce(0,(n1, n2) -> n1 + n2);//Retornara a identidade inicial do reduce por não encontrar nada na lista que está vazia.
        System.out.println(soma2);


        /*
        //Reduce - Soma
        Optional<Integer> soma = list.stream()
                .reduce((n1, n2) -> n1 + n2);//Pega todos os elementos da lista e transforma em uma coisa só de acordo com a função (Associativa)
        System.out.println(soma.get());


        //Reduce - Multiplicação
        Optional<Integer> multiplicacao = list.stream()
                .reduce((n1, n2) -> n1 * n2);//Pega todos os elementos da lista e transforma em uma coisa só de acordo com a função (Associativa)
        System.out.println(multiplicacao.get());

        //Reduce - Concatenação
        Optional<String> concatenacao = listStr.stream()
                .reduce((s1, s2) -> s1.concat(s2));//Pega todos os elementos da lista e transforma em uma coisa só de acordo com a função (Associativa)
        System.out.println(concatenacao.get());


        //Uma função de subtração não deve utilizar reduce por não ser associativa, ao utilizarmos a função parallel por exemplo o resultado muda
        Optional<Integer> subtracao = list.stream()
                .parallel()
                .reduce((n1, n2) -> n1 - n2);
        System.out.println(subtracao.get());

         */

        //Reduce d emenor valor
        double menorValor = DoubleStream.of(1.5,2.9,6.7, 0.5)
                .reduce(Double.POSITIVE_INFINITY,(d1,d2) -> Math.min(d1,d2));
        System.out.println(menorValor);


        //Reduce - Combinação (3 argumentos)
        Integer soma3 = list.stream()
                .reduce(0, (n1, n2) -> n1 + n2, (n1, n2) -> n1 + n2);
        System.out.println(soma);

        //Reduce - map + combiner
        Optional<String> reduce = list.stream()
                .map(n1 -> n1.toString())
                .reduce((n1, n2) -> n1.concat(n2));//Pega todos os elementos da lista e transforma em uma coisa só de acordo com a função (Associativa)
        System.out.println(reduce);

    }
}