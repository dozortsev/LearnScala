package day2;

import static java.lang.String.format;
import static util.Systems.println;

public class Complex implements Addable<Complex> {

    private final double r;
    private final double i;

    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double magnitude(double r, double i) {
        return Math.sqrt(r * r + i * i);
    }

    public double angle(double r, double i) {
        return Math.atan2(i, r);
    }

    @Override public String toString() {
        return format("%s + i * %s | %s * e^(i * %s)", r, i, magnitude(r, i), angle(r, i));
    }

    @Override public Complex add(Complex that) {
        return new Complex(this.r + that.r, this.i + that.i);
    }

    public static void main(String[] args) {
        Complex complex1 = new Complex(1.1, 2.10);
        Complex complex2 = new Complex(5.7, 9.11);

        println(complex1.add(complex2));
    }
}