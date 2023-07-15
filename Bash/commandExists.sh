#!/bin/bash

command=/usr/bin/htop

if [[ -f $command ]]
then 
	echo "$command is available, let's run it..."
	$command
else
	echo "$command is NOT available, installing it ..."
	sudo apt update && sudo apt install -y htop
fi
