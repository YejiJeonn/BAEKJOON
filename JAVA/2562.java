import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr  = new int[9];
        int[] same = new int[9];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            same[i] = arr[i];
        }
        
        
        Arrays.sort(same);

        for(int i=0; i<9; i++){
            if(same[8] == arr[i]){
                System.out.println(arr[i]);
                System.out.println(i+1);
            }
        }
    
    }
}
