public class HelloApp {
    public static void main(String[] args) {

        // Check if any command-line argument is provided
        if (args.length > 0) {
            String name = args[0];  // First argument
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message if no argument is passed
            System.out.println("Hello, World!");
        }
    }
}