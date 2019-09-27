
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ReplaceDnL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string \n");
        String s = sc.nextLine();


       s =  s.replaceAll(String.valueOf("d"), "f");
       s = s.replaceAll(String.valueOf("l"), "t");
        System.out.println(s);
    }
}
