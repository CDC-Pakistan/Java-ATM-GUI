public class IDManager {
    // This handles the generation of IDs
    // across all classes.
    public static String generateID() {
        String id = "";
        for (int i = 0; i < 2; i++) {
            id += (char) (Math.random() * 26 + 65);
        }
        for (int i = 0; i < 2; i++) {
            id += (int) (Math.random() * 10);
        }
        return id;
    }

    // This handles the generation of passwords
    // across all classes.
    public static String generatePassword() {
        String password = "";
        for (int i = 0; i < 4; i++) {
            password += (char) (Math.random() * 26 + 65);
        }
        return password;
    }

    public static void main(String[] args) {
        System.out.println(generateID());
        System.out.println(generatePassword());
    }
}