package com.company;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Date;

public class Main {


    public static void main(String[] args) {

        int  countMonths;
        int countDays;
        int countYears;
        int hunterMoon;
        String nextFullMoon;
        String stringToday;



        System.out.println("The Next Full Moon will be October 5, 2017");




        Scanner motivate = new Scanner(System.in);

        System.out.println("");
        System.out.println("The Exact Day, Month, Time, Year is");
        Date d = new Date();
        System.out.print(d);


        LocalDate today = LocalDate.now(); /*local*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        /*     datetime reference   */
        stringToday = today.format(formatter);

        System.out.println("Today is: " + stringToday);
        System.out.println("");
        System.out.println("Enter October as: 10");

        countMonths = motivate.nextInt();
        motivate.nextLine();

        System.out.println("Enter 5 for next full moon date: ");
        countDays = motivate.nextInt();

        System.out.println("What is the current Year");
        countYears = motivate.nextInt();
        LocalDate fullMoon = LocalDate.of(countYears, countMonths, countDays);
        if (fullMoon.isBefore(today)) {
            fullMoon = fullMoon.plusYears(1);
        }

        nextFullMoon = fullMoon.format(formatter);
        long daysToFullMoon = today.until(fullMoon, ChronoUnit.DAYS);

        /*   chronoUnit reference*/
        /*    date time reference  */

        System.out.println("");
        System.out.println("");
        /*https://days.to/until/full-moon?day=5*/
        System.out.println("");
        System.out.println("");
        hunterMoon = today.getMonthValue();

        /*....date time refernece.....*/
        if (countMonths == hunterMoon || countDays == today.getMonthValue()) {
            System.out.println("Don't Enter todays Date");
        } else {


            System.out.println("There are " + daysToFullMoon + " days till your next FullMoon");
        }

        /*line 20...https://docs.oracle.com/javase/tutorial/datetime/iso/nonIso.html*/
        /**/
        /*...line 42...https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html#DAYS*/
        /**/
        /*...line 43....https://docs.oracle.com/javase/tutorial/datetime/iso/period.html*/
        /**/
        /*https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html*/
        /**/
        /* long method */
        /**/
        /*  line 48 if the current Month is equal to hunterMoon which is set up in an if*/
        /**/
        /*   statement current month to equal today.getMonthValue from oracle docs*/
        /* then the user just entered todays date....and reply dont enter todays date...!*/
        /*if current month is equal to this month and current day is equal to this day*/
        /* the date of the future full moon or future date was not put in, but today was*/
        /* if todays month is not equal to this month || todays day is not todays date else*/
                /* else { Give the user a print line stating their are so many days left*/


    }
}