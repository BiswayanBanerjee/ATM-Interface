import java.util.*;

interface ATMInterface {
    int withdraw(int accountBalance, int withdraw);
    int deposit(int accountBalance, int deposit);
    int checkBalance(int accountBalance);
}

class User implements ATMInterface {

    @Override
    public int withdraw(int accountBalance, int withdraw) {
        return accountBalance - withdraw;
    }

    @Override
    public int deposit(int accountBalance, int deposit) {
        return accountBalance + deposit;
    }

    @Override
    public int checkBalance(int accountBalance) {
        return accountBalance;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        User myObj = new User();
        int accountBalance = 1000;

        while (true) {
            System.out.print("1: Withdraw, 2: Deposit, 3: Check Balance, 4: End : ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Account Balance: Rs." + myObj.checkBalance(accountBalance));
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = s.nextInt();
                    accountBalance = myObj.withdraw(accountBalance, withdrawAmount);
                    System.out.println("Your New Account Balance: Rs." + accountBalance);
                    break;

                case 2:
                    System.out.println("Your Account Balance: Rs." + myObj.checkBalance(accountBalance));
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = s.nextInt();
                    accountBalance = myObj.deposit(accountBalance, depositAmount);
                    System.out.println("Your New Account Balance: Rs." + accountBalance);
                    break;

                case 3:
                    System.out.println("Your Account Balance: Rs." + myObj.checkBalance(accountBalance));
                    break;

                case 4:
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
