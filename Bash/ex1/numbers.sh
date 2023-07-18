#!/bin/bash

input="numbers.txt"
count=0;
av=0;
while read -r line
do
	#echo "$line"
	av=$(( av + line))
	count=$((count + 1))
	#echo $av
done < "$input"

echo "total is $av"
echo "numbers in list $count"
avv=$(( av / count))
echo $avv
