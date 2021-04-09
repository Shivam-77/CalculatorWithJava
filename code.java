import java.util.*;
class Calculator{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Input full operation name in english  which you want to perform ");
     var operat=sc.nextLine();
     var operation=operat.toUpperCase();
     System.out.println("Input first Operand");
     var first_Operand=sc.nextInt();
     System.out.println("Input second Operand");
     var second_Operand=sc.nextInt();
     switch(operation){
         case "ADDITION":
             System.out.println(first_Operand+second_Operand);
             break;
         case "SUBSTRACTION":
             System.out.println(first_Operand-second_Operand);
             break;
        case "MULTIPLICATION":
            System.out.println(first_Operand*second_Operand);
             break;
        case "DIVISION":
            System.out.println(first_Operand+second_Operand);
             break;
        default:
            System.out.println("Invalid operation");
     }
    }
}