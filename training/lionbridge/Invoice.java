package Com.training.lionbridge;

public class Invoice {
    String partNumber,partDescription;
    int quantity;
    double pricePerItem;
    Invoice(String partNumber,String partDescription,int quantity,double pricePerItem){
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantity=quantity;
        this.pricePerItem=pricePerItem;
    }
    
    public String getPartNumber() {
        System.out.println("The PartNumber is:"+this.partNumber);
        return this.partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        System.out.println("The PartDescription is:"+this.partDescription);
        return this.partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        if(this.quantity>=0) {
            System.out.println("The Quantity is postive and its value is :" +this.quantity);
            return this.quantity;
        }
        else {
            this.quantity=0;
            System.out.println("The quantity value is not positive it is set to be zero:"+this.quantity);
            return this.quantity;
        }
        
        
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        if(this.pricePerItem>=0) {
            System.out.println("The Price Amount is Postive and it valued as:"+this.pricePerItem);
            return this.pricePerItem;
        }
        else {
            this.pricePerItem=0.0;
            System.out.println("The price amount is not positive it is set to be zero:"+this.pricePerItem);
            return this.pricePerItem;
        }    
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        System.out.println("****Product Details******");
        System.out.println("-------------------------");
        getPartNumber();
        getPartDescription();
        double amount=getQuantity()*getPricePerItem();
        System.out.println("The total Invoice Amount is:"+amount);
        return amount;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Invoice bill=new Invoice("M001","CPU",2,25000.4765);
        bill.getInvoiceAmount();
    }

}