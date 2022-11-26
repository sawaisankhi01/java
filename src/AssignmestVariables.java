import java.util.Scanner;

public class AssignmestVariables {
    public static void main(String args[])
    {
        //1.->taking two inputes and print thier product

       Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter the two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        System.out.println("The product is : "+c);
        //2-> print ASCCI value of U
        char ch=85;
        System.out.println(ch);
        //3->Take length and breadth and find area of a rectangle
        System.out.println("Enter the length and breadth of rectangle :");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int A=l*b;
        System.out.println("The area of rectangle is :"+A);
        //4->calculate the cube of a number
        System.out.println("Enter the number");
        int k=sc.nextInt();
        k=k*k*k;
        System.out.println("THe cube of number is :" +k);*/
        //5-> swap two numbers
        System.out.println("Enter the two numbers for swaping");
        int f=sc.nextInt();
        int g=sc.nextInt();
        int temp;
        System.out.println("Before swaping the numbers :"+f +" " +g);
        temp=f;
        f=g;
        g=temp;
        System.out.println("after swaping the numbers :"+f +" "+g);
    }
}
