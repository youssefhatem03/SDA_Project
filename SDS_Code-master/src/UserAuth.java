import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {

    static public String FirstName;
    static public String LastName;
    static public String PhoneNumber;
    static public String Username;
    static public String Password;
    static public String AccountType;
    static public float Balance;

    static Map<String, String[]> Users = new HashMap<>();

    // Sign in
    public UserAuth(String username, String pass) {

        Users.put("youssefhatem03", new String[]{"Youssef", "Hatem", "011111111", "20216121", "youssef123", "Bank" , "1500"});
        Users.put("hatem-sharour", new String[]{"Hatem", "Shahrour", "011111111", "20216032", "hatem123", "Bank" , "1200"});
        Users.put("eyadhany8", new String[]{"Eyad", "Hany", "011111111", "20216024", "eyad123", "Wallet" , "1700"});
        Users.put("EEslamo", new String[]{"Eslam", "Yasser", "011111111", "20216020", "eslam123", "Wallet" , "2000"});

        Username = username;
        Password = pass;
        String[] newUser = Users.get(Username);
        if (newUser != null) {
            FirstName = newUser[0];
            LastName = newUser[1];
            PhoneNumber = newUser[2];
            Password = newUser[4];
            AccountType = newUser[5];
            Balance = Float.parseFloat(newUser[6]);
            System.out.println("private");
        } else {
            System.out.println("User not found or incomplete information");
        }
    }


    void SetAccountType() {
        int type;
        Scanner scan = new Scanner(System.in);
        System.out.println("Select your account type: ");
        System.out.println("1- Bank account user        2- Wallet User");
        type = scan.nextInt();
        if(type == 1)
            AccountType = "Bank";
        else if (type == 2)
            AccountType = "Wallet";
        else if (type == 0) {
            System.exit(0);
        } else {
            System.out.println("- Not a valid choice, try again.");
            System.out.println("Or press 0 to exit");
            SetAccountType();
        }
    }


}
