public class Store
{
    public static void main(String[] args)
    {
        // Test for GroceryList
        GroceryList cart = new GroceryList();
        createGroceryList(cart);
        System.out.println(cart + "\nTotal amount due: " + cart.getTotalCost() + "DKK");

        // Test for GroceryList2
        GroceryList2 cart1 = new GroceryList2();
        createGroceryList2(cart1);
        System.out.println("\n" + cart1 + "\nTotal amount due: " + cart1.getTotalCost() + "DKK");
    }
    public static void createGroceryList(GroceryList cart)
    {
        GroceryItemOrder apple = new GroceryItemOrder(Filehandler.getGroceryName(1), 1, 1.50);
        GroceryItemOrder pear = new GroceryItemOrder(Filehandler.getGroceryName(3), 5, 20.00);
        GroceryItemOrder banana = new GroceryItemOrder(Filehandler.getGroceryName(7), 3, 13.50);
        GroceryItemOrder pineapple = new GroceryItemOrder(Filehandler.getGroceryName(2), 7, 1.00);
        GroceryItemOrder soda = new GroceryItemOrder(Filehandler.getGroceryName(8), 4, 0.50);
        GroceryItemOrder bread = new GroceryItemOrder(Filehandler.getGroceryName(4), 9, 12.00);
        GroceryItemOrder flour = new GroceryItemOrder(Filehandler.getGroceryName(11), 1, 20.00);
        cart.add(apple); cart.add(pear); cart.add(banana); cart.add(pineapple);
        cart.add(soda); cart.add(bread); cart.add(flour);
    }

    public static void createGroceryList2(GroceryList2 cart)
    {
        GroceryItemOrder apple = new GroceryItemOrder(Filehandler.getGroceryName(1), 1, 1.50);
        GroceryItemOrder pear = new GroceryItemOrder(Filehandler.getGroceryName(3), 5, 20.00);
        GroceryItemOrder banana = new GroceryItemOrder(Filehandler.getGroceryName(7), 3, 13.50);
        GroceryItemOrder pineapple = new GroceryItemOrder(Filehandler.getGroceryName(2), 7, 1.00);
        GroceryItemOrder soda = new GroceryItemOrder(Filehandler.getGroceryName(8), 4, 0.50);
        GroceryItemOrder bread = new GroceryItemOrder(Filehandler.getGroceryName(4), 9, 12.00);
        GroceryItemOrder flour = new GroceryItemOrder(Filehandler.getGroceryName(11), 1, 20.00);
        cart.add(apple); cart.add(pear); cart.add(banana); cart.add(pineapple);
        cart.add(soda); cart.add(bread); cart.add(flour);
    }



}
