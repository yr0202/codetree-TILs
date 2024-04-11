import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        char tmp = str.charAt(0);
        int cnt = 1;

        int len = str.length();
        for(int i=1; i<len;i++){
            if(tmp==str.charAt(i)){
                cnt++;
            }else if(tmp!=str.charAt(i)){
                result += tmp;
                result += Integer.toString(cnt);
                
                tmp = str.charAt(i);
                cnt = 1;
            }
        }
        result += tmp;
        result += Integer.toString(cnt);
        System.out.printf("%d\n%s",result.length(), result);
    }
}