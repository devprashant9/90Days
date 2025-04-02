import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GenerateCombination2 {

    public static void generateCombination(String str) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        char[] chars = str.toCharArray();
        
        Arrays.sort(chars); // Sort to handle duplicates
        combine(chars, list, current, 0);
        System.out.println(list);
    }

    public static void combine(char[] str, ArrayList<String> list, StringBuilder current, int i) {
        if (i == str.length) {
            if (current.length() > 0) {
                list.add(current.toString()); // Add only non-empty combinations
            } else if(current.length() == 0) {
                list.add(null);
            }
            return;
        }

        // Include current character
        current.append(str[i]);
        combine(str, list, current, i + 1);

        // Backtrack: Remove last character
        current.deleteCharAt(current.length() - 1);

        // Skip duplicate elements
        while (i + 1 < str.length && str[i] == str[i + 1]) {
            i++;
        }

        // Exclude current character and move forward
        combine(str, list, current, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        generateCombination(str);
        sc.close();
    }
}
