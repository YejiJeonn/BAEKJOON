import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args)throws IOException {
        double x, y;

        Scanner sc = new Scanner(System.in);


        x = sc.nextFloat();
        y = sc.nextFloat();

        sc.close();

        System.out.print(x/y);
    }
}
