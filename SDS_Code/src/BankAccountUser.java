import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class BankAccountUser extends User{

    static Map<String, String[]> BankUsers = new HashMap<>();

    public BankAccountUser()
    {
        BankUsers.put("youssefhatem03", new String[]{"Youssef", "Hatem", "011111111", "20216121", "youssef123", "Bank" , "1500"});
        BankUsers.put("hatem-sharour", new String[]{"Hatem", "Shahrour", "011111111", "20216032", "hatem123", "Bank" , "1200"});
        BankUsers.put("eyadhany8", new String[]{"Eyad", "Hany", "011111111", "20216024", "eyad123", "Bank" , "1700"});
        BankUsers.put("EEslamo", new String[]{"Eslam", "Yasser", "011111111", "20216020", "eslam123", "Bank" , "2000"});
    }

    @Override
    public void SignUp() throws InterruptedException {
        Scanner ScanText = new Scanner(System.in);
        Scanner ScanNum = new Scanner(System.in);
        Random random = new Random();
        System.out.println("- Enter your bank ID");
        String id = ScanText.nextLine();
        System.out.println("- Enter your First name");
        String fName = ScanText.nextLine();
        System.out.println("- Enter your Last name");
        String lName = ScanText.nextLine();
        System.out.println("- Enter your Phone number");
        String phNum = ScanText.nextLine();
        System.out.println("- Verifying your phone number.....");
        System.out.println("- Sending OTP to your number.....");
        Thread.sleep(3000);
        int sixDigitRandom = random.nextInt(900000) + 100000;
        System.out.println("Your OTP is: " + sixDigitRandom);
        System.out.print("- Enter the OTP sent to your phone to verify......   ");
        int OTP = ScanNum.nextInt();
        while(OTP != sixDigitRandom){
            System.out.println("- Password is not complex... try again, or press 0 to exit");
            OTP = ScanNum.nextInt();
            if (OTP ==0)
                System.exit(0);
            }
        System.out.println("- Phone Number Successfully Verified.....");
        System.out.println("- Continue your registration process.....");
        Thread.sleep(3000);
        System.out.println("- Enter your username");
        String username = ScanText.nextLine();
        System.out.println("- Enter your password, must be 8 characters at least...");
        String password = ScanText.nextLine();
        while(!isPasswordComplex(password)){
            System.out.println("- Password is not complex... try again, or press 0 to exit");
            password = ScanText.nextLine();
            if (password.equalsIgnoreCase("0"))
                System.exit(0);
        }
        int rn = generateRandomNumber(1000, 3000);
        BankUsers.put(username, new String[]{fName, lName, phNum, id, password, "Bank", String.valueOf(rn)});
        System.out.println("- Account successfully created!");
    }

    public static boolean isPasswordComplex(String password) {
        if (password.length() < 8) {
            return false;
        }
        return true;
    }

    public static int generateRandomNumber(int min, int max) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number within the specified range [min, max]
        // The formula used ensures that the result is in the range [min, max]
        return random.nextInt((max - min) + 1) + min;
    }


        @Override
    public void TransferToWallet() {

    }


    @Override
    public void LoadProfile() {

    }

    @Override
    public float InquireBalance() {
        return 0;
    }
}
