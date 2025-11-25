
from calculation import Calculation
from result_file_manager import ResultFileManager

def main():
    calc = Calculation()
    manager = ResultFileManager()

    try:
        x = float(input("Введiть значення x: "))

        y = calc.calculate(x)
        print(f"Обчислено: y = {y:.3f}")

        manager.write_text("result.txt", x, y)
        manager.write_binary("result.bin", x, y)
        print("Результати записано у файли result.txt та result.bin")

        manager.read_text("result.txt")
        
        manager.read_binary("result.bin")

    except ArithmeticError as e:
        print(f"Помилка обчислення: {e}")
    except IOError as e:
        print(f"Помилка файлу: {e}")

if __name__ == "__main__":
    main()

