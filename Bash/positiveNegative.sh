#!/bin/bash

echo "Provide a number: "
read inputNumber

if [[ $inputNumber -lt 0 ]]
then
	echo "$inputNumber is negative"
else
	echo "$inputNumber is positive"
fi

