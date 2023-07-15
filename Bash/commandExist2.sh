#!/bin/bash

command=neofetch

if command -v $command
then 
	echo "$command is available, lets run it..."
else
	echo "$command is NOT available, installing it..."
	sudo apt update && sudo apt install -y neofetch
fi

$command
