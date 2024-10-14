import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Exemplos com List
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //Imprime os elementos da lista
        list.forEach(n -> System.out.println(n));


        //RemoveIf
        //Remove os pares da lista
        list.removeIf(n -> n % 2 == 0);
        //imprime novamente
        list.forEach(n -> System.out.println(n));


        //ReplaceAll
        //Multiplica o número que ele encontra por 2
        list.replaceAll(n -> n * 2);
        //imprime ele ja multiplicado
        list.forEach(n -> System.out.println(n));


        //Exemplos com Map
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Seja");
        map.put(1, "Bem");
        map.put(2, "Vindo(a)");
        map.put(3, "ao meu repositório!");

        //forEach
        map.forEach((k, v) -> System.out.println(k + v));

        //Compute
        map.compute(1, (k,v) -> v + " :)");//é possível utilizar como input ao atribuir uma chave que não existe no mapa e um valor novo
        map.forEach((k, v) -> System.out.println(k + v));

        //Merge
        map.merge(3, "!", (v1,v2) -> v1 +v2);//é possível utilizar como input ao atribuir uma chave que não existe no mapa e um valor novo
        map.forEach((k, v) -> System.out.println(k + v));

        //ReplaceAll
        map.replaceAll((k, v) -> v + "!");//Adiciona o exclamação a todos os elementos encontrados
        map.forEach((k, v) -> System.out.println(k + v));

    }
}