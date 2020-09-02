package Com.training.lionbridge;

import java.util.Scanner;


public class SalaryCalculator {
    double baseHours=40.00;
    double extraHours=1.5;
    double workedHours,hourlyPay;
       public void setHours(double workedHours){
            this.workedHours = workedHours;
        }
        public void setHourlyPay(double hourlyPay){
            this.hourlyPay= hourlyPay;
        }
        public double calculateGrossPay(){
            return workedHours > 40 ?
                   (hourlyPay * baseHours) + ((hourlyPay * extraHours) * (workedHours - baseHours)) :
                   workedHours * hourlyPay;
        }
    public static void main(String[] args) {    
        SalaryCalculator salaryCalc = new SalaryCalculator();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the total number of Employee GrossPay Salary to be calculated");
        int noOfEmployee=input.nextInt();
        for(int i=1; i<=noOfEmployee; i++){
             System.out.printf("Employee %d Gross Pay Details \n",i);
             System.out.println("--*---*---*---*--*--*--*---*--*--");
             System.out.printf("Employee %d weekly hours:\n ", i);
             salaryCalc.setHours(input.nextDouble());
             System.out.printf("Employee %d hourly pay:\n ", i);
             salaryCalc.setHourlyPay(input.nextDouble());
             System.out.printf("Employee %d gross pay: %.3f\n", i, salaryCalc.calculateGrossPay());
             System.out.println("*********************************");
            }
            }
 
}
 




