public class FakePeopleApplication
{
    public static void main(String[] args)
    {
        FakePeople fake1 = new FakePeople();
        FakePeople fake2 = new FakePeople("Ravel", "Pheonix", 15);
        System.out.println(fake1);
        System.out.println(fake2);
    }
}
