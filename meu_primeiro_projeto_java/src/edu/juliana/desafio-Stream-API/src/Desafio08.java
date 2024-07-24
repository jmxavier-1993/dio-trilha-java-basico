import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio08 {
    public static void main(String[] args) {
        // Desafio 8 - Somar os dígitos de todos os números da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream().reduce(0, (n1 , n2) -> n1 + n2);

        System.out.println("Soma " + soma);

    }
}
