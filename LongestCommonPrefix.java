public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        int minLen = findSmallestLength(strs);
        for (int i = 0; i < minLen; i++) {
            if (strs.length > 0) {
                char temp = strs[0].charAt(i);
                boolean flag = false;
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].charAt(i) != temp) {
                        flag = true;
                    }
                }
                if (flag) {
                    break;
                } else {
                    sb.append(temp);
                }
            }
        }
        result = sb.toString();
        System.out.println(result);
        return result;

    }

    int findSmallestLength(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (minLen > strs[i].length()) {
                minLen = strs[i].length();
            }

        }
        return minLen;
    }
}
