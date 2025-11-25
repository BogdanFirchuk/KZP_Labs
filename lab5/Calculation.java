package KI304FirchukLab5;


public class Calculation {
    public double calculate(double x) throws ArithmeticException { // отово то виняток при обчисленні при діленні на 0
        double denominator = x - Math.cos(2 * x);
        if (Math.abs(denominator) < 0.001) {
            throw new ArithmeticException("Ділення на нуль: x - cos(2x) = 0");
        }
        return Math.sin(x - 9) / denominator;
    }
}
