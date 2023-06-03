
#Function to sum two numbers
def Add(a,b):
    return a+b

#Function to subtract two numbers
def Subtract(a,b):
    return a-b

#Function to multiply two numbers
def Multiply(a,b):
    return a*b

#Function to divide two numbers
def Divide(a,b):
    return a/b

#Funciton to calculate the average of a list of numbers
def Average(list):
    return sum(list)/len(list)

list = [1,2,3,4,5,6,7,8,9,10]
print(Average(list))

#Binary Search on list to find a number
def BinarySearch(list, number):
    if len(list) == 0:
        raise ValueError("Number not found")
    else:
        mid = len(list)//2
        if list[mid] == number:
            return True
        else:
            if list[mid] < number:
                return BinarySearch(list[mid+1:], number)
            else:
                return BinarySearch(list[:mid], number)
            
print(BinarySearch(list, 5))