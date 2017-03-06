package com.array.easy;

import com.Interval;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by krutarthjoshi on 11/7/16.
 */
public class MeetingRooms {

    public static void main(String[] args) {
        Interval[] intervals = new Interval[100];
        for (int i = 0; i < 100; i++) {
            Interval interval = new Interval();
            interval.start = random.nextInt(50);
            interval.end = random.nextInt();
            intervals[i] = interval;
        }
        MeetingRooms meetingRooms = new MeetingRooms();
        System.out.println(meetingRooms.canAttendMeetings(intervals));
    }

    public boolean canAttendMeetings(Interval[] intervals) {
        if (intervals == null)
            return false;

        int l = intervals.length;

        Arrays.sort(intervals, (i, j) -> i.start - j.start);

        for (int i = 1; i < l; i++)
            if (intervals[i].start < intervals[i - 1].end)
                return false;

        return true;
    }

    static Random random = new Random();
}
