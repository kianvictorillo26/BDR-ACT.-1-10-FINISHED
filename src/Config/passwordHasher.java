
package Config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class passwordHasher {
        public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(password.getBytes());
        String encoded = Base64.getEncoder().encodeToString(hashBytes);
        return encoded;
    }
      // Check if entered password matches stored hashed password
    public static boolean checkPassword(String plainPassword, String storedHashedPassword) throws NoSuchAlgorithmException {
        return hashPassword(plainPassword).equals(storedHashedPassword);
    }
}
