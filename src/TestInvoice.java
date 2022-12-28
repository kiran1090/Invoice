public class TestInvoice {
    public static void main(String [] args)
    {
        Invoice Iv1= new Invoice("a1","pen",20.00,2);
        Iv1.getTotalPrice();
        System.out.println(Iv1);
        System.out.println("id is "+Iv1.ID);
        System.out.println("Total Price" +Iv1.TotalPrice);
    }
}
