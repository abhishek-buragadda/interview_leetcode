public class StringToInt {

    public int myAtoi(String str) {
        int result = 0;
        str = str.trim();

        boolean isNegative = false;
        int length = str.length();
        int i = 0;
        for (i = 0; i < length; i++) {
            if (i == 0) {
                if (str.charAt(i) == '-') {
                    isNegative = true;
                    continue;
                } else if (str.charAt(i) == '+') {
                    isNegative = false;
                    continue;
                }
            }
            if (!Character.isDigit(str.charAt(i))) {
                str = str.substring(0, i);
                if (i == 0) {
                    return 0;
                }
                break;
            }
        }
        if (i == str.length()) {
            result = convertToInt(str, isNegative);
        }
        System.out.println(result);
        return result;
    }

    int convertToInt(String str, boolean isNegative) {
        int result = 0;
        if (str.length() == 0) {
            return 0;
        } else {
            try {
                result = Integer.parseInt(str);
            } catch (Exception e) {
                if (isNegative) {
                    if (str.length() == 1) return 0;
                    result = Integer.MIN_VALUE;
                } else {
                    if (str.length() == 1) return 0;
                    result = Integer.MAX_VALUE;
                }
            }
        }

        return result;
    }

}
