import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int cnt = 0;
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.next();
        }
        char c = sc.next().charAt(0);
        for(int i=0;i<n;i++){
            int tmp = arr[i].length();
            
            if(arr[i].charAt(tmp-1)==c){
                cnt++;
                System.out.println(arr[i]);
            }
        }
        if(cnt == 0){
            System.out.println("None");
        }
    }
}