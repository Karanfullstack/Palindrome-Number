import java.util.Scanner;

public class isPalnindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
       int num = sc.nextInt();
       int temp = num;
       int ans = 0;
       while(num!=0){
           int result = num % 10;
           ans = ans * 10 + result;
           num = num / 10;
       }
       if(ans == temp)
           System.out.println("Palindrome");
       else
           System.out.println("Not Palindrome");
    }
}
