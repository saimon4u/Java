public class AuthenticationInfo {
    private String URL;
    private String username;
    private String password;
    AuthenticationInfo(String URL,String username,String password){
        this.password = password;
        this.URL = URL;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getURL() {
        return URL;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\n" + "Password: " + password + "\n";
    }
}
