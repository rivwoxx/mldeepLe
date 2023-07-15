#!/bin/bash

echo "Provide a string"
read inputString

stringLength=${#inputString}

lowercase=$(echo $inputString | tr '[:upper:]' '[:lower:]')

echo $lowercase

for (( i=$stringLength-1; i>=0; i-- ));
do
	reverseString=$reverseString${lowercase:$i:1}
done

echo "Reversed String:  $reverseString"

if [[ $lowercase == $reverseString ]];
then
	echo "$inputString is a palindrome"
else
	echo "$inputString is NOT a palindrome"
fi
