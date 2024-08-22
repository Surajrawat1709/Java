package java8.lambda;

public class Eagle implements Bird{
    @Override
    public void canFly(String str) {
        System.out.println("Yes it can fly"+str);
    }
}
