package Others.Practise.SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class LongestCharArray {

    public static void maxCharArray(char[] array, int n) {
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0, j = 0;

        int mx = Integer.MIN_VALUE;

        while (j < array.length) {
            map.put(array[j], map.getOrDefault(array[j], 0) + 1);

            if(map.size() < n) {
                j++;
            } else if (map.size() == n) {
                mx = Math.max(j - i + 1, mx);
                j++;
            } else if(map.size() > n) {
                while (map.size() > n) {
                    map.put(array[i], map.getOrDefault(array[i], 0) - 1);
                    if (map.get(array[i]) == 0) {
                        map.remove(array[i]);
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(mx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String s = sc.nextLine();

        System.out.println("Enter Number of Distinct Characters: ");
        int n = sc.nextInt();

        char[] charArray = s.toCharArray();

        maxCharArray(charArray, n);
        sc.close();
    }
}
