import java.text.DecimalFormat;
import java.util.Scanner;

public class RunEmployee{

    private static DecimalFormat df2 = new DecimalFormat("#.##");


    public static void main(String []args){

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("");
	        System.out.print("Employee name: ");
	        String emp_name =input.nextLine();

			int number = 0;
			boolean isNumber;
			
	        
			do{
				System.out.print("Press F for Full Time or P for Part Time: ");
				if(!input.hasNextInt()){ //not a number
					// number = input.nextLine();
					isNumber= false;
				}else{
					System.out.println("ERROR! please try again");
					isNumber = true;
					input.next();
				}
			} while((isNumber));
			// System.out.println(number);
	        char job_criteria =input.next().charAt(0);
	        
	        char select = Character.toUpperCase(job_criteria);
	        
	        
	        Employee emp;
	        
	        if (select == 'F') {
	        	System.out.println("--- Full Time Employee ---");
	        	System.out.print("Enter Basic Pay:  ");
	            double basic_pay = input.nextDouble();

				

                emp = new FullTimeEmployee(emp_name,basic_pay);
	            // System.out.println("Basic Pay " + basic_pay);

	            System.out.println("____________________________________");
	            System.out.println("Employee Name:   " + emp_name );
	            System.out.println("Basic Pay:       " + df2.format(basic_pay));
                
	            System.out.println("____________________________________");
	            System.out.println("Monthly Salary:       " + df2.format(emp.monthSal()));
	            System.out.println("");
	        } else if (select == 'P') {
	        	
	        	System.out.println("--- Part Time Employee ---");
	        	System.out.print("Enter rate per hour:  ");
	            double rate_per_hour = input.nextDouble();
	            
	            System.out.print("Enter no. of hours worked:  ");
	            int no_hours_work2 = input.nextInt();
	            
	            System.out.print("Enter no. of overtime:  ");
	            double no_overtime = input.nextDouble();

               
	            double basic_pay2 =  (rate_per_hour * no_hours_work2); 
	            double overtime_pay = (no_overtime * rate_per_hour * .5);
	            // double gross_pay = (basic_pay2 + overtime_pay);

                emp = new PartTimeEmployee(emp_name,no_hours_work2,rate_per_hour,overtime_pay);

	            System.out.println("___________________________________");
	            System.out.println("Employee Name:   " + emp.getEmp_name() );
	            System.out.println("Basic Pay:       " + df2.format(basic_pay2));
	            System.out.println("Overtime Pay:    " + df2.format(overtime_pay));
	            System.out.println("___________________________________");
	            System.out.println("Wage:       " + df2.format(emp.wage()));
				System.out.println("");
	        } 
        }	        


    }

} 
