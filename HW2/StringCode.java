import java.util.*;

public class StringCode {
    /**
     * chuanhoa.
     * @param str string dau vao
     * @return chuanhoa.
     */
    public String blowup(String str) {
        String a = "";
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9' ) {
                if (i == str.length() - 1) continue;
                char c = str.charAt(i + 1);
                for (int j = 1; j <= (str.charAt(i) - '0'); j++)
                {
                    a += c;
                }
            }
            else a += str.charAt(i);
        }
        return a;
    }

    /**
     * do dai xau con dai nhat.
     * @param str xau dau vao.
     * @return do dai.
     */
    public int maxRun(String str) {
        int dem = 1, ans = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                dem++;
            } else {
                ans = Math.max(ans, dem);
                dem = 1;
            }
        }

        ans = Math.max(ans, dem);
        return ans;

    }

    /**
     * kiemtra.
     * @param a s1
     * @param b s2
     * @param len do dai
     * @return true false.
     */
    public boolean stringIntersect(String a, String b, int len) {
        if (a.length() < len || b.length() < len) {
            return false;
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < a.length() - len + 1; i++) {
            set.add(a.substring(i, i + len));
        }

        for (int i = 0; i < b.length() - len + 1; i++) {
            String tmp = b.substring(i, i + len);
            if (set.contains(tmp)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
