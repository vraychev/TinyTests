import java.security.MessageDigest;

class Test {

  
  public void IP(byte[] salt) {
    encrypt(salt, "MD5");
  } 

  public void encrypt(byte[] salt, String crypto) {
    MessageDigest digest = MessageDigest.getInstance(crypto);
    digest.reset();
    digest.update(salt);
    digest.digest();
  }
}

