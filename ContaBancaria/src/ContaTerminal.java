import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Bem-vindo ao sistema de criação de conta!");

        // Obter valores digitados no terminal
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        // Criar objeto Conta com os valores fornecidos
        ContaBancaria conta = new ContaBancaria(nome, cpf);

        // Exibir mensagem de conta criada
        System.out.println("Conta criada com sucesso:\n" + conta);

        // Pedir ao usuário que deposite um valor
        System.out.print("Digite o valor a depositar: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("Depósito realizado com sucesso:\n" + conta);

        // Pedir ao usuário que saque um valor
        System.out.print("Digite o valor a sacar: ");
        double valorSaque = scanner.nextDouble();
        if (conta.sacar(valorSaque)) {
            System.out.println("Saque realizado com sucesso:\n" + conta);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();

    }
}