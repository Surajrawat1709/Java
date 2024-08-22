package java8.lambda;

import java8.lambda.typesOfFI.Consumer;
import java8.lambda.typesOfFI.Predicate;
import java8.lambda.typesOfFI.Supplier;

import java.lang.constant.Constable;
import java.util.function.Function;

public class LearnLambda {
    public static void main(String[] args) {

        //Lambda expression
        Bird bird=(String val)->{
            System.out.println("Can't fly "+val);
        };

bird.canFly("Ostrich");

        //Consumer interface
        Consumer<Integer> consumer=(Integer val)->{
            if(val>10)
            System.out.println("Consumer is "+val);

            else
                System.out.println("Sorry");
        };

        consumer.accept(12);

        //Supplier
        Supplier<String> supplier=()-> "Yes it is  a supplier";

        Supplier<String> supplier1=()->{
            return "This is a supplier pro max";
        };

        System.out.println(supplier1.get());
        System.out.println(supplier.get());

        //Predicate
        Predicate<Integer> predicate=(Integer val)->{
            if(val%2==0)
                return true;
            else
                return false;
        };

        System.out.println(predicate.get(5));

        //Function
        Function<Integer,String> function=(Integer val)->{
           String op=val.toString();
           return "Value is "+op;
        };

        System.out.println(function.apply(4));

        //Simple
        Bird bird2 = new Eagle();

        bird2.canFly(" Eagle");

        //Anonymous class
        Bird bird1 = new Eagle(){
            @Override
            public void canFly(String str) {
                System.out.println("Anonymous class "+str);
            }
        };

        bird1.canFly("Suraj");
    }


}
