import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio01 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Mostre a lista na ordem numérica:
        // Opção 1
        System.out.println(numeros.stream().sorted().collect(Collectors.toList()));

        // Opação 2
//        List<Integer> numerosOrdenados = numeros.stream().sorted().collect(Collectors.toList());
//        for (Integer n : numerosOrdenados){
//            System.out.println(n);
//        }
    }
}
