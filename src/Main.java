import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int escolha;
    double numero1, numero2;

    do{
        exibirMenu();
        System.out.println("Escolha uma opção: ");
        escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha != 0) {

            System.out.println("Escolha o primeiro número: ");
            numero1 = scanner.nextDouble();

            System.out.println("Escolha o segundo número: ");
            numero2 = scanner.nextDouble();
        } else {
            numero1 = 0;
            numero2 = 0;
        }

        Calculadora calculadora = new Calculadora(numero1, numero2);

        processar_opcao(escolha, calculadora);

    } while (escolha != 0);


        scanner.close();
    }

    private static void processar_opcao(int escolha, Calculadora calculadora) {
        switch(escolha){
            case 1:
                calculadora.adicao(calculadora.getNumero1(), calculadora.getNumero2());
                break;
            case 2:
                calculadora.subtracao(calculadora.getNumero1(), calculadora.getNumero2());
                break;
            case 3:
                calculadora.multiplicacao(calculadora.getNumero1(), calculadora.getNumero2());
                break;
            case 4:
                calculadora.divisao(calculadora.getNumero1(), calculadora.getNumero2());
                break;
            case 0:
                System.out.println("Fechando o programa. Obrigado!");
                break;
            default:
                System.out.println("Erro na escolha de opções.");
                break;
        }
        if (escolha != 0) {
            System.out.println("Resultado: " + calculadora.obterResultado());
        }
    }

    private static void exibirMenu() {
        System.out.println("----------------------------");
        System.out.println("Bem vindo à calculadora!");
        System.out.println("Escolha uma opção abaixo: ");
        System.out.println("----------------------------");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("0 - Sair do programa");
        System.out.println("----------------------------");
    }
}