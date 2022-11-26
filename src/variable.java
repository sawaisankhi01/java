import java.util.Scanner;

public class variable {
    public static void main(String[] args)
    {
        int a=10,b=20;
        int c=a+b;
        System.out.println("The sum is "+c);
        System.out.println("a="+a);
        Scanner sc=new Scanner(System.in);
        int v= sc.nextInt();
        System.out.println("THe inputed integer is "+v);
        //For character input
        Scanner d=new Scanner(System.in);
        String f=d.next();
        System.out.println("The single inputed character is "+f);
        //for a string with spaces
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        System.out.println(("the input string is : \n"+st));

    }
}
