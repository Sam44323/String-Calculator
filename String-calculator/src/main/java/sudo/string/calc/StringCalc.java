package sudo.string.calc;

import java.util.StringTokenizer;

public class StringCalc {

    public static void main(String[] args) {
        System.out.println(Add("//;\n60;40;90"));
    }

    public static int Add(String value) {
        if (value.isEmpty()) {
            return 0;
        } else if (value.startsWith("//")) {
            String pattern = value.substring(2, value.indexOf("\n"));
            value = value.substring(value.indexOf("\n") + 1);
            StringTokenizer st = new StringTokenizer(value, pattern);
            int addvalue = 0;
            while (st.hasMoreTokens()) {
                addvalue += Integer.parseInt(st.nextToken());
            }
            return addvalue;
        } else if (value.contains(",") || value.contains("\n")) {
            // refactor this tokenizer to diff function later
            StringTokenizer st = new StringTokenizer(value, ",\n");
            int addvalue = 0;
            while (st.hasMoreTokens()) {
                addvalue += Integer.parseInt(st.nextToken());
            }
            return addvalue;
        } else {
            return Integer.parseInt(value);
        }
    }
}
