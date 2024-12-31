package enhancedForLoop;

public class CustomArray_MainClass  {

    public static void main(String[] args) {
        ProductNames lap=new ProductNames("Laptop",0,0,0);
        ProductNames mob=new ProductNames("Mobile",0,0,0);
        ProductNames tele=new ProductNames("telephone",0,0,0);

        //System.out.println(lap.productName);

        ProductNames []pr=new ProductNames[]{lap,mob,tele};
        for(ProductNames n:pr){
            System.out.println(n.productName);
        }
    }
}
