package Journey.Day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaximumActivity2 {
    
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9}; // sort using end time

        // sorting
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingInt(a -> a[2]));

        int maxActivity = 0;
        ArrayList<Integer> list = new ArrayList<>();

        maxActivity = 1;
        list.add(activities[0][0]);

        int lastEnd = activities[0][2];

        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxActivity++;
                list.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println(maxActivity);
        System.out.println(list);
    }
}
