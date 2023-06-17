import numpy as np
import matplotlib.pyplot as plt
# A function to create a dataset.
from sklearn.datasets import make_regression
# A library for data manipulation and analysis.
import pandas as pd
# import w3_unittest
# Some functions defined specifically for this notebook.
# import w3_tools

# Output of plotting commands is displayed inline within the Jupyter notebook.
# % matplotlib inline  

# Set a seed so that the results are consistent.
np.random.seed(3) 


# Datasets
m = 30

X, Y = make_regression(n_samples=m, n_features=1, noise=20, random_state=1)

X = X.reshape((1, m))
Y = Y.reshape((1, m))

print('Training dataset X:')
print(X)
print('Training dataset Y')
print(Y)


plt.scatter(X,  Y, c="black")

plt.xlabel("$x$")
plt.ylabel("$y$")


# Exercise 1
# What is the shape of the variables X and Y? In addition, how many training examples do you have?

#Shape of variable X
print('Shape of variable X: ', X.shape)
# Shape of variable Y.
print('Shape of variable Y: ', Y.shape)
# training set size
m = X.shape[1]
print('Training set size: ', m)


# Exercise 2
# Define two variables:

# n_x: the size of the input layer
# n_y: the size of the output layer

# GRADED FUNCTION: layer_sizes
def layer_sizes(X, Y):
    #Size of input layer
    n_x = X.shape[0]
    # Size of output layer
    n_y = Y.shape[0]
    
    return (n_x, n_y)

(n_x, n_y) = layer_sizes(X, Y)
print("The size of the input layer is: n_x = " + str(n_x))
print("The size of the output layer is: n_y = " + str(n_y))


# Exercise 3
# Implement the function initialize_parameters().

# Instructions:

# Make sure your parameters' sizes are right. Refer to the neural network figure above if needed.
# You will initialize the weights matrix with random values.
# Use: np.random.randn(a,b) * 0.01 to randomly initialize a matrix of shape (a,b).
# You will initialize the bias vector as zeros.
# Use: np.zeros((a,b)) to initialize a matrix of shape (a,b) with zeros.


# GRADED FUNCTION: initialize_parameters
def initialize_parameters(n_x, n_y):
    # Initialize the weights matrix randomly
    W = np.random.randn(n_y, n_x) * 0.01
    # Initialize the bias vector as zeros
    b = np.zeros((n_y, 1))
    
    return W, b

parameters = initialize_parameters(n_x, n_y)
print("W = " + str(parameters["W"]))
print("b = " + str(parameters["b"]))


# Exercise 4
# Implement forward_propagation().

# Instructions:

# Look at the mathematical representation of your model  (4)
#   in the section 1.2:
# 𝑍𝑌̂ =𝑤𝑋+𝑏=𝑍,
 
# The steps you have to implement are:
# Retrieve each parameter from the dictionary "parameters" (which is the output of initialize_parameters()) by using parameters[".."].
# Implement Forward Propagation. Compute Z multiplying arrays w, X and adding vector b. Set the prediction array  𝐴
#   equal to  𝑍
#  .

#Function forward_propagation
def forward_propagation(X, parameters):
    # Retrieve the parameters from the dictionary "parameters" 
    W = parameters["W"]
    b = parameters["b"]
    
    # Compute Z
    Z = np.dot(W, X) + b
    Y_hat = Z
    
    return Y_hat

Y_hat = forward_propagation(X, parameters)

print(Y_hat)

#Function compute_cost
def compute_cost(Y_hat, Y):
    m = Y_hat.shape[1]
    
    cost = np.sum((Y_hat - Y)**2) / (2 * m)
    return cost

print("cost = " + str(compute_cost(Y_hat, Y)))

# parameters = w3_tools.train_nn(parameters, Y_hat, X, Y)

print("W = " + str(parameters["W"]))
print("b = " + str(parameters["b"]))


#Build a neural network model in nm_model().
def nn_model(X, Y, num_iterations=10, print_cost=False):
    n_x = layer_sizes(X, Y)[0]
    n_y = layer_sizes(X, Y)[1]
    
    # Initialize parameters
    parameters = initialize_parameters(n_x, n_y)
    
    #loop (gradient descent)
    for i in range(0, num_iterations):
        # Forward propagation. Inputs: "X, parameters". Outputs: "Y_hat".
        Y_hat = forward_propagation(X, parameters)
        
        # Cost function. Inputs: "Y_hat, Y". Outputs: "cost".
        cost = compute_cost(Y_hat, Y)
        
        # Print the cost every iteration.
        if print_cost:
            print ("Cost after iteration %i: %f" %(i, cost))
            
    return parameters

parameters = nn_model(X, Y, num_iterations=15, print_cost=True)
print("W = " + str(parameters["W"]))
print("b = " + str(parameters["b"]))

W_simple = parameters["W"]
b_simple = parameters["b"]


df = pd.read_csv('train.csv')
X_multi = df[['GrLivArea', 'OverallQual']]
Y_multi = df['SalePrice']

print(f"X_multi:\n{X_multi}\n")
print(f"Y_multi:\n{Y_multi}\n")

X_multi_norm = (X_multi - np.mean(X_multi))/np.std(X_multi)
Y_multi_norm = (Y_multi - np.mean(Y_multi))/np.std(Y_multi)

X_multi_norm = np.array(X_multi_norm).T
Y_multi_norm = np.array(Y_multi_norm).reshape((1, len(Y_multi_norm)))

print ('The shape of X: ' + str(X_multi_norm.shape))
print ('The shape of Y: ' + str(Y_multi_norm.shape))
print ('I have m = %d training examples!' % (X_multi_norm.shape[1]))

# Exercise 6
# Run the constructed above neural network model nn_model() for 100 iterations, passing the training dataset saved in the arrays X_multi_norm and Y_multi_norm.

parameters_multi = nn_model(X_multi_norm, Y_multi_norm, num_iterations=100, print_cost=True)


