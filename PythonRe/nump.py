import numpy as np

a = np.array([[-1,3],[3,2]], dtype=np.dtype(float))

# b = np.array([7,1], dtype=np.dtype(float))
b = np.array([7, 1], dtype=np.dtype(float))

print(f"Shape of {a.shape}") 
print(f"Shape of {b.shape}") 

print(f"The solutions is {np.linalg.solve(a,b)}")

print(f"Determinant of a is {np.linalg.det(a)}")

A_system = np.hstack((a, b.reshape((2, 1))))

print(A_system)

# print(f"{np.linalg.solve(A_system)}")
a1 = np.array([
    [3,4,-2],
    [2,-3,4],
    [1,-2,3]], dtype=np.dtype(float))
b1 = np.array([0,11,7], dtype=np.dtype(float))



result = np.linalg.solve(a1,b1)
determinant = np.linalg.det(a1)

print(f"The result of the system {a1},  {b1} is {result}")
print(f"Its determinant is {round(determinant)}")