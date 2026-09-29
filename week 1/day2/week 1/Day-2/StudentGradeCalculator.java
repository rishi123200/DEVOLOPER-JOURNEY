import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);

        if(marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
            System.out.println("Result: Pass");
        }
        else if(marks >= 75 && marks <= 89) {
            System.out.println("Grade: B");
            System.out.println("Result: Pass");
        }
        else if(marks >= 60 && marks <= 74) {
            System.out.println("Grade: C");
            System.out.println("Result: Pass");
        }
        else if(marks >= 40 && marks <= 59) {
            System.out.println("Grade: D");
            System.out.println("Result: Pass");
        }
        else {
            System.out.println("Grade: None");
            System.out.println("Result: Fail");
        }
    }
}
