package ch05.Exercise;

public class Exercise07 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1,5,3,8,2};

        for( int x : array) {
            if (x > max) max = x;
        }

        System.out.println("max : "+max);
    }
}
