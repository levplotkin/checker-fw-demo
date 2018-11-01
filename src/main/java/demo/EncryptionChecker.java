package demo;

import demo.custom.annotations.Encrypted;

public class EncryptionChecker {

    public @Encrypted String encrypt(String text) {
        @Encrypted String encryptedText = new @Encrypted String(text);
        return encryptedText;
    }

    // Only send encrypted data
    public void sendTopSecret(@Encrypted String msg) {
    }

    public void test() {
        String password = "plain text password";
// todo comment the line below to get compilation error
        password = encrypt(password);
        sendTopSecret(password);
    }

}
