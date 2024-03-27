import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] grade = new double[n];
        double sum=0;

        for(int i=0;i<n;i++){
            grade[i]=sc.nextDouble();
            sum += grade[i];
        }
        double average = (sum/n);

        System.out.println(String.format("%.1f",average));

        if(average>=4.0) System.out.println("Perfect");
        else if(average>=3.0) System.out.println("Good");
        else System.out.println("Poor");
    }
}