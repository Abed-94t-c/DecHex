#!/bin/bash

# Test 1: No Input
echo "Running Test 1: No Input"
if java Dec2Hex 2>&1 | grep -q "Error: No input argument provided"; then
    echo "Test 1 Passed"
else
    echo "Test 1 Failed"
fi

# Test 2: Non-Integer Input
echo "Running Test 2: Non-Integer Input"
if java Dec2Hex abc 2>&1 | grep -q "Error: Invalid input"; then
    echo "Test 2 Passed"
else
    echo "Test 2 Failed"
fi

# Test 3: Valid Integer Input
echo "Running Test 3: Valid Integer Input"
if java Dec2Hex 15 2>&1 | grep -q "Hexadecimal representation is: F"; then
    echo "Test 3 Passed"
else
    echo "Test 3 Failed"
fi

