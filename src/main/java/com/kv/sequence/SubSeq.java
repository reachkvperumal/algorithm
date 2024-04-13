package com.kv.sequence;

public class SubSeq {

    static boolean isSubSeq(String a, String b, int x, int y) {
        if (x == 0) return true;
        if (y == 0) return false;

        if (a.charAt(x - 1) == b.charAt(y - 1))
            return isSubSeq(a, b, x - 1, y - 1);

        return isSubSeq(a, b, x, y - 1);
    }


    static boolean isSubSeq(String s1, String s2) {
        int x = s1.length(), y = s2.length();
        int i = 0, j = 0;

        while (i < x && j < y) {
            if ((s1.charAt(i)) == s2.charAt(j))
                i++;
            j++;
        }
        return x == i;
    }


    public static void main(String[] args) {
        String a = "kv";
        String b = "karpagavinayagam";
        System.out.println(isSubSeq(a, b, a.length(), b.length()) ? "Yes" : "No");
        System.out.println(isSubSeq(a, b) ? "Yes" : "No");
    }

}
