package sudo.string.calc;

import java.util.StringTokenizer;

public class StringCalc {

    public static int calculateSumValue(String value, String pattern) {
        StringTokenizer st = new StringTokenizer(value, pattern);
        int addvalue = 0;
        while (st.hasMoreTokens()) {
            int tokenVal = Integer.parseInt(st.nextToken());
            if (tokenVal > 1000) {
                tokenVal = 0;
            }
            addvalue += tokenVal;
        }
        return addvalue;
    }

    public static void main(String[] args) {
        System.out.println(Add("//[***]\n10***20***30***15***15"));
    }

    public static int Add(String value) {
        if (value.isEmpty()) {
            return 0;
        } else if (value.startsWith("//")) {

            String pattern = "";
            if (value.contains("[") && value.contains("]")) {
                pattern = value.substring(value.indexOf("[") + 1, value.indexOf("]"));
            } else {
                pattern = value.substring(2, value.indexOf("\n"));
            }
            value = value.substring(value.indexOf("\n") + 1);
            return calculateSumValue(value, pattern);

        } else if (value.contains(",") || value.contains("\n")) {
            return calculateSumValue(value, ",\n");
        } else {
            return Integer.parseInt(value);
        }
    }
}
