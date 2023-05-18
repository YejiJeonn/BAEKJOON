import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp =0;

        int[] arr = new int[2];
        int[] arr2 = new int[n];
        
        
        // 결과값 배열에 값 입력
        for(int i=0; i<n; i++){
            arr2[i] = i+1;
            System.out.println("arr2 || " + arr2[i]);
        }

        // 총 바구니 돌리는 수(m)만큼 for문
        for(int i=0; i<m; i++){
            // arr 배열에 값 2개 입력받는 for문
            for(int j=0; j<2; j++){
                arr[j] = sc.nextInt();
            }

            // 결과값 배열(arr2) 값 바꾸기
            temp = arr2[arr[0]];
            arr2[arr[0]] = arr2[arr[1]];
            arr2[arr[1]] = temp;
            System.out.println("temp " + temp + " || arr2[0] " + arr2[0] + " || arr2[1] " + arr2[1]);
        }

        for(int i=0; i<n; i++){
            System.out.print(arr2[i]);
            System.out.print(" ");
        }
        
        sc.close();
    }
}
