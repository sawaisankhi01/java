import java.util.Scanner;

public class AssignmentConditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //***1***-----------check the square from length and breadth--------------//
      /*  System.out.println("Enter the length and breadth of shap");
        int l=sc.nextInt();
        int b=sc.nextInt();
        if(l==b){
            System.out.println("It is a square");
        }else{
            System.out.println("It is rectangle");
        }*/
        //***2***------------print the absolute value-----------------------------//
        /*System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a<0){
            a=a*-1;
        }
        System.out.println("The absolute value is "+a);*/
        //***3**------------- Find Profit and loss-------------------------------//
       /* System.out.println("Enter the values of CP and SP");
        int CP=sc.nextInt();
        int SP=sc.nextInt();
        if(SP>CP){
            int p=SP-CP;
            System.out.println("The total profit is "+p);
        }else {
            int l=CP-SP;
            System.out.println("The total loss is "+l);
        }*/
        //***4***-------------Check the number is +v or -v, if -v than skipped---------------//
       /* System.out.println("Enter the number ");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("The number is positive and it is " +n);
        }else {
            System.out.println("The number is negative and it is skipped.");
        }*/
        //***5***-------------Calculate marks on grades--------------------------------------//
        System.out.println("Enter the marks");
        int m=sc.nextInt();
        if(m>90&&m<=100){
            System.out.println("The grade is A+");
        } else if (m>80&&m<=90) {
            System.out.println("The grade is A");
        }else if (m>70&&m<=80) {
            System.out.println("The grade is B+");
        }else if (m>60&&m<=70) {
            System.out.println("The grade is B");
        }else if (m>50&&m<=60) {
            System.out.println("The grade is C");
        }else if (m>40&&m<=50) {
            System.out.println("The grade is D");
        }else if (m>30&&m<=40) {
            System.out.println("The grade is E");
        }else if (m>0&&m<=30) {
            System.out.println("The grade is F");
        }else {
            System.out.println("Enter valid marks");
        }
    }
}
