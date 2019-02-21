public class Clock
{
    private int hours;
    private int minutes;
    private int seconds;

    public Clock()
    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int value1, int value2, int value3)
    {
        this();
        this. hours = value1;
        this. minutes = value2;
        this. seconds = value3;
    }

    public String toString()
    {
        return String.format("The time is %d: %d: %d", hours, minutes, seconds); 
    }
}