import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);

      int hour = sc.nextInt();
      int min = sc.nextInt();

      sc.close();

      if(min < 45){
        hour--;
        min = 60 - (45-min);
        if(hour < 0){
          hour = 23;
        }
        System.out.println(hour + " " + min);
      }
      else{
        System.out.println(hour + " " + (min-45));
      }

    }
}
