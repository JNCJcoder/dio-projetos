import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !\nConta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !\nAgencia: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome Completo !\nNome Completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do deposito inicial ! exemplo: 539.32\nR$ ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        
        scanner.close();
    }
}