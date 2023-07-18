#!/bin/bash

echo "Give me a number"
read number

if (( number % 2 == 0))
then
	echo "The number $number is odd"
else
	echo "The number $number is even"
fi
