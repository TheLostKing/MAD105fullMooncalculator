package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime firstfullmoon = LocalDateTime.of(2017, 1, 12, 4, 35, 12); //holds time of the first full moon of 2017
        LocalDateTime nextFullMoon = firstfullmoon; //starts at first full moon of 2017

        while (nextFullMoon.isBefore(current)){ //loops until the full moon is after the current date and time
            long secondsBetweenFullMoons = 42524*60; //the amount of minutes between full moons
            nextFullMoon = nextFullMoon.plusSeconds(secondsBetweenFullMoons);
            //System.out.println(nextFullMoon); //test code to check how value changes during loop
        }

        System.out.println("The current date is " + current.getMonth() + " " + current.getDayOfMonth() + " " + current.getYear());
        System.out.println("The next full moon is " + nextFullMoon.getMonth() + " " + nextFullMoon.getDayOfMonth() + " " + nextFullMoon.getYear());
    }
}
