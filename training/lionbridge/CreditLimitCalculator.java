package Com.training.lionbridge;

public class CreditLimitCalculator {
    final int monthlyCreditLimit=1100;
    public void totalCreditLimit(int accountNumber,int beginningBalance,int totalCharges,int totalCredits){
        System.out.println("------Customer Details for the Month to Calculate Credit Limit-------");
        System.out.println("The customer account number : " +accountNumber);
        System.out.println("Balance at the beginning of the month : "+ beginningBalance);
        System.out.println("Total of all items charged by the customer this month : "+ totalCharges);
        System.out.println("Total of all credits applied to the customer’s account this month : "+ totalCredits);
        int newBalance=beginningBalance+totalCharges-totalCredits;
        System.out.println("The new balance is : " +newBalance);
        String creditLimitStatus =(monthlyCreditLimit > newBalance)?"Credit limit available":"Credit limit exceeded";
        System.out.println("The Customer Credit Limit Status is : " +creditLimitStatus);    
    }    
    public static void main(String[] args) {
        CreditLimitCalculator limitCheck = new CreditLimitCalculator();
        limitCheck.totalCreditLimit(10001021,1100,45,200);
        limitCheck.totalCreditLimit(10001022,5000,500,1000);
    }
}