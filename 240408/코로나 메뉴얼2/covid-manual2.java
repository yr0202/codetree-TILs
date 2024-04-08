import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] symptom = new char[3];//증상
        int[] temperature = new int[3]; //체온
        int[] hospi = new int[4];

        for(int i=0;i<3;i++){
            symptom[i]=sc.next().charAt(0);
            temperature[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            if(symptom[i]=='Y'){
                if(temperature[i]>=37){
                    hospi[0]++;
                }
                else{
                    hospi[2]++;
                }
            }
            else{
                if(temperature[i]>=37){
                    hospi[1]++;
                }
                else{
                    hospi[3]++;
                }
            }
        }
        for(int i=0;i<4;i++){
            System.out.printf("%d ",hospi[i]);
        }
        if(hospi[0]>=2){
            System.out.print('E');
        }
    }
}