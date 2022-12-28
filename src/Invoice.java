public class Invoice {
    public String ID, Desc;
    public Double UnitPrice, TotalPrice;
    int Quantity;

    public Invoice(String ID, String Desc, Double UnitPrice, int Quantity) {
        this.ID = ID;
        this.Desc = Desc;
        this.UnitPrice = UnitPrice;
        this.Quantity = Quantity;
    }

    public Double getTotalPrice() {
        return TotalPrice = UnitPrice * Quantity;


    }

    @Override
    public String toString() {
        return "Invoice{" +
                "ID='" + ID + '\'' +
                ", Desc='" + Desc + '\'' +
                ", UnitPrice=" + UnitPrice +
                ", Quantity=" + Quantity +
                '}';
    }
}

