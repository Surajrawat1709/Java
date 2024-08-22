package exception.payment;


import java.util.Scanner;

public class EcommerceApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PaymentService pc=new PaymentService();
        System.out.println("Enter the amount");
        int amt=sc.nextInt();

        try{
            pc.processPayment(amt);
        }catch(InsufficientBalanceException e){
            e.printStackTrace();

        }
    }
}
