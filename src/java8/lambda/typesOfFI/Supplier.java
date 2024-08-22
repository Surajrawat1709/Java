package java8.lambda.typesOfFI;

@FunctionalInterface
public interface Supplier<T> {

    T get();
}
