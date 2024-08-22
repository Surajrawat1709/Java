package java8.lambda;

@FunctionalInterface
public interface Bird {
    void canFly(String str);

    default void getHeight(){
        System.out.println("No need of the height");
    }

    static void canSwim(){
        System.out.println("Yea can swim hahahhahaah");
    }

    String toString();
}
