package examples;

public class Patient
{
    public String name;
    public int age;

    public Patient() {}

    public Patient(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "examples.Patient " + name + " is " + age + " years old.";
    }
}
