public class GroceryItemOrder
{
    //Fields
    private String name;
    private int quantity = 1;
    private double unitPrice;

    //Args constructor
    public GroceryItemOrder(String name, int quantity, double unitPrice)
    {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    //Getters
    public double getCost()
    {
        return getUnitPrice()*getQuantity();
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    public double getUnitPrice()
    {
        return this.unitPrice;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    //ToString
    public String toString()
    {
        if (this.quantity > 1)
        {
            return this.quantity + " " + this.name + "'s = " + getCost() + "DKK";
        }
        return this.quantity + " " + this.name + " = " + getCost() + "DKK";
    }
}
