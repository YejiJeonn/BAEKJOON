import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int oven = sc.nextInt();

        sc.close();

        M += oven;
        if(M < 60){
            System.out.println(H + " " + M);
        }
        else if(M >= 60){
            H = H + M/60;
            M = M%60;

            if(H >= 24){
                H = H%24;
            }

            System.out.println(H + " " + M);
        }
    }
}
