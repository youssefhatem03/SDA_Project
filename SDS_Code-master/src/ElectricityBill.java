public class ElectricityBill implements Bill{
    @Override
    public void payBillMethod(float amount)
    {
        UserAuth.Balance = UserAuth.Balance - amount;
        System.out.println("electricity bill paid successfully. Amount: " + amount + ",and your Balance now i : "+UserAuth.Balance);

    }

}
