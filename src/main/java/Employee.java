
public class Employee {
    private String Name;
    private int iDNumber;
    private String department;
    private String position;
    
    public void Employee() {
        this.Name = "";
        this.iDNumber = 0;
        this.department = "";
        this. position = ""; 
    }

    public Employee(String Name, int iDNumber) {
        this.Name = Name;
        this.iDNumber = iDNumber;
        this.department = "";
        this.position = "";
    }
    

    public Employee(String Name, int iDNumber, String department, String position) {
        this.Name = Name;
        this.iDNumber = iDNumber;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
    
}
