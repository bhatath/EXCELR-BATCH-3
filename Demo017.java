package Core_java;

class Sumoftwodigts {
    public static int getSumofTwoDigits(int n) {
        int a = n / 10;
        int b = n % 10;
        int sum = a + b;
        return sum;
    }
}

public class Demo017 {
    public static void main(String[] args) {
        int n = 78;
        int sum = Sumoftwodigts.getSumofTwoDigits(n);
        System.out.println("The sum of two digits is: " + sum);
    }
}