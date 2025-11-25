
import math

class Calculation:
    def calculate(self, x: float) -> float:
        denominator = x - math.cos(2 * x)
        if abs(denominator) < 0.001:
            raise ArithmeticError("Дiлення на нуль: x - cos(2x) = 0")

        y = math.sin(x - 9) / denominator
        return y
