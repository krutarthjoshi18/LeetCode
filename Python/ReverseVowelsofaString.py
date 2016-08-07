"""
Created by krutarthjoshi on 7/21/16.
345. Reverse Vowels of a String
Write a function that takes a string as input and reverse only the vowels of a string.
Example 1:
Given s = "hello", return "holle".
Example 2:
Given s = "leetcode", return "leotcede".
"""


def reverse_vowels(s):
    l = len(s)
    low = 0
    high = l - 1
    vowels = ['a', 'e', 'i', 'o', 'u']
    string_list = list(s)
    while low <= high:
        if string_list[low].lower() not in vowels and string_list[high].lower() not in vowels:
            low += 1
            high -= 1
        elif string_list[low].lower() not in vowels and string_list[high].lower() in vowels:
            low += 1
        elif string_list[low].lower() in vowels and string_list[high].lower() not in vowels:
            high -= 1
        else:
            temp = string_list[low]
            string_list[low] = string_list[high]
            string_list[high] = temp
            low += 1
            high -= 1

    return "".join(string_list)


def main():
    print(reverse_vowels("aE"))


main()
"""208ms"""
