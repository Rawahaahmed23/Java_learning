package chapter6;
import java.util.Scanner;

public class Userinput {

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        int age = sc.nextInt();
        // String name = sc.next();//for single word
        System.out.println("Hello " + name);
    }
    
}
