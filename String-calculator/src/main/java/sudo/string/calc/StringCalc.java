package sudo.string.calc;

import java.util.StringTokenizer;

public class StringCalc {

    public static int calculateSumValue(String value, String pattern) {
        StringTokenizer st = new StringTokenizer(value, pattern);
        int addvalue = 0;
        while (st.hasMoreTokens()) {
            addvalue += Integer.parseInt(st.nextToken());
        }
        return addvalue;
    }

    public static void main(String[] args) {
        System.out.println(Add("//;\n60;40;90"));
    }

    public static int Add(String value) {
        if (value.isEmpty()) {
            return 0;
        } else if (value.startsWith("//")) {

            String pattern = value.substring(2, value.indexOf("\n"));
            value = value.substring(value.indexOf("\n") + 1);
            return calculateSumValue(value, pattern);

        } else if (value.contains(",") || value.contains("\n")) {
            return calculateSumValue(value, ",\n");
        } else {
            return Integer.parseInt(value);
        }
    }
}
