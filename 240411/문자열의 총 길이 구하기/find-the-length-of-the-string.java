import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String[] arr = new String[10];
        int sum = 0;

        for(int i=0; i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            sum += arr[i].length();
        }
        System.out.println(sum);
    }
}