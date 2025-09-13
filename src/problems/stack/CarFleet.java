package problems.stack;

import java.util.*;

/*
    There are n cars at given miles away from the starting mile 0, traveling to reach the mile target.
    You are given two integer arrays position and speed, both of length n, where position[i] is the starting mile of the ith car and speed[i] is the speed of the ith car in miles per hour.
    A car cannot pass another car, but it can catch up and then travel next to it at the speed of the slower car.
    A car fleet is a single car or a group of cars driving next to each other. The speed of the car fleet is the minimum speed of any car in the fleet.
    If a car catches up to a car fleet at the mile target, it will still be considered as part of the car fleet.
    Return the number of car fleets that will arrive at the destination.
 */
public class CarFleet {

    public static void main(String[] args) {
        //int[] position = { 10,8,0,5,3 };
        int[] position = { 6, 8 };
        // int[] speed = { 2,4,1,1,3 };
        int[] speed = { 3, 2 };
        carFleetSolution(10, position, speed);
    }

    public static int carFleetSolution(int target, int position[], int[] speed) {
        List<int[]> positionSpeed = new ArrayList<>();

        for(int i = 0; i < position.length; i++) {
            positionSpeed.add(new int[]{position[i], speed[i]});
        }

        positionSpeed.sort((t1, t2) -> Integer.compare(t2[0], t1[0]));

        Stack<Double> timeStackMonotonic = new Stack<>();

        for(int[] psped: positionSpeed) {
            double time = (double) (target - psped[0]) / psped[1];
            if(timeStackMonotonic.isEmpty() || timeStackMonotonic.peek() < time) {
                timeStackMonotonic.add(time);
            }
        }

        return timeStackMonotonic.size();
    }

}
