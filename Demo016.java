package Core_java;

class palindrome {
    boolean ispalindromeof3digits(int n) {
        return (n / 100) == (n % 10);
    }
}

public class Demo016 {
    public static void main(String[] args) {
        palindrome obj = new palindrome();
        int n = 131;
        System.out.println(obj.ispalindromeof3digits(n));
    }

}
