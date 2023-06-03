import numpy as np

system = np.array([[4,-3,1],[2,1,3],[-1,2,-5]], dtype=np.dtype(float))

b = np.array([-10,0,17], dtype=np.dtype(float))


print(f"Matrix of the system is {system}")
print(f"Matrix of the result is {b}")

#Solve the system
determinant = np.linalg.det(system)

solution = np.linalg.solve(system,b)
print(solution)

#Row reduction
A_system = np.hstack((system,b.reshape(3,1)))
print(f"Complete matrix : {A_system}")

def MultiplyRow(matrix, row_number, row_number_multiple):
    new_matrix = matrix.copy()
    new_matrix[row_number] = new_matrix[row_number] * row_number_multiple
    new_matrix[row_number] = new_matrix[row_number-1] + new_matrix[row_number] 
    return new_matrix

print("\n")
print(f"Original system is: {A_system}")
print(f"\n Matrix after its third row is multiply by 2: {MultiplyRow(A_system, 2, 2)}")

# def AddRows(matrix, row_number1, row_number2, row_number1_multiple):
#     new_matrix = matrix.copy
#     new_matrix[row_number2] = row_number1_multiple * (new_matrix[row_number2] + new_matrix[row_number1])
#     return new_matrix

# print(f"Original system is: {A_system}")
# print(f"\n Matrix after its third row is multiply by 2: {AddRows(A_system, 1, 2, 1/2)}")