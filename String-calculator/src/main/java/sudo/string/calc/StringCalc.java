package sudo.string.calc;

import java.util.Stack;
import java.util.StringTokenizer;

public class StringCalc {
    static Stack<String> neg = new Stack<String>();

    public static int calculateSumValue(String value, String pattern) {
        StringTokenizer st = new StringTokenizer(value, pattern);
        int addvalue = 0;
        boolean hasNeg = false;
        while (st.hasMoreTokens()) {
            int tokenVal = Integer.parseInt(st.nextToken());
            if (tokenVal < 0) {
                hasNeg = true;
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

    public static int calculateMultipleDelSum(String value) {
        neg.clear();
        String pattern = value.substring(value.indexOf("[") + 1, value.indexOf("\n") - 1);
        value = value.substring(value.indexOf("\n") + 1);
        pattern += "]";
        String chr = "[]";
        String vls = "";
        for (int i = 0; i < pattern.length(); i++) {
            char vals = pattern.charAt(i);
            if (vals == chr.charAt(1)) {
                neg.push(vls);
                vls = "";
            } else {
                vls += pattern.charAt(i) != chr.charAt(0) ? pattern.charAt(i) : "";
            }
        }
        String patterns = "[";
        for (String vals : neg) {
            patterns += vals;
        }
        patterns += "]";
        return calculateSumValue(value, patterns);
    }

    public static int Add(String value) {
        if (value.isEmpty()) {
            return 0;
        } else if (value.startsWith("//")) {

            String pattern = "";
            if (value.contains("[") && value.contains("]")) {
                int count = 0;
                for (int i = 2; i < value.indexOf("\n"); i++) {
                    if (value.charAt(i) == '[') {
                        count++;
                    }
                }
                if (count > 1) {
                    return calculateMultipleDelSum(value);
                }
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
