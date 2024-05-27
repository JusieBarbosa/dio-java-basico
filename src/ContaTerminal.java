import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();
        

        System.out.println("Olá " + nomeCliente + 
        		" obrigado por criar uma conta em nosso banco, sua agência é "
        		+ agencia + " ,conta " + numero + " e seu saldo R$" + saldo + 
        		" já está disponível para saque.");

    }
}