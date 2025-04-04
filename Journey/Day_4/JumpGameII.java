package Journey.Day_4;

public class JumpGameII {

    public static int minJumps(int[] jumps, int index, int count) {
        if (index >= jumps.length - 1) {
            return count;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= jumps[index]; i++) {
            int result = minJumps(jumps, index + i, count + 1);
            min = Math.min(min, result);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] jumps = { 2, 3, 1, 4, 1, 1, 1, 2 };
        int res = minJumps(jumps, 0, 0);
        System.out.println("Minimum Jumps Are:  " + res);
    }
}
