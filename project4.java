import java.util.Scanner;

public class project4 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        double balanceYusuf = 20000;
        String yusufIban = "TR45 1234 5678 9500";
        String yusufID = "yusuf11";
        String yusufPW = "1514";



        double balanceEsra = 7500;
        String esraIban = "TR45 1324 3548 5900";
        String esraID = "esra08";
        String esraPW = "2803";


        System.out.println("Welcome Our Bank Please Enter Your Information");

        System.out.print("Enter a User ID: ");
        String Id= scanner.nextLine();

        System.out.print("Enter a password: ");
        String password= scanner.nextLine();

        String options = "Show balance --> 1\n" +
                "Withdraw --> 2\n" +
                "Deposit to another account --> 3\n" +
                "For quit --> Q ";

        if (Id.equals("yusuf11") && password.equals("1514"))
        {
            System.out.println("Entered to Yusuf's account");
            System.out.println(options);

            System.out.println("Please enter a number: ");
            String numbery = scanner.nextLine();

            switch(numbery)
            {
                case "1":
                    System.out.println("Balance: "+balanceYusuf);
                    break;

                case "2":
                    System.out.print("Enter withdraw amount: ");
                    int withdrawy = scanner.nextInt();
                    if (balanceYusuf >= withdrawy){
                        System.out.println("Money has been deducted from your account");
                        balanceYusuf -= withdrawy;
                        System.out.println("Final Balance: "+balanceYusuf);
                    }
                    else
                    {
                        System.out.println("You can not do this treatment");
                    }
                    break;

                case "3":
                    System.out.println("How much do you want to deposit: ");
                    int deposity = scanner.nextInt();
                    if (deposity <= balanceYusuf)
                    {
                        System.out.println("Please enter the Iban no: ");
                        scanner.nextLine();
                        String  siban = scanner.nextLine();
                        if (siban.equals(esraIban))
                        {
                            System.out.println("The money will be sent to Esra");
                            balanceYusuf -= deposity;
                            balanceEsra += deposity;
                        }
                        else
                        {
                            System.out.println("There is not that person");
                        }

                    }
                    break;
            }


        }
        else if (Id.equals("esra08") && password.equals("2803"))
        {
            System.out.println("Entered to Esra's account");
            System.out.println(options);

            System.out.println("Please enter a number: ");
            String numbere = scanner.nextLine();
            switch(numbere)
            {
                case "1":
                    System.out.println("Balance: "+balanceEsra);
                    break;

                case "2":
                    System.out.print("Enter withdraw amount: ");
                    int withdrawy = scanner.nextInt();
                    if (balanceEsra >= withdrawy){
                        System.out.println("Money has been deducted from your account");
                        balanceEsra -= withdrawy;
                        System.out.println("Final Balance: "+balanceEsra);
                    }
                    else
                    {
                        System.out.println("You can not do this treatment");
                    }
                    break;

                case "3":
                    System.out.println("How much do you want to deposit: ");
                    int deposite = scanner.nextInt();
                    if (deposite <= balanceEsra)
                    {
                        System.out.println("Please enter the Iban no: ");
                        scanner.nextLine();
                        String  siban = scanner.nextLine();
                        if (siban.equals(yusufIban))
                        {
                            System.out.println("The money will be sent to Yusuf");
                            balanceYusuf += deposite;
                            balanceEsra -= deposite;
                        }
                        else
                        {
                            System.out.println("There is not that person");
                        }

                    }
                    break;
            }
        }
        else
        {
            System.out.println("Wrong Try");
        }
    }
}
