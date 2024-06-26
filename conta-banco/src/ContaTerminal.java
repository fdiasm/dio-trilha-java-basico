import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in)
            .useLocale(Locale.US)
            .useDelimiter("\n");

        System.out.println("Por favor, digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente");
        String clienteNome = scanner.next();
        
        System.out.println("Por favor, digite o saldo");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá "+clienteNome
            +", obrigado por criar uma conta em nosso banco, sua agência é "
            +agencia+", conta "+numero+" e seu saldo "
            +saldo+" já está disponível para saque");
    }
}