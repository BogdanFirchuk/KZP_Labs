# Введення розміру матриці
n = int(input("Enter matrix size: "))
symbol = input("Enter symbol: ")

# Створюємо зубчатий масив (спочатку порожній)
jagged = [[] for _ in range(n)]

# Верхня частина — порожні рядки
for i in range(n // 2):
    jagged[i] = []

# Нижня частина — формуємо трикутник
for i in range(n // 2, n):
    row_length = 2 * (i - n // 2) + 1
    jagged[i] = [symbol] * row_length

# Вивід трикутника по центру
for row in jagged:
    spaces = (n - len(row)) // 2
    print(" " * spaces + "".join(row))


