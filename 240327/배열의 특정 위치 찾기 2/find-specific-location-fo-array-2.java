import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int evenSum = 0; //짝수 합
        int oddSum = 0; //홀수 합

        for(int i=0; i<10; i++){
            int n = sc.nextInt();
            if(i%2==0){ // 홀수번째
                oddSum += n;
            } else{ // 짝수번째
                evenSum += n;
            }
        }

        int result = oddSum>evenSum? (oddSum-evenSum):(evenSum-oddSum); 
        System.out.println(result);
    }
}