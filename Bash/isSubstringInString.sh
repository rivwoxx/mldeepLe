#!/bin/bash

echo "Provide a string"
read inputString

echo ""
echo "Provide a substring"
read substring

if [[ $inputString  == *"$substring"* ]];
then
	echo "$substring is in string $inputString"
else
	echo "$substring is not present in $inputString"
fi

