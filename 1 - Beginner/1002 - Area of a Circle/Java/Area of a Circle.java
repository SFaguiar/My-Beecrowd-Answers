import java.util.Scanner;

class OneZeroZeroTwo {
    public static void main (String [] args) {
        double PI = 3.14159;

        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        System.out.printf("A=%.4f%n", PI * R * R);

    }

}
