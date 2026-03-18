import java.util.Scanner;

public class Project1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your visa grade: ");
        int visa = scanner.nextInt();

        System.out.print("Enter your final grade: ");
        int finalgrade = scanner.nextInt();

        double averageGrade = (visa*0.3) + (finalgrade*0.4);

        if (averageGrade >= 60)
        {
            System.out.println(name+" "+surname+" "+"has been passed with "+averageGrade+" average");
        }
        else
        {
            System.out.println("Try again");
        }

    }
}
