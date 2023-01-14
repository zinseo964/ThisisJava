package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error : Plz put 2 numbers in commandline");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int result = num1 + num2;
        System.out.printf("%d + %d = %d\n", num1, num2, result);
    }
}
