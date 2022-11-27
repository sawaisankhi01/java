import java.util.Scanner;

public class conditianalStatment {
    public static void main(String[] args) {
       // System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
      /*  int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }if(age>=13&&age<=17){
            System.out.println("teenager");
        }
        else {
            System.out.println("Child");
        }*/
        //-----------------------***print the larger value b/w two numbers----------------//
        System.out.println("Enter the numbers");
       /* int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("the value of a is greater than b");
        }else {
            System.out.println("the value of b is greater than a");
        }*/
        //-----------------------***check a number is even or odd***----------------//
        /*int c=sc.nextInt();
        if(c%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");*/
        //------------------***Income Tax calculator***------------------------------//
       /* int i=sc.nextInt();
        int tax;
        if (i<500000){
            tax=0;
            System.out.println(" tax is :"+tax);
        } else if (i>500000&&i<1000000) {
            tax=(int)(i*0.2);
            System.out.println(" tax="+tax);
        }else if(i>1000000) {
            tax=(int)(i*0.3);
            System.out.println(" tax="+tax);*/
        //------------------***FIND LARGEST number b/w three numbers***----------------------//
       /* int j=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        if(j>=k&&j>=l){
            System.out.println("The largest number is "+j);

    }else if (k>=l){
            System.out.println("The largest number is "+k);
        }else{
            System.out.println("The largest number is "+l);*/
        //-----------***TERNARY OPERATOR**-------------------------------//
       /* int n=sc.nextInt();
        String s=(n%2==0)? "even":"odd";
        System.out.println(s);
        int marks=sc.nextInt();
        String result=(marks<=33)?"fail":"pass";
        System.out.println("The result of student is "+result);*/
        //------------------***SWITCH CASES***----------------------------------//
        /*int t=sc.nextInt();
        switch (t){
            case 1 :
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("pichke");
                break;
            case 3:
                System.out.println("milkcake");
                break;
            default:
                System.out.println("bhukh koni");
        }*/
        //--------***Calculator***-------------------
       /* int g=sc.nextInt();
        int h=sc.nextInt();
        System.out.println("Enter the type of operation");
        String op=sc.next();
        switch (op){
            case "+":
                    int s=g+h;
                System.out.println("The addition of two numbers id "+s);
                break;
            case "-":
                 s=g-h;
                System.out.println("The subtraction is "+s);
                break;
            case "*":
                s=g*h;
                System.out.println("The multiplication is "+s);
                break;
            case "/":
                s=g/h;
                System.out.println("The divide is "+s);
                break;
            case "%":
                s=g%h;
                System.out.println("The modulo is "+s);
                break;
            default:
                System.out.println("No operation is selected");
                }*/
        //------------***NUMBER IS DIVISIBLE BY 3 OR 5***------------------------------//
        int p=sc.nextInt();
        String var=(p%3==0 ||p%5==0)?"divisible ":"Not divisible";
        System.out.println(var);


    }
}
