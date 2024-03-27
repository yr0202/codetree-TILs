import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //입력되는 학생들 수
        int passCnt = 0;

        for(int j=0;j<n; j++){
            int sum=0;

            for(int i=0; i<4;i++){ // 한 학생당 pass/fail
            int[] score = new int[4];
            score[i]=sc.nextInt();
            sum += score[i];
            }
            double avg = (double)sum/4;
            if (avg>=60) {
                passCnt += 1;
                System.out.println("pass");
                } else {
                    System.out.println("fail");
                }
        }
        System.out.println(passCnt);
        

    }
}