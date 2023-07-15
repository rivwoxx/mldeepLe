#!/bin/bash
num1=20
num2=30
myNum=$(( num1 + num2 ))
echo $myNum
if [ $myNum -lt 200 ]
then
	echo "Less than 200"
else
	echo "More than 200"
fi
