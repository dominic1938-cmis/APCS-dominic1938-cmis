public class Song
{
    private double length = 3.35;
    private String songName = "Never Gonna Give you Up";
    private int release = 1987;
    public Song()
    {
        this.length = 3.30;
        this.songName = "Neva Gona Giv Ya Up";
        this.release = 2008;
    }

    public Song(double value1, String value2, int value3)
    {
        this();
        this. length = value1;
        this. songName = value2;
        this. release = value3;
    }

    public String toString()
    {
        return String.format("Song Name: %s\nSong Length %f\nRelease Date: %d\n", songName, length, release); 
    }
}
