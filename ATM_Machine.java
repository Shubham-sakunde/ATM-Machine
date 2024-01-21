package projects.ATM_Machine;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5674;

    public void checkPin() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter your pin: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner scanner = new Scanner(System.in);
        int enteredpin = scanner.nextInt();

        if (enteredpin == PIN) {
            menu();
        } else {

            System.out.println("Enter a valid pin");

            checkPin();
        }
    }

    public void menu() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Enter Your Choice: ");
        System.out.println("----------------------------------------------------------------------");

        System.out.println("1. Check A/C Balance" + "     "+"2.Deposit Money2" + "     "  +"3. Withdraw Money"+"     "+"4. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice){

            case 1:
                checkBalance();
                break;

            case 2:
                depositMoney();
                break;

            case 3:
                withdrawMoney();
                break;

            case 4:
                exitMenu();
                break;

            default:
                System.out.println("Select Valid Choice");
        }
    }

    public void checkBalance(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Balance: Rs " + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter the amount: ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();

        if(amount > Balance){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Amount withdraw successfully");
        }

        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount: ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();

        Balance = Balance + amount;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Amount deposited successfully");
        menu();
    }

    public void exitMenu(){
        return;
    }
}

public class ATM_Machine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}
