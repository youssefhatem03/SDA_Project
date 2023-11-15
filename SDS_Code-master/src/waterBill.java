public class waterBill implements Bill{
    @Override
    public void payBillMethod(float amount)
    {
        UserAuth.Balance = UserAuth.Balance - amount;
        System.out.println("Water bill paid successfully. Amount: " + amount + ",and your Balance now i : "+UserAuth.Balance);

    }
}
