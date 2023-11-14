public class UserAuth {
    User user;
    private static UserAuth instance;


    // create a map of users
    private UserAuth() {
        String[] newUser = BankAccountUser.BankUsers.get(user.Username);
        user.FirstName = newUser[0];
        user.LastName = newUser[1];
        user.PhoneNumber = newUser[2];
        user.Password = newUser[4];
        user.AccountType = newUser[5];
        user.Balance = Float.parseFloat(newUser[6]);
    }


    public static UserAuth getInstance() {

        if (instance == null) {
            instance = new UserAuth();
        }
        return instance;
    }


    void SignIn(String username, String pass) {
        user.Username = username;
        user.Password = pass;

    }
}
