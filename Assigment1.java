public class Assigment1 {
    //problem 1
    public static int findMin(int[] arr) {
        int min = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    //problem 2
    public static double findAverage(double[] arr){
        double sum = 0.0;
        int n = arr.length;
        for (double v : arr) {
            sum += v;
        }
        return sum/n;
    }
    // problem 3
    private static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void isPrime(int n){
        if(checkPrime(n)){
            System.out.println("Prime");
        } else{
            System.out.println("Composite");
        }
    }
    //problem 4
    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }

        return n * factorial(n - 1);
    }
    //problem 5
    public static int fib(int n) {
        if (n < 2) {
            return n;
        }


        return fib(n - 2) + fib(n - 1);
    }
    //problem 6
    public static double powerOf(double a, int n){
        double res = 1.0;
        if(n == 0){
            return 1;
        }
        for(int i = 0; i < n; i++){
            res *= a;
        }
        return res;
    }
    //problem 7
    private static void printer(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                printer(rem, prefix + str.charAt(i));
            }
        }
    }
    public static void printPermutations(String str){
        printer(str, " ");
    }
    //problem 8
    private static boolean checkNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void isNumeric(String str){
        if (checkNumeric(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    //problem 9
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
    //problem 10
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
