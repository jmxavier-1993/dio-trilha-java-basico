import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Desafio07 {
    public static void main(String[] args) {
        // Desafio 7 - Encontrar o segundo número maior da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted((n1, n2) -> n2 - n1)
                .skip(1)
                .findFirst();

        if (segundoMaior.isPresent()){
            System.out.println(segundoMaior.get());
        } else {
            System.out.println("Numero não encontrado");
        }

    }
}
