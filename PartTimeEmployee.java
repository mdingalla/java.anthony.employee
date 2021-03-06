public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double ratePerHour;
    private double wage;
    private double deduction;

    public PartTimeEmployee(){
        super();
    }
     
    //Constructor
    public PartTimeEmployee(String Emp_name, int hoursWorked, double ratePerHour, double wage){
        super(Emp_name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
        this.wage = hoursWorked * ratePerHour;
        this.deduction = this.wage * .05;
    }

    //getter
    public int gethoursWorked(){return hoursWorked;}
    public double getratePerHour(){return ratePerHour;}
    public double getwage(){return wage;}
    public double getdeduction(){return this.deduction;};

    //setter
    public void sethoursWorked(int hours){this.hoursWorked = hours;} 
    public void setratPerHour(double rate){this.ratePerHour = rate;}
    public void setwage(double wage){this.wage = wage;} 

    

    //return Final Pay
    
    public double wage()
    { 
        double total = this.wage - this.deduction;
        return total;
    }


    
    public String toString() {
        return super.toString() +  String.format("%-20s %.2f%n", "Salary", wage());
    }

    @Override
    public double monthSal() {
        
        return 0;
    }
    
}

