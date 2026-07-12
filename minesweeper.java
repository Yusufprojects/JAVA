import java.util.Random;
import java.util.Scanner;

public class minesweeper {
    int rowCount, colCount, totalCells;
    int[][] mineMap;
    int[][] playerBoard;
    boolean isGameOver = false;

    Random random = new Random();
    Scanner input = new Scanner(System.in);

    // Constructor
    minesweeper(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.mineMap = new int[rowCount][colCount];
        this.playerBoard = new int[rowCount][colCount];
        this.totalCells = rowCount * colCount;
    }

    public void run() {
        int successfulMoves = 0;
        int maxSafeMoves = totalCells - (totalCells / 4); // 25% of cells are mines

        setMines();

        System.out.println("\n--- Game Started ---");
        while (!isGameOver) {
            printBoard(playerBoard);

            System.out.print("Enter row number: ");
            int r = input.nextInt();
            System.out.print("Enter column number: ");
            int c = input.nextInt();

            // Boundary check
            if (r < 0 || r >= rowCount || c < 0 || c >= colCount) {
                System.out.println("Invalid coordinates! Please try again.");
                continue;
            }

            // Check if the cell contains a mine
            if (mineMap[r][c] != -1) {
                checkNeighbors(r, c);
                successfulMoves++;

                // Win condition
                if (successfulMoves == maxSafeMoves) {
                    System.out.println("\nCONGRATULATIONS! You Win! 🎉");
                    printBoard(playerBoard);
                    break;
                }
            } else {
                isGameOver = true;
                System.out.println("\nGAME OVER! You hit a mine. 💥");
                printBoard(mineMap); // Show mine locations on defeat
            }
        }
    }

    // Counts adjacent mines (including diagonals)
    public void checkNeighbors(int r, int c) {
        if (playerBoard[r][c] == 0) {
            for (int i = r - 1; i <= r + 1; i++) {
                for (int j = c - 1; j <= c + 1; j++) {
                    // Check array bounds
                    if (i >= 0 && i < rowCount && j >= 0 && j < colCount) {
                        if (mineMap[i][j] == -1) {
                            playerBoard[r][c]++;
                        }
                    }
                }
            }

            // If no adjacent mines, mark as opened empty cell (-2)
            if (playerBoard[r][c] == 0) {
                playerBoard[r][c] = -2;
            }
        }
    }

    // Randomly places mines on the map
    public void setMines() {
        int randRow, randCol, placedMines = 0;
        int targetMines = totalCells / 4;

        while (placedMines < targetMines) {
            randRow = random.nextInt(rowCount);
            randCol = random.nextInt(colCount);

            if (mineMap[randRow][randCol] != -1) {
                mineMap[randRow][randCol] = -1;
                placedMines++;
            }
        }
    }

    // Prints the matrix with proper spacing
    public void printBoard(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
}
