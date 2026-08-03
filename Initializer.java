import java.util.*;

class Initializer {

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

            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

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
            }
        }
    }
}