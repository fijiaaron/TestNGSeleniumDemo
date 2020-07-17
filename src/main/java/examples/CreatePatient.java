package examples;

public class CreatePatient
{
    public static void main(String[] args)
    {
        Patient p = new Patient();
        p.name = "Aaron";
        p.age = 42;

        System.out.println(p);

        Patient q = new Patient("Kelsey", 37);
        System.out.println(q);
    }
}
