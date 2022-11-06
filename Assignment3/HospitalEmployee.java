 public class HospitalEmployee {
        private String name;
        private String number;

        public HospitalEmployee(String empName, int empNumber){
            this.name = empName;
            this.number = Integer.toString(empNumber);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getNumber() {
            return number;
        }
        public void setNumber(String number) {
            this.number = number;
        }
        public String toString() {
            String s = "\n" +getName()+ "\t" +getNumber();
            return s;
        }
        public void work() {
            String s = "\n\n"+getName()+" works for the hospital.";
            System.out.println(s);
        }
    }
