package Com.training.lionbridge;

import java.util.Scanner;

public class CalculatingSales {

    public static void main(String[] args) {
        int productNumber=0;
        int quantity=0;
        double totalPrice=0.0;
        while(productNumber!=-1) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Product Number :");
        productNumber=input.nextInt();        
        if(productNumber==0) {
            System.out.println("Thanks for the Shopping :-)");
            break;
        }
        System.out.println("Enter the Quantity:");
        quantity=input.nextInt();
        switch(productNumber) {
        case 1:
            System.out.println("Product 1 cost per item is $2.98");
            totalPrice+=2.98*quantity;
            break;
        case 2:
            System.out.println("Product 2 cost per item is $4.50");
            totalPrice+=4.50*quantity;            
            break;
        case 3:
            System.out.println("Product 3 cost per item is $9.98");
            totalPrice+=9.98*quantity;            
            break;
        case 4:
            System.out.println("Product 4 cost per item is $4.49");
            totalPrice+=4.49*quantity;            
            break;
        case 5:
            System.out.println("Product 5 cost per item is $6.87");
            totalPrice+=6.87*quantity;            
            break;        
        }
        System.out.printf("The TotalPrice for ProductNumber %d as per requested %d quantity :" +"$"+totalPrice+"\n",productNumber,quantity);
    }
    }

 

}