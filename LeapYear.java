public class LeapYear
{
    public static void leapyear(int year)
    {
        if((year%400==0))
        {
            System.out.println("Leap year");
        }
        else if((year%4==0) && (year%100!=0))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Non Leap year");
        }
    }
    public static void main(String args[])
    {
          int year=2024;
          leapyear(year);
    }
}