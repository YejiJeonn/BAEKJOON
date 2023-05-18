import java.util.Scanner;       //buffered로 입력 받을 때 띄어쓰기에 따라 두개로 나눠 받는 방법은?

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        if(a > b){
            System.out.println(">");
        }
        else if(a < b){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
    }
}
