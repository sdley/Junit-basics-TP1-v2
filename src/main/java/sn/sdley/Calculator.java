package sn.sdley;

public class Calculator {
    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a et b doivent etre positifs");
        }
        if (a > Integer.MAX_VALUE -b || b > Integer.MAX_VALUE - a) {
            throw new ArithmeticException("Depassement de capacite : l'addition depasse Integer.MAX_VALUE");
        }
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Division par zero non permise");
        }
        return (double) a / b;
    }

    // modulo method
    public int modulo(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Division par zero non permise");
        }
        return a % b;
    }
}
