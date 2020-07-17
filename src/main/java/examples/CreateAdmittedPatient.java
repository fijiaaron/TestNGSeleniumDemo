package examples;

import java.util.Arrays;

public class CreateAdmittedPatient
{
    public static void main(String[] args)
    {
        AdmittedPatient patient1 = new AdmittedPatient("George", 27, "yes");
        AdmittedPatient patient2 = new AdmittedPatient("Tina", 29);

        for (AdmittedPatient patient : Arrays.asList(patient1, patient2))
        {
            if (patient.hasInsurance())
            {
                System.out.println(patient.name + " has insurance");
            }
        }
    }
}
