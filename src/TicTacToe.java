public class TicTacToe {

    SquareMatrix field = new SquareMatrix();
    int count = 0;

    public int makeAMove(int i, int j) {

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

    public int getCount() {
        return count;
    }

    public void printField() {
        field.printArray();
    }
}
