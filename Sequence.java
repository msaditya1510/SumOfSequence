import java.util.Scanner;
public class Sequence{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter the values\na= ");
        int a=sc.nextInt();
        System.out.print("d= ");
        int d=sc.nextInt();
        if(d==0){
            System.out.println("Common Difference can't be zero!");
            return;
        }
        System.out.print("b= ");
        int b=sc.nextInt();
        int sum=0;
        System.out.print("\nSequence : ");
        for(int i=a;i<=b;i+=d){
            if(i%2==0)
            {sum+=i;}
            System.out.print(i+" ");
        }
        System.out.println("\nSum of even numbers is "+sum);
        }
    }
}