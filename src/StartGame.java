import java.util.Scanner;

public class StartGame {

    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int code = 0;

        while (ticTacToe.getCount() < 9) {
            if (code == 0) {
                System.out.println("Новый ход.");
            }
            System.out.println("Введите координату x:");
            x = in.nextInt();
            System.out.println("Введите координату y:");
            y = in.nextInt();
            code = ticTacToe.makeAMove(x, y);
            if (code != -1) {
                System.out.println("Ход выполнен успешно!");
                ticTacToe.printField();
            } else {
                System.out.println("Ячейка занята или не существует.");
                System.out.println("Повторите ввод.");
            }
        }
        System.out.println("Игра окончена!");
    }

}
