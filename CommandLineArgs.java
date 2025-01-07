public class CommandLineArgs {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("You entered the following arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments were provided!");
        }
    }
}
