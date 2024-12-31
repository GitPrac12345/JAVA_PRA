package enhancedForLoop;

public class ProductNames {

    String productName;
    int productID;
    int price;
    long customerPhNo;

    public ProductNames( String productName,int productID,int price,long customerPhNo){
        this.productName=productName;
        this.productID=productID;
        this.price=price;
        this.customerPhNo=customerPhNo;

    }



    public void getProductNameDetails(){
        System.out.println(productName);
    }

}
