public class Product
{
    //Instance Variables of the Product class
    private String  name;
    private double price;
    private int stock;  //Number of units available

    //Constructor - initializes each instance field
    public Product (String nameInit, double priceInit, int stockInit)
    {
        name = nameInit;
        price = priceInit;
        stock = stockInit;
    }

    //METHODS:

    /*
    the toString() method returns the current state of the product object,
    that being its name, its price, and its updated stock.
     */
    public String toString()
    {
        return "-Product: " + name + ", Price: $"
                + price + ", Stock: " + stock;

    /*
    the getName() method returns the objects name, this allows the
    instance variable, name, to be accessed outside the class
     */
    public String getName()
    {
        return name;
    }

    /*
    the getPrice() method returns the objects price, this allows the
    instance variable, price, to be accessed outside the class
     */
    public double getPrice()
    {
        return price;
    }

    /*
    the getStock() method returns the objects stock, this allows the
    instance variable, name, to be accessed outside the class
     */
    public int getStock()
    {
        return stock;
    }

    /*
    the reduceStock() method has no return value because it is a mutator
    method. It alters the value of stock instance variable by a given quantity.
     */
    public void reduceStock(int quantity)
    {

        //if the quantity wanted is less than stock, it can be purchased.
        if (quantity<=stock) // CAN I REPLACE THIS USING IS AVAILABLE????
        {
            stock -= quantity;
        }
        /*
        if the quantity isn't less than the amount of stock,
        it cannot be purchased
        */
        else {
            System.out.println("Not enough stock");
        }
    }

    /*
    the isAvailable() returns a boolean value indicating whether or not
    an item is or is not in stock.
     */
    public boolean isAvailable(int quantity)
    {
        return quantity <= stock;

    }
}
