import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());

        for(int i=1; i<=9; i++){
            // println은 자동 줄바꿈 기능 -> ln이 \n과 같은 역할이라고 생각
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
