package exception;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(int age){
        super();
        System.out.println("below 18");
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=sc.nextInt();
try{
    validate(age);
}
catch(InvalidAgeException ex){

    System.out.println("Exception occured "+ex);
        }
        System.out.println("Bye");
    }
    public static void validate (int age) throws InvalidAgeException{

        if(age<18){
            throw new InvalidAgeException(age);
        }
        else{
            System.out.println("You can vote");
        }
    }
}
