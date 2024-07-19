import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Variables to store user-entered data
        int numeroAgencia;
        int contaBancaria;
        String nomeCliente;
        double saldoConta;

        // Prompt user for agency number
        System.out.print("Por favor, digite o número da Agência: ");
        numeroAgencia = scanner.nextInt();

        // Clear the newline character from the input buffer
        scanner.nextLine();

        // Prompt user for customer name
        System.out.print("Digite o nome completo do Cliente: ");
        nomeCliente = scanner.nextLine();

        // Prompt user for account balance
        System.out.print("Digite o valor do Saldo da Conta: ");
        saldoConta = scanner.nextDouble();

        // Prompt user for account balance
        System.out.print("Digite o valor do Saldo da Conta: ");
        contaBancaria = scanner.nextInt();

        // Display account information message
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + numeroAgencia + ", conta "+ contaBancaria +" e seu saldo "+ saldoConta +"já está disponível para saque.");

        // Close the Scanner object
        scanner.close();
    }
}
