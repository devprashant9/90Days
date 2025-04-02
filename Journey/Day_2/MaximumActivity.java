package Journey.Day_2;

import java.util.ArrayList;

public class MaximumActivity {
    
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9}; // sort using end time

        int maxActivity = 0;
        ArrayList<Integer> list = new ArrayList<>();

        maxActivity = 1;
        list.add(0);

        int lastEnd = end[0];

        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                maxActivity++;
                list.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(maxActivity);
        System.out.println(list);
    }
}
