import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criando o Scanner para leitura do terminal
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar a conta criada
        Conta conta;

        // Solicitando e armazenando o número da conta
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        // Limpando o buffer do Scanner (para evitar problemas na leitura do próximo input)
        scanner.nextLine();

        // Solicitando e armazenando o nome do cliente
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitando e armazenando a agência
        System.out.print("Por favor, digite a agência: ");
        String agencia = scanner.nextLine();

        // Solicitando e armazenando o saldo
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Criando a conta com os dados informados
        conta = new Conta(numeroConta, nomeCliente, agencia, saldoInicial);

        // Exibindo a mensagem final com os dados da conta
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua conta é: " + conta.getNumeroConta() + ", na agência " + conta.getAgencia() + ".");
        System.out.printf("Seu saldo inicial é de R$ %.2f.\n", conta.getSaldo());

        scanner.close();
    }
}
