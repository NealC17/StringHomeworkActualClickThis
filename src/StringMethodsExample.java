public class StringMethodsExample{

    public static void main(String[] args) {
        System.out.println(abcTest("123abc"));
        // System.out.println(abcTest("a.abc"));
        // System.out.println(abcTest("abc.123"));

        System.out.println(alternateStrings("abc", "xyz"));
        System.out.println(alternateStrings("hi", "there"));
        //System.out.println(alternateStrings("xxxx", "Thereee"));
        //System.out.println(alternateStrings("Thereee", "xxxx"));

    }

    public static String alternateStrings(String s1, String s2) {
        String weaved;

        if (s1.length() > s2.length()) {
            weaved = weave(s1, s2, s1);
            weaved += s1.substring(s2.length());
        } else {
            weaved = weave(s2, s1, s1);
            weaved += s2.substring(s1.length());
        }

        return weaved;
    }

    private static String weave(String s1, String s2, String first) {
        String weaved = "";
        for (int i = 0; i < s2.length(); i++) {

            if (s1.equals(first)) {
                weaved += s1.substring(i, i + 1);
                weaved += s2.substring(i, i + 1);
            } else {
                weaved += s2.substring(i, i + 1);
                weaved += s1.substring(i, i + 1);
            }
        }

        return weaved;
    }

    public static boolean abcTest(String string) {
        if (string.indexOf("abc") == -1 || string.indexOf(".") == string.indexOf("abc") - 1) {
            return false;
        }
        return true;
    }

}



