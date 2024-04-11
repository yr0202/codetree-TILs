import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();

        int len = s.length();
        int cnt = 0;

        for(int i=len-1; i>=0;i--){
            if(cnt>=n) break;
            System.out.print(s.charAt(i));
            cnt++;
        }
    }
}