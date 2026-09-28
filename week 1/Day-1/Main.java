import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        if (a > b) {
            System.out.println("a is greater");
        }
        else if (b > a) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("Both are equal");
        }
    }
}
