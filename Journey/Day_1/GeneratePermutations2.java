import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GeneratePermutations2 {

    public static void generatePermutations(String str) {

        ArrayList<String> list = new ArrayList<>();
        boolean[] used = new boolean[str.length()];

        char[] arr = str.toCharArray();

        Arrays.sort(arr); // Sorting to handle duplicates

        permute(new String(arr), list, new StringBuilder(), used);
        System.out.println(list);
    }

    public static void permute(String str, ArrayList<String> list, StringBuilder current, boolean[] used) {
        if (current.length() == str.length()) {
            list.add(current.toString());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Skip already used characters
            if (used[i])
                continue;

            // Skip duplicate characters (only use the first unprocessed occurrence)
            if (i > 0 && str.charAt(i) == str.charAt(i - 1) && !used[i - 1])
                continue;

            used[i] = true;
            current.append(str.charAt(i));

            permute(str, list, current, used);

            // Backtrack
            used[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        generatePermutations(str);
        sc.close();
    }
}
