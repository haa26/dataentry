package pkl51.database;

/**
 * Modified from:
 * @see http://stackoverflow.com/questions/1132567/encrypt-password-in-configuration-files-java
 * @author Johannes Brodwall FROM Stack Overflow
 */
//import java.io.IOException;
//import java.security.GeneralSecurityException;
//
//import javax.crypto.Cipher;
//import javax.crypto.SecretKey;
//import javax.crypto.SecretKeyFactory;
//import javax.crypto.spec.PBEKeySpec;
//import javax.crypto.spec.PBEParameterSpec;
//
//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;
public class PasswordUtility {

//    private static final char[] PASSWORD = "enfldsgbnlsngdlksdsgm".toCharArray();
//    private static final char[] PASSWORD = "pkl51gunungkiduljogja".toCharArray();
//    private static final byte[] SALT = {
//        (byte) 0xde, (byte) 0x33, (byte) 0x10, (byte) 0x12,
//        (byte) 0xde, (byte) 0x33, (byte) 0x10, (byte) 0x12,};
//
//    public static String encrypt(String property) throws GeneralSecurityException {
//        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
//        SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
//        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
//        pbeCipher.init(Cipher.ENCRYPT_MODE, key, new PBEParameterSpec(SALT, 20));
//        return base64Encode(pbeCipher.doFinal(property.getBytes()));
//    }
//
//    public static String decrypt(String property) throws GeneralSecurityException, IOException {
//        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
//        SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
//        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
//        pbeCipher.init(Cipher.DECRYPT_MODE, key, new PBEParameterSpec(SALT, 20));
//        return new String(pbeCipher.doFinal(base64Decode(property)));
//    }
//
//    private static String base64Encode(byte[] bytes) {
//        // NB: This class is internal, and you probably should use another impl
//        return new BASE64Encoder().encode(bytes);
//    }
//
//    private static byte[] base64Decode(String property) throws IOException {
//        // NB: This class is internal, and you probably should use another impl
//        return new BASE64Decoder().decodeBuffer(property);
//    }
//    public static void main(String[] args) throws Exception {
//        String originalPassword = "secret";
//        String b64 = base64Encode("RAHASIASDASDF".getBytes());
//        System.out.println("b64 e : " +b64);
//        System.out.println("b64 d : " + base64Decode(b64));
//        System.out.println("Original password: " + originalPassword);
//        String encryptedPassword = encrypt(originalPassword);
//        System.out.println("Encrypted password: " + encryptedPassword);
//        String decryptedPassword = decrypt(encryptedPassword);
//        System.out.println("Decrypted password: " + decryptedPassword);
//    }
    //Karena sprtinya class di atas gak support, pake enkripsi sederhana saja
    
    //tapi ingat hanya digunakan bisa digunakan untuk character a sampai z
    //ini merupakan sandi AZ
    public static String encrypt(String a) {
        char[] charA = a.toCharArray();
        for (int i = 0; i < charA.length; i++) {
            charA[i] = ganti(charA[i]);
        }
        String result = String.valueOf(charA);
        return result;
    }

    public static String decrypt(String a) {
        char[] charA = a.toCharArray();
        for (int i = 0; i < charA.length; i++) {
            charA[i] = ganti(charA[i]);
        }
        String result = String.valueOf(charA);
        return result;
    }

    private static char ganti(char a) {
        int b = 219 - a;
        return (char) b;
    }
}
