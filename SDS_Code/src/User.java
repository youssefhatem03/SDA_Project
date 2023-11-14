import java.util.Scanner;

public abstract class User {

    String FirstName;
    String LastName;
    String PhoneNumber;
    String Username;
    String Password;
    String AccountType;
    float Balance;


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

   public abstract void SignUp() throws InterruptedException;

   public abstract void TransferToWallet();

    public abstract void LoadProfile();

    public abstract float InquireBalance();

}