 import java.util.Scanner;   //Scanneer Class 

public class Lesson_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   //Scanner Object

        System.out.print("Enter your name");
        String name = input.nextLine();

        System.out.print("Enter your age");
        int age = input.nextInt();

        System.out.println("your name is " + name + " your age is " + age );
        



 
    }
    
}

