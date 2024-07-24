import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio11 {
    public static void main(String[] args) {
        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados =  numeros.stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println(somaDosQuadrados);
    }
}
