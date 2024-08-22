package java8.lambda.typesOfFI;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}
