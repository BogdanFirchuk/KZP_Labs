import os


n = int(input("Enter matrix size: "))
symbol = input("Enter symbol: ")

# Створюємо зубчатий масив
jagged = [[] for _ in range(n)]

# Верхня частина
for i in range(n // 2):
    jagged[i] = []

# Нижня частина
for i in range(n // 2, n):
    row_length = 2 * (i - n // 2) + 1
    jagged[i] = [symbol] * row_length


directory = r"C:\KZp_Java\Git_labs"
filename = "trianglePY.txt"
filepath = os.path.join(directory, filename)


os.makedirs(directory, exist_ok=True)

with open(filepath, "w", encoding="utf-8") as file:
    for row in jagged:
        spaces = (n - len(row)) // 2
        line = " " * spaces + "".join(row)


        print(line)
  
        file.write(line + "\n")

print(f"\nФайл '{filename}'створений")
