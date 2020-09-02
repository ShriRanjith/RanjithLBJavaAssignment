package Com.training.lionbridge;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

 

    public static void main(String[] args) {
            Scanner inputNumber=new Scanner(System.in);
            System.out.println("Enter the total number to calculate factorial");
            long number=inputNumber.nextLong();
            long factorial = 1;   
            //to calculate the factorial of 100 we have to use BigInteger
            if(number>20) {
                BigInteger bigfactorialNumber = BigInteger.ONE;
                for(int i = 1; i <=number; ++i)
                { 
                    bigfactorialNumber = bigfactorialNumber.multiply(BigInteger.valueOf(i));
                }
                System.out.printf("Factorial of %d = %d", number, bigfactorialNumber);
            }
            else {
                System.out.println("Number"+"\t"+"FactorialValue");
                System.out.println("-------"+"\t"+"---------------");
            for(int i = 1; i <= number;++i)
            
            {
                factorial *= i;
                System.out.println(i+"\t"+factorial);
                
            }
        }
    }

 

    }