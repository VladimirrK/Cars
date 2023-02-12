package transport;

import java.util.regex.Pattern;

public class ValidateUtil {
    public static String validateString(String value, String defaultValue) {
        return (value == null || value.isBlank() || value.isEmpty() ? defaultValue : value);
    }

    public static double validateEngine(double value, double defaultValue) {
        return (value <= 0 ? defaultValue : value);
    }

    public static String validateColor(String value, String defaultValue) {
        return (value == null || value.isBlank() || value.isEmpty() ? defaultValue : value);
    }

    public static Integer validateYear(Integer value, Integer defaultValue) {
        return (value <= 0 ? defaultValue : value);
    }

    public static Integer validateNumberOfSeats(Integer value, Integer defaultValue) {
        return (value < 2 || value > 7 ? defaultValue : value);
    }

    public static String validateNumber(String value, String defaultValue) {
        if (Pattern.matches("[АВЕКМ-ОР-УХ][1-9]{3}[АВЕКМ-ОР-УХ]{2}[0-9]{3}", value)) {
            return value;
        } else {
            return defaultValue;
        }
    }
    public static Integer validateSpeed(Integer value, Integer defaultValue) {
        return (value < 60 || value == 0 ? defaultValue : value);
    }
}
