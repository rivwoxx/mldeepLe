import os

# Strings and numbers
# The f stands for fomart.
print(os.name)

print(f"The number {332} is a great number")
print(f"The result of {22} times {3} is {22*3}")

# with variables
pepe_lota = 22 *3
print(f"The result of {22} times {3} is {pepe_lota}")


def time_operations(x, b):
    print(f"The result of {x} times {b} is {x * b}")
    

time_operations(33,3)

# # Calling the function before defining it
# result = add_numbers(3, 5)
# print(result)

# def add_numbers(a, b):
#     return a + b

#Input

def sum(x,y):
    return x + y
    
value1 = input("Give me a number:  ")
value2 = input("Give me another number: ")
    
if value2.isdigit() and value1.isdigit():
    print(f"The sum of {value1} and {value2} is {sum(int(value1), int(value2))}")
else:
    print("Incorrect input!")
    