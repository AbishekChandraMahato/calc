import java.util.Scanner;

public class Main {
    private static float num1;
    private static float num2;

    public static float getNum1() {
        return num1;
    }



    public static float getNum2() {
        return num2;
    }




    public static void main(String[] args) {

        System.out.println("Enter an operator");
        String oper;

        Scanner sc=new Scanner(System.in);
        oper=sc.nextLine();

        System.out.println("Enter first num:");
        num1=sc.nextFloat();

        System.out.println("Enter second num:");
        num2=sc.nextFloat();

        if(oper.equals("+")){

            Add.addition();


        }
        else if(oper.equals("-")){

            Substract.substraction();
        }
        else if(oper.equals("*")){
            Multiply.multiplication();
        }

    }
}
