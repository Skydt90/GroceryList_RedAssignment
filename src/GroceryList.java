public class GroceryList
{
    //Fields
    private final int MAX_CAPACITY = 10;
    private int size;
    private double totalCost;
    private GroceryItemOrder[] groceryList;

    //Default constructor.
    public GroceryList()
    {
        this.groceryList = new GroceryItemOrder[MAX_CAPACITY];
        this.size = 0;
    }

    //Add an item to the end of the list and increments size.
    public void add(GroceryItemOrder item)
    {
        if (this.size == MAX_CAPACITY)
        {
            System.out.println("Cart is full!");
        }
        else if (this.size < MAX_CAPACITY)
        {
            groceryList[size] = item;
            size++;
        }
    }

    //Returns the total cost of the items in the list
    public double getTotalCost()
    {
        for (int i = 0; i < size; i++)
        {
            totalCost = totalCost + groceryList[i].getCost();
        }
        return totalCost;
    }

    //Returns size of the array, not capacity.
    public int size()
    {
        return this.size;
    }

    //Returns the index of an item.
    public int indexOf(GroceryItemOrder item)
    {
        for (int j = 0; j < size; j++)
        {
            if (groceryList[j].equals(item))
            {
                return j;
            }
        }
        return -1;
    }

    //Customized toString
    public String toString()
    {
        if (size == 0)
        {
            return "[]";
        }
        else
        {
            String result = "Shopping Cart 1: \n" + groceryList[0];
            for (int j = 1; j < size; j++)
            {
                result += ", \n" + groceryList[j];
            }
            return result;
        }
    }
}
