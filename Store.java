public class Store
{
    //set three products as attributes for the Store class
    Product p1;
    Product p2;
    Product p3;
    //create variables that keep track of the amount of each item in the cart
    int productOneInCart;
    int productTwoInCart;
    int productThreeInCart;

    //running total of the cart
    double totalCost = 0;


    //Constructor of Store Class - Creates a Store object
    public Store ()
    {
         p1 = new Product("Laptop",999.99,5);
         p2 = new Product("Headphones",49.99, 10);
         p3 = new Product("Smartphone", 699.99, 3);

    }

    //METHODS:

    /*
    The displayProducts() method prints out the current state of each product
    including the name, price, and current stock so the user knows this info.
    This method uses the toString() method.
     */
    public void displayProducts() //Show the details of all available products
    {
        System.out.println("Available Products:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }

    /*
    The addToCart() Method takes in two parameters, productName and
    quantity, which are retrieved from the user in the main method.
    The product name given by the user is tested against the names
    of each product object using the getName() method that belongs
    to the product class. Then, once the object is determined,
    the quantity that the user wants of that product is tested
    against that products stock using the isAvailable method.
    If the product quantity is available, the quantity wanted
    by the user is added to the variable that holds the quantity
    of that product currently in the cart. Then the stock of
    that product is reduced by the quantity. Then a message
    is displayed to the user showing what was added to their
    cart. In the case that the stock is not enough for the amount
    that the user wants, a low stock message is displayed to
    the user
     */
    public void addToCart (String productName, int quantity)
    {
        if (productName == p1.getName())
        {
            if(p1.isAvailable(quantity))
            {
            productOneInCart += quantity;
            p1.reduceStock(quantity);
            //Display message to user about what was added to their cart
            System.out.println(quantity + "Laptop(s) added to your cart");
            }
            else
            {
                System.out.println("Product not available");
            }

        }
        else if (productName == p2.getName())
        {
            if(p2.isAvailable(quantity))
            {
            productTwoInCart += quantity;
            p2.reduceStock(quantity);
            //Display message to user about what was added to their cart
            System.out.println(quantity + "Headphone(s) added to your cart");
            }
            else
            {
                System.out.println("Product not available");
            }

        }
        else
        {
            if(p3.isAvailable(quantity))
            {
            productThreeInCart += quantity;
            p3.reduceStock(quantity);
            //Display message to user about what was added to their cart
            System.out.println(quantity + "Smartphone(s) added to your cart");
            }
            else
            {
                System.out.println("Product not available");
            }
        }


    }

    /*
    The viewCart() method displays the current state of the user's cart.
    It does this by testing the value of each product amount instance
    variables. If any of the variables are greater than 0 aka,
    the user added some amount to their cart, the price of that product is
    multiplied by the quantity of that product in the "cart." Then that value
    is added to the running totalCost. Then a message of what amount
    of that product is in the cart and how much of the total cost comes
    from that product. Finally, the totalCost is displayed.
     */
    public void viewCart()
    {
        //double totalCost = 0;
        System.out.println("Your Cart:");

        if (productOneInCart > 0)
        {
            double cost = p1.getPrice() * productOneInCart;
            totalCost += cost;
            System.out.println("-" + productOneInCart +
                                "Laptop($999.99 each) = "+
                                    cost);
        }
        if (productTwoInCart > 0)
        {
            double cost = p2.getPrice() * productTwoInCart;
            totalCost += cost;
            System.out.println("-" + productTwoInCart +
                                "Headphone($49.99 each) = "+
                                    cost);

        if(productThreeInCart > 0)
        {
            double cost = p3.getPrice() * productThreeInCart;
            totalCost += cost;
            System.out.println("-" + productThreeInCart +
                                "Smartphone($699.99 each) = " +
                                cost);
        }
        System.out.println("Total: " + totalCost);

    }

    public void checkout()
    {
        System.out.println("Checking out...");
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Thank you for your purchase!");
    }
}

