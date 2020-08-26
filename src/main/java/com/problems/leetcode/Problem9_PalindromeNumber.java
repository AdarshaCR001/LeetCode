package com.problems.leetcode;

public class Problem9_PalindromeNumber
{
    public boolean isPalindrome(int x)
    {
        if (x < 0)
            return false;
        int num = 0;
        int temp = x;
        while (temp > 0)
        {
            num = num * 10 + temp % 10;
            temp = temp / 10;
        }

        return x == num;

    }
}
