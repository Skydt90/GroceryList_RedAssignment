import java.util.ArrayList;

public class GroceryList2
{
    //Fields.
    private ArrayList<GroceryItemOrder> shopping;
    private double totalCost;

    //Default constructor.
    public GroceryList2()
    {
        shopping = new ArrayList<>();
    }

    //Adds items to list.
    public void add(GroceryItemOrder item)
    {
        shopping.add(item);
    }

    //Returns total cost of items in list.
    public double getTotalCost()
    {
        for (int i = 0; i < shopping.size(); i++)
        {
            totalCost = totalCost + shopping.get(i).getCost();
        }
        return totalCost;
    }

    //Returns item on arg index.
    public GroceryItemOrder get(int index)
    {
        return shopping.get(index);
    }

    //Returns size of list.
    public int size()
    {
        return shopping.size();
    }

    //Returns index of an item
    public int indexOf(GroceryItemOrder item)
    {
        for (int j = 0; j < shopping.size(); j++)
        {
            if (shopping.get(j).equals(item))
            {
                return j;
            }
        }
        return -1;
    }

    //Customized toString
    public String toString()
    {
        if (shopping.size() == 0)
        {
            return "[]";
        }
        else
        {
            String result = "Shopping Cart 2: \n" + shopping.get(0);
            for (int j = 1; j < shopping.size(); j++)
            {
                result += ", \n" + shopping.get(j);
            }
            return result;
        }
    }
}

