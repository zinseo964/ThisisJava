package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args ){
        char grade = 'A';

        switch (grade){
            case 'A' -> System.out.println("Great Member");
            case 'B' -> System.out.println("Good Member");
            default -> System.out.println("Guest");
        }
    }
}
