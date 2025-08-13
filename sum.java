import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first num: ");
        int a = sc.nextInt();

        System.out.print("Enter a second num: ");
        int b = sc.nextInt();

        int sum = a+b;
        
        System.out.println("sum= "+ sum);
        sc.close();
    }
}