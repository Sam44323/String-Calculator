package sudo.string.calc;

public class StringCalc {

    public static int Add(String value) {
        if (value.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(value);
        }
    }
}
