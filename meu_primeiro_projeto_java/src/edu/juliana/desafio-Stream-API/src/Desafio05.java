import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Desafio05 {
    public static void main(String[] args) {
        // Desafio 5 - Calcule a média dos números maiores que 5:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble mediaOptional = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> n)
                .average();

        if (mediaOptional.isPresent()) {
            double media = mediaOptional.getAsDouble();
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum número maior que 5 foi encontrado.");
        }
    }
}
