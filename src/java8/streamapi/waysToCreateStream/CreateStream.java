package java8.streamapi.waysToCreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //From collection
        List<Integer> list1= Arrays.asList(100,200,300,400);
        Stream<Integer> streamOfList= list1.stream();
        System.out.println(streamOfList);

        //From Array
        Integer[] array=new Integer[]{10,20,30,40};
        Stream<Integer> streamOfArray= Arrays.stream(array);
        System.out.println(streamOfArray);

        //From static method
        Stream<Integer> streamOfStaticMethod=Stream.of(10,20,30,40);

        //From Stream Builder
        Stream.Builder<Integer> streamBuilder=Stream.builder();
        streamBuilder.add(100).add(200).add(300).build();

        //From stream iterate
        Stream<Integer> streamIterate=Stream.iterate(10,(Integer val)->val+50).limit(5);
    }
}
