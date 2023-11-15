import java.util.Scanner;

public abstract class User {

   public abstract void SignUp() throws InterruptedException;

   public abstract void TransferToWallet();

    public abstract void LoadProfile();

    public abstract float InquireBalance();

    public void payWaterBill(float amount)
    {
        Bill wBill = new waterBill();
    };
    public void payGssBill(float amount)
    {
        Bill wBill = new GasBill();
    };
    public void payElectricityBill(float amount)
    {
        Bill wBill = new ElectricityBill();
    };

}