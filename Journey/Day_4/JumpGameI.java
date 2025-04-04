package Journey.Day_4;

public class JumpGameI {

    public static boolean minJumps(int[] jumps) {
        int maxIndex = 0;
        for (int i = 0; i < jumps.length; i++) {
            if(i > maxIndex) {
                return false;
            }
            maxIndex = Math.max(maxIndex, i + jumps[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] jumps = {1, 2, 4, 1, 1, 0, 2, 5};
        boolean res = minJumps(jumps);
        System.out.println("Is Jump Possible? " +res);
    }
}