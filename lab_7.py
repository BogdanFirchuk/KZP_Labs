#Entering the matrix size
n = int(input("Enter matrix size: "))
symbol = input("Enter symbol: ")

#Create a jagged array (initially empty)
jagged = [[] for _ in range(n)]

#Top part - empty lines
for i in range(n // 2):
    jagged[i] = []

# The lower part - we form a triangle
for i in range(n // 2, n):
    row_length = 2 * (i - n // 2) + 1
    jagged[i] = [symbol] * row_length

#Center triangle output
for row in jagged:
    spaces = (n - len(row)) // 2
    print(" " * spaces + "".join(row))


