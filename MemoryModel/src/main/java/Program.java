public class Program
{
    public static void main(String[] args)
    {
        int aston = 4;
        String dj = "Diarmuid";
        int[] jack = { 6, 7, 2 };
        for (var adam = 0; adam < jack.length; adam++)
        {
            System.out.println(jack[adam]);
        }

        double siyu = 3.14159;
        var will = aston;
        aston++;
        String[] mohammed = { "cat", "dog" };
        {
            var john = jack;
            john[2] = 42;
            String[] eve = { "perch", "cod", "eel" };
            mohammed = eve;
            mohammed[1] = "bass";
            var tom = will;
            dj = eve[0];
        }
        siyu = jack[2];
    }
}

