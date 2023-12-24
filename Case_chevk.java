import java.util.Scanner;

public class Case_chevk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

//        String word = "hello";
//        System.out.println(word.charAt(3));

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("uppercase");
        }
    }
}
