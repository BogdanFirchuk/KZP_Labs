package KI304FirchukLab4;

public class Calculation {

    public double calculate(double x) throws ArithmeticException {
        double denominator = x - Math.cos(2 * x);

        if (Math.abs(denominator) < 0.001) {
            throw new ArithmeticException("Дiлення на нуль: x - cos(2x) = 0");
        }
        return Math.sin(x - 9) / denominator;
    }
}
