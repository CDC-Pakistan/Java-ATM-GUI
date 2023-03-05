public class InputValidator {
    public static boolean isValidDoubleString(String input) {
        if (input == null) {
            return false;
        }
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}