package ch04.Exercise;

public class Exercise06 {
    public static void main(String[] args){
        for (int x = 1; x < 6; x++) {
            for (int y = 1; y<6; y++) {
                System.out.print("*");
                if (x == y){
                    System.out.println(' ');
                    break;
                }
            }
        }
    }
}
