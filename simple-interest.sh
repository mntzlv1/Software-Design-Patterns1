#!/bin/bash
# simple-interest.sh
# Calculate simple interest
read -p "Enter principal: " principal
read -p "Enter rate of interest: " rate
read -p "Enter time (in years): " time
interest=$(echo "$principal * $rate * $time / 100" | bc)
echo "Simple interest is: $interest"
