public class SquareMatrix {

    char[][] arr;
    int n;

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

    public void setArrIJ(int i, int j, char value) {
        arr[i][j] = value;
    }

    public char getArrIJ(int i, int j) {
        return arr[i][j];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void printArray() {
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
