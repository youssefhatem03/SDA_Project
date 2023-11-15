import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class BankAccountUser extends User{


    @Override
    public void SignUp() throws InterruptedException {
        BankAccountUserFactory b1 = new BankAccountUserFactory();
        b1.CreateUser();
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
