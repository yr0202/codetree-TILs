import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String s = "";
        int cnt = 1;
       

        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }

        for(int i=0; i<n ; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(cnt<5){
                    s += arr[i].charAt(j);
                    cnt++;
                } else if(cnt >= 5 ){
                    s += arr[i].charAt(j);
                    cnt++;
                    System.out.println(s);
                    cnt = 1;
                    s = "";
                    
                }
                
            }
        }
        System.out.println(s);
    }
}