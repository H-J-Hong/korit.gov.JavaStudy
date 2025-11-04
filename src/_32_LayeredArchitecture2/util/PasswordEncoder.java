package _32_LayeredArchitecture2.util;

import java.util.Objects;

public class PasswordEncoder {
    private static final String secrets = "암호화비밀번호";
    public static String encode(String str) {
        if (str == null) return null;
        System.out.println("signed hash : " + Objects.hash(str));
        long hash = Integer.toUnsignedLong(Objects.hash(str));
        System.out.println("unsigned hash : " + hash);
        long encodeHash = hash + Objects.hash(secrets);
        System.out.println("encoded hash : " + encodeHash);
        System.out.println("toHexString hash : " + Long.toHexString(encodeHash));
        return Long.toHexString(encodeHash);
    }

    public static boolean match (String aaa, String bbb) {
        if (aaa == null || bbb == null) {
            return false;
        } else {
            return encode(aaa).equals(encode(bbb));
        }
    }
}
