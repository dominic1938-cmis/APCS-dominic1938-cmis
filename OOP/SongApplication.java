public class SongApplication
{
    public static void main(String[] args)
    {
        Song song1 = new Song();
        Song song2 = new Song(3.35, "Never Gonna Give you Up", 1987);
        System.out.println(song1);
        System.out.println(song2);
    }
}