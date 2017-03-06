package com.array.hard;

import com.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krutarthjoshi on 3/4/17.
 */
public class InsertInterval {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int minStart = newInterval.start;
        int maxEnd = newInterval.end;
        for (Interval i : intervals) {
            minStart = Math.min(minStart, i.start);
            maxEnd = Math.max(maxEnd, i.end);
        }
        int[] buffer = new int[maxEnd - minStart + 1];
        for (Interval i : intervals) {
            buffer[i.start - minStart] += 1;
            buffer[i.end - minStart] -= 1;
        }
        buffer[newInterval.start - minStart] += 1;
        buffer[newInterval.end - minStart] -= 1;
        int count = 0;
        List<Interval> result = new ArrayList<>();
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] > 0) {
                if (count == 0) {
                    Interval temp = new Interval();
                    temp.start = i + minStart;
                    result.add(temp);
                }
                count += buffer[i];
            }
            if (buffer[i] < 0) {
                if (count + buffer[i] == 0) {
                    result.get(result.size() - 1).end = i + minStart;
                }
                count += buffer[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        InsertInterval ii = new InsertInterval();
        Interval one = new Interval(1, 3);
        Interval two = new Interval(15, 2147483647);
        List<Interval> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        System.out.println(ii.insert(list, new Interval(2, 5)));
    }
}