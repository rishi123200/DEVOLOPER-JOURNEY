import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int[] marks = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        double average = total / 5.0;

        int highest = marks[0];

        for(int i = 1; i < 5; i++) {
            if(marks[i] > highest) {
                highest = marks[i];
            }
        }
       int lowest = marks[0];
       for(int i = 1; i < 5; i++) {
           if(marks[i] < lowest) {
               lowest = marks[i];
    }
}
        

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
    }
}
