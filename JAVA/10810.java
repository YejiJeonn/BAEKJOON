import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[3];
        int[] arr2 = new int[n];
        Arrays.fill(arr2,0);

        for(int i=0; i<m; i++){
            for(int j=0; j<3; j++){
                arr[j] = sc.nextInt();
            }
            for(int k=arr[0]-1; k<=arr[1]-1; k++){
                arr2[k] = arr[2];
            }
        }

        sc.close();

        for(int i=0; i<n; i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
