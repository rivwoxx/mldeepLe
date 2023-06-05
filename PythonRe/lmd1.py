
# Lamda function to sum a given number plus 15
x = input("Give me a number:  ")
print(f"The sum of {x} and 15 is {(lambda x: x + 15)(int(x))}")

x = input("Give me a number:  ")
y = input("Give me another number: ")

print(f"The multiplication of {x} and {y} is {(lambda x, y: x * y)(int(x), int(y))}")

