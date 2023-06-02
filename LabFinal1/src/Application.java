import java.util.ArrayList;
import java.util.Scanner;

public class Application extends EncryptionUtil{
    private ArrayList <AuthenticationInfo> list = new ArrayList<>();
    public void start(){
        int choice;
        System.out.println("1. New login info");
        System.out.println("2. View login info");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice){
            case 1:
                NewLoginInfo();
                break;
            case 2:
                ViewLoginInfo();
                break;
            case 3:
                break;
        }
    }
    public void NewLoginInfo(){
        String URL,username,password;
        System.out.print("Enter the URL: ");
        Scanner sc = new Scanner(System.in);
        URL = sc.nextLine();
        System.out.print("Enter your username: ");
        username = sc.nextLine();
        System.out.print("Enter your password: ");
        password = sc.nextLine();
        AuthenticationInfo user = new AuthenticationInfo(URL,username,password);
        user = createLoginRecord(user);
        list.add(user);
        start();
    }
    public AuthenticationInfo createLoginRecord(AuthenticationInfo user){
        String password = encrypt(user.getPassword());
        user.setPassword(password);
        return user;
    }
    public void ViewLoginInfo(){
        String URL;
        System.out.print("Enter the URL: ");
        Scanner sc = new Scanner(System.in);
        URL = sc.nextLine();
        ArrayList <AuthenticationInfo> sameUrl = viewLoginRecord(URL);
        System.out.println("This is list of username and password: ");
        for(AuthenticationInfo user: sameUrl){
            System.out.println(user);
        }
        start();
    }
    public ArrayList<AuthenticationInfo> viewLoginRecord(String URL){
        ArrayList <AuthenticationInfo> sameUrl = new ArrayList<>();
        for(AuthenticationInfo user : list){
            if(user.getURL().equals(URL)){
                String password = decrypt(user.getPassword());
                user.setPassword(password);
                sameUrl.add(user);
            }
        }
        return sameUrl;
    }
}
