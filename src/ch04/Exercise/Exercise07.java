package ch04.Exercise;

import java.util.Scanner;
public class Exercise07 {
    public static void main(String[] args){
        boolean run = true;
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

/*        Total :*/
        while (run){
            System.out.println("---------------------------------");
            System.out.println("1. Deposit | 2. Withdraw | 3. Balance | 4. Quit");
            System.out.println("---------------------------------");
            System.out.print("Choosing : ");
            int chosen = scanner.nextInt();
            switch (chosen) {
                case 1 -> {
                    System.out.print("Deposit Money : ");
                    balance += scanner.nextInt();
                }
                case 2 -> {
                    System.out.println("Withdraw Money : ");
                    balance -= scanner.nextInt();
                }
                case 3 -> System.out.printf("Balance : %d\n", balance);
                case 4 ->
//                    break Total;
                        run = false;
            }
        }
        System.out.println("System over");
    }
}
