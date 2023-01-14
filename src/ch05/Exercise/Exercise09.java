package ch05.Exercise;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1. Num of Students | 2. Enter a score | 3. Score List | 4. Analysis | 5. Quit");
            System.out.println("--------------------------------------");
            System.out.print("Select >> ");

            int selectNo = scanner.nextInt();

            switch (selectNo){
                case 1:
                    System.out.print("Num of Students : ");
                    studentNum = scanner.nextInt();
                    scores = new int[studentNum];
                    break;
                case 2:
                    System.out.print("Enter a score ");
                    System.out.println(" ->  You have to enter "+studentNum+" students's score ");
                    for (int i=0; i< scores.length; i++){
                        System.out.print("score["+i+"] : ");
                        scores[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    for (int j = 0; j <scores.length;j++ ){
                        System.out.println("score["+j+"] : "+scores[j]);
                    }
                    break;
                case 4:
                    int maxScore = 0;
                    double avg = 0.0;
                    for (int score : scores) {
                        if (score > maxScore) maxScore = score;
                        avg += score;
                    }
                    avg /= scores.length;
                    System.out.println("Max Score : " + maxScore);
                    System.out.println("Average Score : "+ avg);
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("Wrong number ! please put a number in 1-5");
            }
        }
    }
}
