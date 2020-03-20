package week01.day04.src;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int codingHoursDaily,codingHoursSemester,semesterWeeks,semesterDays,workHoursSemester;
        codingHoursDaily = 6;
        semesterWeeks = 17;
        semesterDays = semesterWeeks*5;
        workHoursSemester = semesterWeeks*52;
        codingHoursSemester = codingHoursDaily * semesterDays;
        System.out.println("You will spend " + codingHoursSemester + " hours with coding, in this semester");

        System.out.println("You will spend " + (((double) codingHoursSemester/workHoursSemester))*100 + " percentage of work hours with coding in this semester.");
    }
}
