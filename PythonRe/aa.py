#import dependencies
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

x1 = np.linspace(0, 10, 100)

fig = plt.figure()

plt.plot(x1, np.sin(x1), '-')
plt.plot(x1, np.cos(x1), '--')

plt.show()