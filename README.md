# GeeksforGeeks 160-Day DSA Challenge

This repository contains my daily progress and solutions in Java for the GFG 160-Day DSA Challenge.

## 📅 Day 1:
- ✅ Second Largest Number in Array
- ✅ Move Zero At Last
- ✅ Reverse Array

## 📅 Day 2:
- ✅ Rotate Array
- ✅ Next Permutation

## 📅 Day 3:

- ✅ 1.Majority Element II

 Question -You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format.

Examples:

Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.



- ✅ 2.Stock Buy and Sell – Multiple Transaction Allowed

  Question - The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.

Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.

Examples:

Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210. Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655. Maximum Profit = 210 + 655 = 865.


## 📅 Day 4:

- ✅ 1.Stock Buy and Sell – Max one Transaction Allowed
Question - Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.


## 📅 Day 5:

- ✅ 1.Minimize the Heights II

Question -Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.

Examples :

Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.
Input: k = 3, arr[] = {3, 9, 12, 16, 20}
Output: 11
Explanation: The array can be modified as {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.The difference between the largest and the smallest is 17-6 = 11. 

## 📅 Day 6:

- ✅ 1.Kadane's Algorithm

Question -Given an integer array arr[]. You need to find the maximum sum of a subarray.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray {-2} has the largest sum -2.


## 📅 Day 7:

- ✅ 11.Maximum Product Subarray

Question -Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].

Note: It is guaranteed that the output fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.
Input: arr[] = [-1, -3, -10, 0, 6]
Output: 30
Explanation: The subarray with maximum product is {-3, -10} with product = (-3) * (-10) = 30


## 📅 Day 8:

- ✅ 12.Max Circular Subarray Sum

Question -Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].

Note: It is guaranteed that the output fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.
Input: arr[] = [-1, -3, -10, 0, 6]
Output: 30
Explanation: The subarray with maximum product is {-3, -10} with product = (-3) * (-10) = 30

## 📅 Day 9:
- ✅ 13.Smallest Positive Missing

Question -You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

Note: Positive number starts from 1. The array can have negative integers too.

Examples:

Input: arr[] = [2, -3, 4, 1, 1, 7]
Output: 3
Explanation: Smallest positive missing number is 3.

## 📅 Day 10:
- ✅ 14.Implement Atoi

Question -Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.

Cases for atoi() conversion:

Skip any leading whitespaces.
Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.
Examples:

Input: s = "-123"
Output: -123
Explanation: It is possible to convert -123 into an integer so we returned in the form of an integer
Input: s = "  -"
Output: 0
Explanation: No digits are present, therefore the returned answer is 0.

## 📅 Day 11:
- ✅ 15.Add Binary Strings

Question -Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100

## 📅 Day 12:
- ✅ 16.Anagram

Question -Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, "act" and "tac" are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.

Note: You can assume both the strings s1 & s2 are non-empty.

Examples :

Input: s1 = "geeks", s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.


## 📅 Day 13:
- ✅ 17.Non Repeating Character

Question -Given a string s consisting of lowercase English Letters. Return the first non-repeating character in s.
If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.

## 📅 Day 14:
- ✅ 18.Search Pattern (KMP-Algorithm)

Question -Given two strings, one is a text string txt and the other is a pattern string pat. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices. 
Note: Return an empty list in case of no occurrences of pattern.

Examples :

Input: txt = "abcab", pat = "ab"
Output: [0, 3]
Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3. 
Input: txt = "abesdu", pat = "edu"
Output: []
Explanation: There's no substring "edu" present in txt.