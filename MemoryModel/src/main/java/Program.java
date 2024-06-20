import java.util.Arrays;

public class Program
{
    public static void main(String[] args)
    {
        int ben = 4;
        String chris = "Chris";
        int[] devin = { 6, 7, 2 };
        for (var eliza = 0; eliza < devin.length; eliza++)
        {
            System.out.println(devin[eliza]);
        }

        double gilbert = 3.14159;
        var jack = ben;
        ben++;
        String[] jayden = { "cat", "dog" };
        {
            var kat = devin;
            kat[2] = 42;
            String[] kian = { "perch", "cod", "cat" };
            jayden = kian;
            jayden[1] = "bass";
            var lewis = jack;
            chris = kian[0];
            kian[0] = "salmon";
        }
        gilbert = devin[2];
    }
}

