
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Alphabetical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string \n");
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        Arrays.sort(s1);
        for(int i=0; i<s1.length; i++){
            System.out.print(s1[i]+ " ");
        }


    }
}