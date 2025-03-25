package Others.Practise.SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class CountAnagrams {

    public static void countAnagram(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Store frequency of str2 characters
        for (char c : str2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int count = map.size(); // Unique characters to match
        int i = 0, j = 0, k = str2.length(); // Window size = str2 length
        int anagramCount = 0;

        while (j < str1.length()) {
            // Reduce frequency for incoming character
            if (map.containsKey(str1.charAt(j))) {
                map.put(str1.charAt(j), map.get(str1.charAt(j)) - 1);
                if (map.get(str1.charAt(j)) == 0) count--;
            }

            // If window size is smaller than k, expand it
            if ((j - i + 1) < k) {
                j++;
            } 
            // When window size matches k, check for anagram
            else {
                if (count == 0) anagramCount++; // All characters matched

                // Restore frequency for outgoing character
                if (map.containsKey(str1.charAt(i))) {
                    if (map.get(str1.charAt(i)) == 0) count++;
                    map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
                }
                
                i++; // Move left pointer
                j++; // Move right pointer
            }
        }

        System.out.println("Total Anagram Count: " + anagramCount);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Main String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter The Anagram: ");
        String str2 = sc.nextLine();

        countAnagram(str1, str2);
        sc.close();
    }
}
