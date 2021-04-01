package sudo.string.calc;

import java.util.StringTokenizer;

public class StringCalc {

    public static void main(String[] args) {
        System.out.println(Add("60,40"));
    }

    public static int Add(String value) {
        if (value.isEmpty()) {
            return 0;
        } else if (value.contains(",") || value.contains("\n")) {
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
