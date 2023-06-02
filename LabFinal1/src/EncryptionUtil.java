public class EncryptionUtil {
    public String encrypt(String password){
        password = password.substring(2,password.length()) + password.substring(0,2);
        return password;
    }
    public String decrypt(String password){
        password = password.substring(password.length()-2,password.length()) + password.substring(0,password.length()-2);
        return password;
    }
}
