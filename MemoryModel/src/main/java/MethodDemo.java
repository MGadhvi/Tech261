class Person
{
    public String firstName;
    public String lastName;
    public int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

public class MethodDemo
{
    public static void main(String[] args)
    {
        Person aston = new Person("Aston", "Padley", 18 );
        System.out.println(aston.getFullName());
        Person dj = new Person("Diarmuid", "Healy", 21);
        double jack = 4.2;
        String adam = aMethod(aston, jack);
    }
    public static String aMethod(Person person, double number)
    {
        person.setLastName("Adam");
        person.setAge(26);
        number *= 2;
        return person.getFullName();
    }
}

