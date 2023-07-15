#!/bin/bash

expr 10 + 20
expr 100 \* 4

num1=100
echo $num1
num2=50
echo $num2
echo ""

#sum =expr $num1 + $num2
echo "The sum of $num1 + $num2 is: "
echo "remember to use 'expr' and \* if you want to multiply"
expr $num1 + $num2
