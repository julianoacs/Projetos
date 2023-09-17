import java.util.Scanner;
class App {
    public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("----JoKenPo----");
    System.out.println("1 - Pedra");
    System.out.println("2 - Papel");
    System.out.println("3 - Tesoura");
    System.out.print("Digite sua opção: ");
    int player = keyboard.nextInt();
    switch (player) {
        case 1:
            System.out.println("Você escolheu Pedra");
            break;
        case 2:
            System.out.println("Você escolheu Papel");
            break;
        case 3:
            System.out.println("Você escolheu Tesoura");
            break;
        default:
            System.out.println("Opção inválida");
            break;
    }
    int computer = 0;
    computer = (int) (Math.random() * 3 + 1);
    switch (computer) {
        case 1:
            System.out.println("Computador escolheu Pedra");
            break;
        case 2:
            System.out.println("Computador escolheu Papel");
            break;
        case 3:
            System.out.println("Computador escolheu Tesoura");
            break;
    }
    if (player == computer) {
        System.out.println("Empate");
    } else if ((player == 1 && computer == 3) || (player == 2 && computer == 1)
            || (player == 3 && computer == 2)) {
        System.out.println("Você Ganhou");
    } else {
        System.out.println("Computador Ganhou");
    }
    keyboard.close();
    }
}