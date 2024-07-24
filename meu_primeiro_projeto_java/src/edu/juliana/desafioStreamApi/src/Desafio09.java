import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio09 {
    public static void main(String[] args) {
        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeros2 = numeros.stream().distinct().collect(Collectors.toList());

        if (numeros2.size() == numeros.size()){
            System.out.println("Todos os números são distintos.");
        } else {
            System.out.println("Existe numero repetidos na lista");
        }
    }
}
