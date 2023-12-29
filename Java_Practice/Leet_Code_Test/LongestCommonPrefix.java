public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = { "flower", "flow", "flight" };
        String result = longestCommon(s);
        System.out.println("Output = " + result);
    }

    static String longestCommon(String[] s) {
        if (s == null || s.length == 0)
            return "";

        String prefix = s[0];
        for (int i = 1; i < s.length; i++) {
            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // substring ฟังก์ชันสำหรับตัดคำ
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
