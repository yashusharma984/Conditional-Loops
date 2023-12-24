import java.util.Scanner;

public class check_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt(); // 13131323
        int count=0;
        while(num>0)
        {
            int rem = num%10;
            if(rem == 3) // check how many times 3 are present
            {
                count++;
            }
            num=  num/10;
        }
        System.out.println( "total time number present :" +count);
    }
}
