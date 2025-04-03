package Journey.Day_3;

import java.util.Arrays;

public class AssignCookies {

    public static void assignCookie(int[] greed, int[] size) {
        Arrays.sort(greed);
        Arrays.sort(size);

        int i = 0, j = 0;

        int count = 0;

        while (i < greed.length && j < size.length) {
            if (greed[i] <= size[j]) {
                count++;
                i++;
                j++;
            } else if (greed[i] > size[j]) {
                j++;
            }
        }

        System.out.println("No of Childrens Fed: " + count);
    }

    public static void main(String[] args) {
        int[] greed = { 1, 2, 3 };
        int[] size = { 1, 1 };
        assignCookie(greed, size);
    }
}