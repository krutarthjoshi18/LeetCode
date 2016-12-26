package com.string.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by krutarthjoshi on 12/6/16.
 */
public class GroupShiftedStrings {

    public static void main(String[] args) {
        GroupShiftedStrings shiftedStrings = new GroupShiftedStrings();
        String[] input = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        System.out.println(shiftedStrings.groupStrings(input));
        getString("Kushagra");
        String s = new String("Kushagra");
        getString(s);
    }

    public static void getString(String name) {
        System.out.println(name);
    }

    public List<List<String>> groupStrings(String[] strings) {
        if (strings == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                int val = s.charAt(i) - s.charAt(i - 1);
                val += val < 0 ? 26 : 0;
                sb.append(val);
            }
            if (!map.containsKey(sb.toString())) {
                map.put(sb.toString(), new ArrayList<String>() {
                });
            }
            map.get(sb.toString()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
