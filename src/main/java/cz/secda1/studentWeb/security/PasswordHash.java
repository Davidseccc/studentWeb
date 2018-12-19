package cz.uhk.security;

import javax.ejb.Stateless;
import javax.inject.Named;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *  HashPassword
 */
@Named
@Stateless
public class PasswordHash implements Serializable {

    final String HASH_ALGORITHM = "SHA-256";

    private MessageDigest messageDigest;

    @PostConstruct
    private void init() {
        try {
            messageDigest = MessageDigest.getInstance(HASH_ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /**
     * Password-specific hash function
     *
     * @param password Password to hash
     * @param salt     Admin-specific salt
     * @return Hashed password & salt variation, represented as a BASE64 String
     */
    public String getHashedPassword(String password, String salt) {
        byte[] passwordBytes = password.getBytes();
        byte[] saltBytes = salt.getBytes();

        ByteBuffer byteBuffer = ByteBuffer.allocate(passwordBytes.length + saltBytes.length);
        byteBuffer.put(saltBytes);
        byteBuffer.put(passwordBytes);
        byte[] digest = messageDigest.digest(byteBuffer.array());
        return Base64.getEncoder().encodeToString(digest);
    }

}
