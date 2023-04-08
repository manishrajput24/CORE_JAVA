// --------Write a program Person is adult or not-------//
import java.util.*;
public class ifelse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        
        if (age>18){
            System.out.println("this is an adult");
        }else{
            System.out.println("this is not an adult");
        }
    }
    
}
