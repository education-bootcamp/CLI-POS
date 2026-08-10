import java.util.*;

class Initializer {
    static Scanner input = new Scanner(System.in);
    static String[] customers = new String[100]; //[[null],[null],[],[],[]]
    static int customerCounter = 0;

    static String[] customerQ = {
            "1) Save Customer",
            "2) Update Customer",
            "3) Delete Customer",
            "4) Search Customer",
            "5) Back",
            "6) Exit"
    };

    public static void clearNewLine(){
        input.nextLine();
    }

    //=========Customer management
    public static void saveCustomer() {
        System.out.println("Please Enter Customer (" + (customerCounter + 1) + ") Name");
        String name = input.nextLine();
        customers[customerCounter] = name;
        customerCounter++;
        System.out.println("Customer Saved : " + name);

    }

    public static void updateCustomer() {
        System.out.println("Please Enter Customer Id");
        int customerIndex = input.nextInt(); // \n
        clearNewLine();

        String customerName = customers[customerIndex];
        if(customerName!=null){ // null!=customerName
            System.out.println("Customer found and name is :"+ customerName);
            System.out.println("Insert new Customer Name");

            String tempName = input.nextLine();
            customers[customerIndex]=tempName;
            System.out.println("Customer Updated new name is : "+ tempName);
        }else{
            System.out.println("Customer Not Found!.");
        }
    }
    //=========Customer management

    public static void printWelcomeNote() {
        System.out.println("===========================");
        System.out.println("Hello Welcom to the CLI POS");
        System.out.println("===========================");
    }

    public static void printPrimaryQ() {
        System.out.println("===========================");
        System.out.println("Choose an Option (Enter the number)");
        System.out.println("===========================");

        System.out.println("1) Customer Management");
        System.out.println("2) Product Management");
        System.out.println("3) Order Management");
        System.out.println("4) Exit");
    }

    public static void manageCustomer() {
        System.out.println("Manage your Customers");

        while (true) {

            System.out.println(Arrays.toString(customers));

            //------print Q------------

            for (String temp : customerQ) {
                System.out.println(temp);
            }
            //------print Q------------

            //input.nextLine();
            int num = input.nextInt(); // \n
            clearNewLine();

            switch (num) {
                case 1:
                    saveCustomer();
                    break;
                case 2:
                    updateCustomer();
                    break;
                case 3: // delete customer
                case 4: // search Customer
                case 5: // back to home
                case 6: // exit
                default:
                    System.out.println("Wrong input please try again");
            }
        }
    }

    public static void manageProduct() {
        System.out.println("Product management");
    }

    public static void manageOrder() {
        System.out.println("Orders management");
    }

    public static void exit() {
        System.out.println("Good bye!..");
    }

    public static void main(String[] args) {
        // start welcome note

        printWelcomeNote();

        while (true) {
            printPrimaryQ();


            int num = input.nextInt();
            clearNewLine();

            switch (num) {
                case 1:
                    manageCustomer();
                    break;
                case 2:
                    manageProduct();
                    break;
                case 3:
                    manageOrder();
                    break;
                case 4:
                    exit();
                default:
                    System.out.println("Are you crazy? please insert a valid number");
            }
        }
    }
}