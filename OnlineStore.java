import java.util.Scanner;

public class OnlineStore
{
    public static void main(String[] args)
    {
        boolean menuControl = true;
        int userChoice;
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();

        while(menuControl)
        {
            //Print out the menu
            System.out.println("Welcome to the Simple Online Store");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            //Collect the user's choice
            userChoice = scanner.nextInt();

            //test their choice against the menu options
            if (userChoice == 1)
            {
                store.displayProducts();
            }

            else if(userChoice == 2)
            {
                //prompt the user to enter the product they want
                System.out.println("Enter product name: ");
                //Collect their input and store it
                String productName = scanner.next();
                //Prompt the user to enter the quantity they want
                System.out.println("Enter the quantity: ");
                //collect their input and store it
                int quantity = scanner.nextInt();
                /*Once all the data is collected from the user, we need to actually
                add the items to the cart using the addToCart() method */
                store.addToCart(productName,quantity); //does string and int need to come in front???

            }
            else if (userChoice == 3)
            {
                store.viewCart();
            }

            else if (userChoice == 4)
            {
                store.checkout();
            }
            else {
                System.out.println("Goodbye!");
                menuControl = false;
            }


        }


    }
}