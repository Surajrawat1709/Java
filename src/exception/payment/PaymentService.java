package exception.payment;

public class PaymentService {
    public void processPayment(int bal) throws InsufficientBalanceException{
        if(bal<=0){
            throw new InsufficientBalanceException("Balance is low");
        }
        int tax=bal*5;
        System.out.println("Your tax is "+tax);
    }
}
