public class StrStr {


    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength == 0) return 0;
        for (int i = 0; i < haystackLength; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int resultIndex = i;
                int j = 0;
                while (j < needleLength && i < haystackLength && haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                }
                if (j == needleLength) {
                    return resultIndex;
                } else {
                    i = resultIndex;
                }
            }
        }
        return -1;
    }
}
