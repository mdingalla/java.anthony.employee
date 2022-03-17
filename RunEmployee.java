import java.text.DecimalFormat;
import java.util.Scanner;

public class RunEmployee{

    private static DecimalFormat df2 = new DecimalFormat("#.##");

     
    public static void main(String []args){

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("");
	        System.out.print("Enter Employee Name: ");
	        String emp_name =input.nextLine();

			boolean isNumber = false;
			
	        
			do{
				System.out.print("Press P for Part-Time or F for Full-Time: ");
				if(!input.hasNextInt()){ 
					
					isNumber= false;
					char job_criteria =input.next().charAt(0);
	        
					char select = Character.toUpperCase(job_criteria);
					
					
					Employee emp;
					
					if (select == 'F') {
						System.out.println();
						System.out.println("--- Full Time Employee ---");
						System.out.print("Enter Monthly Salary:  ");
						double basic_pay = input.nextDouble();
		
						emp = new FullTimeEmployee(emp_name,basic_pay);
								
						System.out.println("____________________________________");
						System.out.println("Employee Name:    " + emp_name );

						System.out.println("Monthly Salary:   " + df2.format(emp.monthSal()));
						System.out.println("");
					} else if (select == 'P') {
						
						System.out.println();
						System.out.println("--- Part Time Employee ---");
						System.out.print("Enter rate per hour:  ");
						double rate_per_hour = input.nextDouble();
						
						System.out.print("Enter no. of hours worked:  ");
						int no_hours_work2 = input.nextInt();
		
					   
						double basic_pay2 =  (rate_per_hour * no_hours_work2);
						 
					   
						PartTimeEmployee pte = new PartTimeEmployee(emp_name,no_hours_work2,rate_per_hour,0);
		
						System.out.println("___________________________________");
						System.out.println("Employee Name:   " + pte.getEmp_name() );
						System.out.println("Monthly Wage:    " + df2.format(basic_pay2));
						System.out.println("Deductions:      " + df2.format(pte.getdeduction()));
						System.out.println("Final Pay:       " + df2.format(pte.wage()));
						System.out.println("");
					}
					else{
						System.out.println("ERROR! please try again.");
					    isNumber = true;
					    
					}
				}	 
				
			} while((isNumber));
			
        }
	}	        

}
 
