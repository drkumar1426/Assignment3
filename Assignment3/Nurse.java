public class Nurse extends HospitalEmployee{
	
    private int numOfPatients;
    public Nurse(String empName, int empNumber, int numPat) {
        super(empName, empNumber);
        this.numOfPatients = numPat;
    }
    public int getNumOfPatients() {
        return numOfPatients;
    }
    public void setNumPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }
    public String toString() {
        String s = super.toString();
        s += "\thas " +getNumOfPatients() +" patients";
        return s;
    }
    public void assist() {
        String s = "\n\n"+super.getName()+" is a nurse with "+getNumOfPatients()+" patients.";
        System.out.println(s);
    }
}