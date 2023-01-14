package ch04.Exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0) {
                answer += i;
            }
        System.out.printf("sum of 3's multiple: %d", answer);
    }
}