import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }

        char c = sc.next().charAt(0);

        int stringCnt = 0;
        double stringLength = 0;

        for(int i=0; i<n; i++){
            if(arr[i].charAt(0)==c){
                stringCnt++;
                stringLength += arr[i].length();
            }
        }
        System.out.printf("%d %.2f",stringCnt, (stringLength/stringCnt));
        // System.out.println(`${stringCnt} ${(stringLength/stringCnt)}`)
    }
}