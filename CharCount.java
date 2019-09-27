
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string \n");
        String s = sc.nextLine();
        System.out.println("Enter the character: ");
        char c = sc.next().charAt(0);
        int length1 = s.length();
        int length2 = s.replaceAll(String.valueOf(c), "").length();
        System.out.println(length1-length2);
    }
}
