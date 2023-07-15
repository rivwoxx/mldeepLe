#!/bin/bash

number=$1


if (( $number == 2 ))
then
	echo "$number is prime"
elif (( $number < 2 || $number % 2 ==0 ))
then
	echo "$number is not a prime number"
else
	sqrtNumber=$(echo "sqrt($number)" | bc)
	echo $sqrtNumber

	for (( i=3; i<sqrtNumber; i=(( i + 2 ))));
	do
		if (( $number % i ==0 ));
		then
			echo "$number is not a prime number"
			exit 0
		fi
	done
	echo "$number is a prime number"
fi
