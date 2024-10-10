import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "1";
        //String s = "Inscreva-se";
        //converteEmNumero(s).ifPresent(n -> System.out.println(n));//Imprime se corresponder ao que se é esperado, neste caso o valor que atende aos requisitos que colocamos.
        //Integer numero = converteEmNumero(s).orElse(2);//Caso não atenda o que esperamos, retorna o valor "default" que acabamos de definir.
        int numero = converteEmNumero(s)
                .orElseThrow(() -> new NullPointerException("Valor vazio!"));//Retorna uma excessão para caso receba vazio de acordo com nosso metodo.
                //.orElseGet(() -> {return operacaoPesada();});//Neste caso executa a expressão se não receber um valor.

        System.out.println(numero);



        /*Stream.of(1,2,3)
                .findFirst()//Encontra o primeiro número do stream
                .ifPresent(n -> System.out.println(n));//Retorna o que solicitamos, neste caso o primeiro número
         */


    }

    //Tipo primitivo

    public static OptionalInt converteEmNumero(String numeroStr){
        try {
            Integer integer = Integer.parseInt(numeroStr);
            return OptionalInt.of(integer);
        } catch (Exception e) {
            return OptionalInt.empty();
        }
    }

    

    /*public static Optional<Integer> converteEmNumero(String numeroStr) {
        try {
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
    */
}