import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da sua Conta:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a Agencia: ");
        String agencia = sc.nextLine();
        
        System.out.println("Digite o seu nome completo: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite o seu saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println();

        System.out.println("Nome: " + nome);
        System.out.println("Numero da Conta: " + numero);
        System.out.println("Numero da Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);

        sc.close();
    
    }
}