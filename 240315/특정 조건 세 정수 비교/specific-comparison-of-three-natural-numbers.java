import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x, y;
        
        if(a<=b && a<=c){
            x = 1;
        } else{
            x = 0;
        }

        if(a==b && b==c){
            y=1;
        } else{
            y=0;
        }
        System.out.println(x+" "+y);
    }
}