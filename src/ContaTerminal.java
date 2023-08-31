import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagens para o usuário solicitando os dados da conta.
        System.out.println("Digite o seu Nome Completo: ");
        //TODO: Obter os valores digitados no terminal através do Scanner.
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o Numero da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu Saldo: ");
        Double saldo = scanner.nextDouble();

        //TODO: Retornar a mensagem para o cliente informandos seus dados da conta.
        System.out.println("PARABÉNS " +nomeCompleto+ "! SEJA BEM VINDO AO NOSSO BANCO!! " +
                "SUA AGÊNCIA: " +agencia+ " | CONTA: " +numero+
                " | CONSTA O SALDO DE " +saldo+ " DISPONÍVEL PARA SER UTILIZADO.");







    }

}