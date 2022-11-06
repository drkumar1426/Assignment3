public class Doctor extends HospitalEmployee{
	
    private String speciality;
    public Doctor(String empName, int empNumber, String special) {
        super(empName, empNumber);
        this.speciality = special;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String toString() {
        String s = super.toString();
        s += "\t" +getSpeciality();
        return s;
    }
    public void diagnose() {
        String s = "\n\n"+super.getName()+" is a heart doctor.";
        System.out.println(s);
    }

}