public class FullTimeEmployee extends Employee{

    private double monthSal;


    public FullTimeEmployee(){
        super();
    }
    
    //constructor 
    public FullTimeEmployee(String Emp_name,double monthSal){
        super(Emp_name);
        this.monthSal = monthSal;
    }

    //getter
    public double getmonthSal(){return monthSal;}

    //setter
    public void getmonthSal(double monthlySalary){this.monthSal = monthlySalary;}


    //returnSalary
    public double monthSal()
    {
        return this.monthSal;
    }


    //override
    public String toString() {
        return super.toString() + String.format("%-20s %.2f%n", "Salary", monthSal());
    }


    @Override
    public double wage() {
        
        return 0;
    }
    
}
