package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime firstfullmoon = LocalDateTime.of(2017, 1, 12, 4, 35, 12);
        LocalDateTime nextFullMoon = firstfullmoon;

        while (nextFullMoon.isBefore(current)){
            long minutesBetweenFullMoons = 42524;
            nextFullMoon = nextFullMoon.plusMinutes(minutesBetweenFullMoons);
            System.out.println(nextFullMoon);
        }

        System.out.print("The current date is " + current + "\nThe next full moon is " + nextFullMoon);
    }
}
