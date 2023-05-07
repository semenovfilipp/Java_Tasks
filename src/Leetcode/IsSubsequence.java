package Leetcode;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */


class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "alasdbloocl"));
    }
    public static boolean isSubsequence(String s, String t) {
        //Первая строка должна быть больше второй
        if (s.length() > t.length()){
            return false;
        }
        //Индексы для итерации
        int sSymbIndex = 0;
        int tSymbIndex = 0;
        //Сравниваем каждый символ строк по индексу
        while (sSymbIndex < s.length()){
            if (s.charAt(sSymbIndex) == t.charAt(tSymbIndex)) sSymbIndex++;
            tSymbIndex++;

        }
        //Если индекс == длине вернется true, иначе false
        return (sSymbIndex == s.length());
    }
}