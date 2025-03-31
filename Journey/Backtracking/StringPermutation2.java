package Journey.Backtracking;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPermutation2 {
    
    public static void generatePermutation(String str) { // // generate all permutation when elements are repeated
        Set<String> set = new HashSet<>();
        permute(str.toCharArray(), 0, str.length() - 1, set);
        System.out.println(set);
        ;
    }

    public static void permute(char[] str, int start, int end, Set<String> set) {
        if (start > end) {
            String res = new String(str);
            set.add(res);
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(str, start, i);
            permute(str, start + 1, end, set);
            swap(str, start, i);
        }
    }

    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Generate Permutations: ");
        String str = sc.nextLine();
        System.out.println("==================");
        generatePermutation(str);
        sc.close();
    }
}
