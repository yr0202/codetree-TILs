import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum=0;

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            sum = sum + arr[i];
            if(arr[i]>=250){
                sum -= arr[i];
                double average = (double)sum/i;
                System.out.printf("%d %.1f",sum, average);
                break;
            }

        }
        
    }
}