import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int rev =0;

        while(num!=0){
            int digit = num%10;
            rev =rev*10+digit;
            num=num/10;
        }

        if(original==rev){
            System.out.println("Is a pallindrome");
        }
        else{
            System.out.println("Is not a pallindrome");
        }
    }
}
   