package sudo.string.calc;

import java.util.Stack;
import java.util.StringTokenizer;

import javax.management.RuntimeErrorException;

public class StringCalc {
    static Stack<Integer> neg = new Stack<Integer>();

    public static int calculateSumValue(String value, String pattern) {
        StringTokenizer st = new StringTokenizer(value, pattern);
        int addvalue = 0;
        neg.clear();
        boolean hasNeg = false;
        while (st.hasMoreTokens()) {
            int tokenVal = Integer.parseInt(st.nextToken());
            if (tokenVal < 0) {
                hasNeg = true;
                neg.push(tokenVal);
                continue;
            }
            if (tokenVal > 1000) {
                tokenVal = 0;
            }
            addvalue += tokenVal;
        }
        if (hasNeg) {
            throw new RuntimeException("Negative integer not allowed");
        }
        return !hasNeg ? addvalue : 0;
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
            int addVal = 0;
            try {
                addVal = calculateSumValue(value, pattern);
            } catch (Exception e) {
                System.err.println(e);
            }
            return addVal;

        } else if (value.contains(",") || value.contains("\n")) {
            return calculateSumValue(value, ",\n");
        } else {
            return Integer.parseInt(value);
        }
    }
}
