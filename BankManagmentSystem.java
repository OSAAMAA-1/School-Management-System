import java.util.Scanner;

public class BankManagmentSystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double balance = 0;

        boolean isRunning = true;

        while (isRunning == true) {
            System.out.println("-----------BANKING PROGRAMM------------");
            System.out.println("1- Show Balance");
            System.out.println("2- Deposite");
            System.out.println("3- Withdraw");
            System.out.println("4- Exit");
            System.out.println("-----------------------------------------");
            System.out.println("Enter your choice (1-4): ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is : " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposite : ");
                    double Deposite = in.nextDouble();
                    balance += Deposite;

                    System.out.println("You deposite : " + Deposite + " Your balance is : " + balance);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw : ");
                    double Withdraw = in.nextDouble();

                    balance -= Withdraw;
                    System.out.println("You withdraw : " + Withdraw + " Your balance is : " + balance);
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using our banking");
                    break;

                default:
                    System.out.println("Your choice is incorrect .Please try agein, choose between (1-4): ");

            }
        }
    }
}