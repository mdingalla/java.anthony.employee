public abstract class Employee {

    private String Emp_name;


    public Employee(){

    }
    public Employee(String Emp_name){
        this.Emp_name = Emp_name;
    }   
    
    public String getEmp_name(){

        return Emp_name;
    }

    public void setEmp_name(String name){
        this.Emp_name = name;
    }

    public abstract double wage();

    public abstract double monthSal();


    //override
    public String toString() {

        return String.format("%-20 %s&n, Employee name:", Emp_name) + String.format("%-20s %s%n", "Employee Name:", Emp_name);
    }
}