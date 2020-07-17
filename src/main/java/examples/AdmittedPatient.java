package examples;

public class AdmittedPatient extends Patient
{
    public String insurance;

    public AdmittedPatient(String name, int age)
    {
        super(name, age);
    }

    public AdmittedPatient(String name, int age, String insurance)
    {
        super(name, age);
        this.insurance = insurance;
    }

    public boolean hasInsurance()
    {
        if (insurance != null) return true;
        else return false;
    }
}
