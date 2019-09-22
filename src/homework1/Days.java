package homework1;

public class Days {
    public static int days;
    public static int hours;
    public static int minutes;
    public static int seconds;

    public Days(int daysN) {
        days = daysN;
        hours = days * 24;
        minutes = hours * 60;
        seconds = minutes * 60;
    }
}
