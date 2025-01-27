package calcu2;

public class Calcu2 {

    static double a;
    static double b;

    public Calcu2() {

    }

    public static void setA(double a) {
        Calcu2.a = a;
    }

    public static void setB(double b) {
        Calcu2.b = b;
    }

    public static void suma() {

        double suma = getA() + getB();
        System.out.println("La suma de " + getA() + " + " + getB() + " = " + suma);

    }

    public static void resta() {
        double resta = getA() - getB();
        System.out.println("La rest de " + getA() + " - " + getB() + " =  " + resta);
    }

    public static void division() {

        if (a != 0 && b != 0) {
            double division = getA() / getB();
            System.out.println("La division de " + getA() + " / " + getB() + " = " + division);
        } else {
            System.out.println("Error: División por cero.");
        }
    }

    public static double getA() {
        return a;
    }

    public static double getB() {
        return b;
    }
}
