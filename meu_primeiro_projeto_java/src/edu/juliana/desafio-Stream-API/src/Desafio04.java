import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio04 {
    public static void main(String[] args) {
        // Desafio 4 - Remova todos os valores ímpares:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());


       for (int n : numerosPares){
           System.out.println(n);
       }
    }
}
