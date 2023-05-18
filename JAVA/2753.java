import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());

        if(a%4==0){
          if(a%400==0){                 // a%100==0 조건문이 위로 올라오면 왜 틀리는지?
            System.out.println("1");
          }  
          else if(a%100==0){            // 왜 if문으로 바꿔도 틀렸다고 하는지?
            System.out.println("0");
          }
          else{
            System.out.println("1");
          }
        }
        else{
          System.out.println("0");
        }
    }
}
