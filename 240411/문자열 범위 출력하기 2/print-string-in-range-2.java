import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();

        for(int i=s.length()-1; i>s.length()-n-1;i--){
            System.out.print(s.charAt(i));
        }
    }
}