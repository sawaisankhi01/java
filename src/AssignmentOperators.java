import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
          //1.->some calculation on any variable
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println((((8+a)/3)%5)*5);
        //2.->swap two numbers from without use of third variable
        System.out.println("Enter the first number");
        int c=sc.nextInt();
        System.out.println("Enter the second number ");
        int d=sc.nextInt();
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("c="+c);
        System.out.println("d="+d);
        //3.-> some of three digit numbers
        System.out.println("Enter the number");
        int t=sc.nextInt();
        int sum=0;
        while (t>0){
            sum+=t%10;
            t/=10;

        }
        System.out.println(sum);
        //4.->check true or false condition for given
        int y=55;
        int z=70;
        System.out.println(y<50&&y<z);
        System.out.println( y<50||y<z);
        //5.->
    }
}
