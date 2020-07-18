public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 23;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int r = 24*3600-(currentHours*3600+currentMinutes*60+currentSeconds);
        System.out.println("Remaining s:" + r);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}