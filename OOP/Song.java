public class Song
{
    private double length;
    private String songName;
    private int release;
    public Song()
    {
        this.length = 0.0;
        this.songName = "";
        this.release = 0;
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
