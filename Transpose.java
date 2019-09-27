import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string \n");
        String s = sc.nextLine();
        String[] s1 = s.split(" ");

        for(int i=0; i<s1.length; i++){
            for(int j=s1[i].length()-1; j>=0; j--){
                System.out.print(s1[i].charAt(j));
            }
            System.out.print(" ");
        }


    }
}