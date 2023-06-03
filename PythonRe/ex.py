import numpy as np

a = np.array([[7,5,3],[3,2,5],[1,2,1]], dtype=np.dtype(float))

b = np.array([120,70,20], dtype=np.dtype(float))

determinant = np.linalg.det(a)
print(determinant)

print(np.linalg.solve(a,b))

ab = np.linalg.matrix_rank(a)
print(ab)


# print diagonal matrix
print(np.diag(a))