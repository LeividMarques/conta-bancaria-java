import java.util.Scanner;

//Inicializar dados do cliente
//Menu de opções
//Visualização do saldo
//Envia valor
//Recebe valor
public class ContaBancaria {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        
        String nome;
        String tipoConta;
        int saldoInicial = 0;
        double saldoAtualizado = 0;
        int opcaoSelecionada = 0;

        System.out.println("Controle de conta\n");

        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();

        System.out.println("Digite o Tipo de conta: ");
        tipoConta = leitura.nextLine();

        System.out.println("\n**********************");
        System.out.println("Dados iniciais do cliente\n");

        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("**********************\n");


        while (opcaoSelecionada != 4){System.out.println("""
                \nOperações\n
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

            System.out.println("Digite a opção desejada: ");
            opcaoSelecionada = leitura.nextInt();

            switch (opcaoSelecionada){
                case 1:
                    System.out.println("\nSaldo atual: " + saldoAtualizado);
                    break;
                case 2:
                    System.out.println("\nDigite o valor que está recebendo: ");
                    double valorRecebido = leitura.nextDouble();

                    saldoAtualizado = valorRecebido + saldoAtualizado;
                    System.out.println("""
                        \nValor Recebido!
                        Saldo atualizado R$""" + saldoAtualizado);
                    break;
                case 3:
                    System.out.println("\nQuanto gostaria de transferir: ");
                    double valorTransferido = leitura.nextDouble();

                    if (valorTransferido <= saldoAtualizado){

                        saldoAtualizado = saldoAtualizado - valorTransferido;
                        System.out.println("""
                        \nTransferência realizada!
                        Saldo atualizado R$""" + saldoAtualizado);
                    } else {
                        System.out.println("\nValor digitado maior que o saldo disponivel. Transferencia não realizada.");
                    }
                    break;
                case 4:
                    System.out.println("Você selecionou SAIR");
                    break;
                default:
                    System.out.println("\nOpção invalida.");
            }
        }
        System.out.println("\nOperação Finalizada.");
    }
}