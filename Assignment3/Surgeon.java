public class Surgeon extends Doctor{
	
    private boolean operating;
    public Surgeon(String empName, int empNumber, String special, boolean isOper) {
        super(empName, empNumber, special);
        this.operating = isOper;
    }
    public boolean isOperating() {
        return operating;
    }
    public void setOperating(boolean operating) {
        this.operating = operating;
    }
    public String toString() {
        String s = super.toString();
        s += " \tOPERATING: " +isOperating();
        return s;
    }
    public void operate() {
        setOperating(true);
        String s = "\n\n"+super.getName()+" is operating now.";
        System.out.println(s);
    }

}
