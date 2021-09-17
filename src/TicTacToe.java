import java.util.Scanner;

public class TicTacToe {

    private final SquareMatrix field = new SquareMatrix();
    private int count = 0;

    static class SquareMatrix {

        private char[][] arr;
        private int n;

        SquareMatrix() {
            n = 3;
            arr = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = '-';
                }
            }
        }

        SquareMatrix(int n) {
            this.n = n;
            arr = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = '-';
                }
            }
        }

        SquareMatrix(char[][] arr, int n) {
            this.n = n;
            arr = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    this.arr[i][j] = arr[i][j];
                }
            }
        }

        private void setArrIJ(int i, int j, char value) {
            arr[i][j] = value;
        }

        private char getArrIJ(int i, int j) {
            return arr[i][j];
        }

        private int getN() {
            return n;
        }

        private void setN(int n) {
            this.n = n;
        }

        private void printArray() {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j != n - 1) {
                        System.out.print(arr[i][j] + " | ");
                    } else {
                        System.out.print(arr[i][j]);
                    }
                }
                System.out.println();
                if (i != n - 1) {
                    System.out.println("---------");
                }
            }
        }
    }

    private int makeAMove(int i, int j) {

        char move;
        if (i > 2 || i < 0 || j > 2 || j < 0 || field.getArrIJ(i, j) != '-') {
            return -1;
        }

        if (count % 2 == 0) {
            move = 'x';
        } else {
            move = 'o';
        }

        count++;

        field.setArrIJ(i, j, move);

        if (field.arr[0][0] == 'x' && field.arr[0][1] == 'x' && field.arr[0][2] == 'x') {
            count = 9;
        }
        if (field.arr[1][0] == 'x' && field.arr[1][1] == 'x' && field.arr[1][2] == 'x') {
            count = 9;
        }
        if (field.arr[2][0] == 'x' && field.arr[2][1] == 'x' && field.arr[2][2] == 'x') {
            count = 9;
        }
        if (field.arr[0][0] == 'x' && field.arr[1][0] == 'x' && field.arr[2][0] == 'x') {
            count = 9;
        }
        if (field.arr[0][1] == 'x' && field.arr[1][1] == 'x' && field.arr[2][1] == 'x') {
            count = 9;
        }
        if (field.arr[0][2] == 'x' && field.arr[1][2] == 'x' && field.arr[2][2] == 'x') {
            count = 9;
        }
        if (field.arr[0][2] == 'x' && field.arr[1][1] == 'x' && field.arr[2][0] == 'x') {
            count = 9;
        }
        if (field.arr[0][0] == 'x' && field.arr[1][1] == 'x' && field.arr[2][2] == 'x') {
            count = 9;
        }

        if (field.arr[0][0] == 'o' && field.arr[0][1] == 'o' && field.arr[0][2] == 'o') {
            count = 9;
        }
        if (field.arr[1][0] == 'o' && field.arr[1][1] == 'o' && field.arr[1][2] == 'o') {
            count = 9;
        }
        if (field.arr[2][0] == 'o' && field.arr[2][1] == 'o' && field.arr[2][2] == 'o') {
            count = 9;
        }
        if (field.arr[0][0] == 'o' && field.arr[1][0] == 'o' && field.arr[2][0] == 'o') {
            count = 9;
        }
        if (field.arr[0][1] == 'o' && field.arr[1][1] == 'o' && field.arr[2][1] == 'o') {
            count = 9;
        }
        if (field.arr[0][2] == 'o' && field.arr[1][2] == 'o' && field.arr[2][2] == 'o') {
            count = 9;
        }
        if (field.arr[0][2] == 'o' && field.arr[1][1] == 'o' && field.arr[2][0] == 'o') {
            count = 9;
        }
        if (field.arr[0][0] == 'o' && field.arr[1][1] == 'o' && field.arr[2][2] == 'o') {
            count = 9;
        }

        return 0;
    }

    private int getCount() {
        return count;
    }

    private void printField() {
        field.printArray();
    }

    public void startGame() {

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