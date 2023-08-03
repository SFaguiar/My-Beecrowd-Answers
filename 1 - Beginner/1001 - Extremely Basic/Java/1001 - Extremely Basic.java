import java.util.Scanner;

class OneHundredAndOne {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        System.out.printf("X = %d%n", A + B);
    }
}