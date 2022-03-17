public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double ratePerHour;
    private double wage;

    public PartTimeEmployee(){
        super();
    }
     
    //Constructor
    public PartTimeEmployee(String Emp_name, int hoursWorked, double ratePerHour, double wage){
        super(Emp_name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
        this.wage = wage;
    }

    //getter
    public int gethoursWorked(){return hoursWorked;}
    public double getratePerHour(){return ratePerHour;}
    public double getwage(){return wage;}

    //setter
    public void sethoursWorked(int hours){this.hoursWorked = hours;} 
    public void setratPerHour(double rate){this.ratePerHour = rate;}
    public void setwage(double wage){this.wage = wage;} 
    

    //returnSalary
    
    public double wage()
    {
        double wage = 0;
        double overtime = 0;

        if(hoursWorked > 40){
            int hours = hoursWorked - 40;
            hoursWorked = 40;
            overtime = hours * (ratePerHour * .5);
        }

        wage = hoursWorked * ratePerHour;
        wage += overtime;

        return wage;


    }


    //override
    public String toString() {
        return super.toString() +  String.format("%-20s %.2f%n", "Salary", wage());
    }

    @Override
    public double monthSal() {
        
        return 0;
    }
    
}

