package com.string.easy;

/**
 * Created by krutarthjoshi on 10/4/16.
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconc" +
                "eivedandsodedicatedcanlongendureWeareqmetonagreatbattlef" +
                "iemldoftzhatwarWehavecometodedicpateaportionofthatfieldas" +
                "afinalrestingplaceforthosewhoheregavetheirlivesthatthatnati" +
                "onmightliveItisaltogetherfangandproperthatweshoulddothisBut" +
                "inalargersensewecannotdedicatewecannotconsecratewecannothallo" +
                "wthisgroundThebravelmenlivinganddeadwhostruggledherehaveconse" +
                "crateditfaraboveourpoorponwertoaddordetractTgheworldadswfilll" +
                "ittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhat" +
                "theydidhereItisforusthelivingrathertobededicatedheretotheulnf" +
                "inishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedIti" +
                "sratherforustobeherededicatedtothegreattdafskremainingbeforeust" +
                "hatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhi" +
                "chtheygavethelastpfullmeasureofdevotionthatweherehighlyresolveth" +
                "atthesedeadshallnothavediedinvainthatthisnationunsderGodshallhave" +
                "anewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepe" +
                "opleshallnotperishfromtheearth";
        System.out.println(longestPalindrome.longestPalindrome(s));

    }

    private int longestPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = s.length();
        if (l == 0) {
            return 0;
        }
        int[] count = new int[128];
        for (int i = 0; i < l; i++) {
            count[s.charAt(i)]++;
        }
        int length = 0;
        for (int currCount : count) {
            if (currCount % 2 == 0) {
                length += currCount;
            } else {
                length += currCount - 1;
            }
        }
        return length + 1;
    }
}
