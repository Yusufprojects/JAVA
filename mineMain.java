import java.util.Scanner;

public class mineMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to mine field game!");
        System.out.println("Please enter dimensions! ");
        System.out.print("Row:");
        int row = input.nextInt();
        System.out.print("Column:");
        int column = input.nextInt();

        minesweeper mine  = new minesweeper(row, column);
        mine.run();

    }
}
