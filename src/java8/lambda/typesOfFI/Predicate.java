package java8.lambda.typesOfFI;

@FunctionalInterface
public interface Predicate<T> {

    boolean get(T t);
}
