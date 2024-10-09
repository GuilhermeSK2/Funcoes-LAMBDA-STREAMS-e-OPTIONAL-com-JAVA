package ExemploStreams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main (String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        //Java 8: Streams
        //Operação intermediárias -> pode ser repetida durante o stream antes da operação final.
        //


        lista.stream()
                .filter(e -> e % 2 == 0) // filtro personalizado para o caso de uso (Operação intermediária)
                .map(e -> e * 2)//Recebe os elementos e multiplica cada um por 2 (Operação intermediária), os dados da lista original não são modificados
                .skip(2)//Ignora/pula os dados dos dois primeiros indices da lista (Operação intermediária)
                .limit(7) //Limita os dados que serão percorridos até os dois próximos números (Operação intermediária)
                .distinct() //Não permite que dados repetidos sejam exibidos utilizando a comparação equals e hashcode (Operação intermediária)
                .forEach(e -> System.out.println(e));

        //Java 5
        /*
        for (Integer integer : lista) {
            System.out.println(integer);//Não é possivel remover ou alterar algo da lista enquanto está sendo utilizada aqui
        }
         */

        // Java 4
        /*for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext(); ) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
         */
    }
}
