package Journey.Day_3;

import java.util.Arrays;

public class ShortestJobFirst {

    public static void shortestJob(int[] processes) {
        Arrays.sort(processes);

        int totalWaitingTime = 0;
        int waitingTime = 0; // Waiting time for current process

        // Calculate total waiting time
        for (int i = 1; i < processes.length; i++) {
            waitingTime += processes[i - 1]; // Add previous process burst time
            totalWaitingTime += waitingTime; // Accumulate waiting time
        }

        System.out.println("The Average Waiting Time is: " +(totalWaitingTime / processes.length));
    }

    public static void main(String[] args) {
        int[] bt = { 4, 3, 7, 1, 2 };
        shortestJob(bt);
    }
}
