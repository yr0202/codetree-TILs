import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            int len1 = s1.length();
            int len2 = s2.length();

            for(int i=0; i<len1;i++){
                if(s1.charAt(i)!=' '){
                    System.out.print(s1.charAt(i));
                }
            }
            for(int i=0; i<len2;i++){
                if(s2.charAt(i)!=' '){
                    System.out.print(s2.charAt(i));
                }
            }
        }
}