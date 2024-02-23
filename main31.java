public class Main {
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        double average = calculateAverage(num1, num2, num3);
        System.out.println("The average is: " + average);
    }
}
