package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("code._4_student_effort.FizzBuzz, ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else if (i % 7 == 0) {
                System.out.print("Rizz, ");
            } else if (i % 11 == 0) {
                System.out.print("Jazz, ");
            } else {
                System.out.print(i + ", ");
            }
        }

        System.out.print("Buzz");
    }
}
