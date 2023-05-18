import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);

        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();

        sc.close();

        int temp = 0;
        int same = 0;
        int max = 0;

        if(num[0] == num[1]){
            temp++;
            same = num[0];
        }
        if(num[1] == num[2]){
            temp++;
            same = num[1];
        }
        if(num[0] == num[2]){
            temp++;
            same = num[2];
        }
        
        if(temp == 0){
            max = Arrays.stream(num).max().getAsInt();
            System.out.println(max*100);
        }
        else if(temp == 1){
            System.out.println(1000+(same*100));
        }
        else if(temp == 3){
            System.out.println(10000+(same*1000));
        }
    }
}
