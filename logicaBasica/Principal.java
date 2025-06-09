import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "Nayara Calixto";
        String tipoConta = "Corrente";
        double saldo = 5800.00; 

        System.out.println("**********************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("**********************************************\n\n");
        

        int operacao = 0;
        while (operacao != 4) {

            System.out.println("\nOperações\n");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair\n");
            System.out.println("Digite a opção desejada: ");
            operacao = scan.nextInt();

           if (operacao == 1) {
            System.out.println("\nSeu saldo atual é de R$: " + saldo + " reais."); 
           }
           else if (operacao == 2) {
                System.out.println("\nInforme o valor a receber: ");
                double valorRecebido = scan.nextDouble();
                saldo += valorRecebido;
                System.out.println("\nSeu saldo atual é de R$: " + saldo + " reais.");     
           }
           else if (operacao == 3) {
                System.out.println("\nInforme o valor que deseja transferir: ");
                double valorEnviado = scan.nextDouble();
                    if (valorEnviado < saldo) {
                        saldo -= valorEnviado;
                        System.out.println("\nSeu saldo atual é de R$: " + saldo + " reais.");
                    }
                    else {
                        System.out.println("\nNão há saldo para realizar a transferência."); 
                    }
           }
           else if (operacao > 4) {
                System.out.println("\nOpção inválida.");
           }

        }

        scan.close();

    }
}
