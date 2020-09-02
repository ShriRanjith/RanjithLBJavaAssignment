package Com.training.lionbridge;

public class Employee {
    //Declared the instance variables
     String firstname,lastname;
     double monthlySalary;
     //created parameterized constructor for Employee class
     Employee(String firstname,String lastname,double monthlySalary){
         this.firstname=firstname;
         this.lastname=lastname;
         this.monthlySalary=monthlySalary;
     }
    public String getFirstname() {
        System.out.println("Employee First Name is :"+""+this.firstname);
        return this.firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        System.out.println("Employee Last Name :"+""+this.lastname);
        return this.lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public double getMonthlySalary() {
        if(this.monthlySalary>=0.00) {
            System.out.println("Monthly Salary is :"+" "+this.monthlySalary);
            double yearlySalary=this.monthlySalary*12;
            System.out.println("Yearly Salary is"+""+yearlySalary);
            double newYearlySalary=yearlySalary+((yearlySalary*10)/100);
            System.out.println("After 10% raise in Yearly Salary"+""+newYearlySalary);
            return this.monthlySalary;
        }
               else 
            {
            System.out.println("Please enter the postive monthly salary value");
            return 0.0;
        }
    }


    public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary=monthlySalary;
}
    


    public static void main(String[] args) {
        Employee firstObject =new Employee("Priyanka","Ramasamy",25000.00);
        Employee secondObject = new Employee("Shri","Ranjith",30000.45);
        firstObject.getFirstname();
        firstObject.getLastname();
        firstObject.getMonthlySalary();
        secondObject.getFirstname();
        secondObject.getLastname();
        secondObject.getMonthlySalary();
    }


}

