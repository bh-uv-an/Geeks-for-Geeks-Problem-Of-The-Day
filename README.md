# Geeks-for-Geeks-Problem-Of-The-Day-1--01-01-2024
Array Pair Sum Divisibility Problem

Given an array of integers nums and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

Example 1 :

Input : 
nums = [9, 5, 7, 3]
k = 6
Output: 
True
Explanation: 
{(9, 3), (5, 7)} is a 
possible solution. 9 + 3 = 12 is divisible by 6 and 7 + 5 = 12 is also divisible by 6.

Example 2:

Input : 
nums = [4, 4, 4]
k = 4
Output: 
False
Explanation: 
You can make 1 pair at max, leaving a single 4 unpaired.

Example 3:

Input : 
nums = [9, 5, 2, 3]
k = 6
Output: 
False
Explanation: 
{(9, 5), (9, 2)} is not divisible 
by 6 and 9 + 5 = 14 is not divisible by 6 also 9 + 2 = 11 is also not divisible by 6. 
