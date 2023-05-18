import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

       System.out.print(a*(b%10));
       System.out.print(a*((b%100)/10));
       System.out.print(a*(b/100));
       System.out.print(a*b);

    }
}
