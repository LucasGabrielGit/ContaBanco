import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nomeCleinte = "";
        Double saldo = 3800.00;

        System.out.println("Por favor, digite o número da agência:");
        agencia = s.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        numero = s.nextInt();
        s.nextLine();
        System.out.println("Por favor, digite o seu nome:");
        nomeCleinte = s.nextLine();

        System.out.println(
                "Olá " + nomeCleinte + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + numero
                        + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
