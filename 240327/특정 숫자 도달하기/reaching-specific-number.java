import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum=0;
        int i =0;
        double average;

        for(i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            sum = sum + arr[i];
            if(arr[i]>=250){
                sum -= arr[i];
                average = (double)sum/i;
                System.out.printf("%d %.1f",sum, average);
                break;
            }
        }

        if (i==10){
            average = (double)sum/i;
            System.out.printf("%d %.1f",sum, average);
        }
        
    }
}