import com.sun.deploy.util.StringUtils;

public class Helper {

    static final String message1 = "Input valid value";

    public static boolean isNumericMy(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal
    }

    public static boolean isPositiveMy(String str) {
        if (isNumericMy(str)) {
            return str.matches("d\\+"/*"\\d+(\\.\\d+)?"*/);  //match a positive number
        }else return false;
    }




}
