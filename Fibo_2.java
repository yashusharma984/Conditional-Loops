import java.util.Scanner;

public class Fibo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1= 0;
        int n2 = 1;
        int count=2;
        while (count<=num)
        {
            int temp =n2;
            n2 =n2+n1;
            n1 = temp;
            count++;
        }
        System.out.println(n2);
    }
}
