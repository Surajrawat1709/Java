package java8.streamapi.operations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> salaryOfEmployees= Arrays.asList(2000,3333,2232,3233,3233);

        // 1) Filter Operation
        Stream<Integer> streamOfSalary= salaryOfEmployees.stream().filter(e->e>=2500);
        List<Integer> listOfEmp= streamOfSalary.collect(Collectors.toList());
       // salaryOfEmployees.stream().filter(e->e>=2500).forEach(System.out::println);
        //System.out.println(listOfEmp);

        // 2) Map Operation
        Stream<Integer> squareOfList= salaryOfEmployees.stream().map((Integer e)-> (int) Math.pow(e,4));
        List<Integer> listOfDouble=squareOfList.collect(Collectors.toList());
        //System.out.println(listOfDouble);

        List<List<Integer>>  listOfTax= Arrays.asList(
        Arrays.asList(23,323,3232,323),
        Arrays.asList(34,32,44,342,23),
        Arrays.asList(5345,653,434,4234)
        );

        Stream<Integer> streamOfTaxes= listOfTax.stream().flatMap(e->e.stream());
        List<Integer> listTax=streamOfTaxes.collect(Collectors.toList());
       // System.out.println(listTax);

       // listOfTax.stream().flatMap(Collection::stream).map(e->e*e).forEach(System.out::println);

// 4) Distinct()
        Integer[] array={1,2,3,4,5,6,1,1,4,5,6};
        List<Integer> listArr=Arrays.asList(1,2,3,4,5,6,1,1,4,5,6);
        List<Integer> listAr=Arrays.stream(array).distinct().collect(Collectors.toList());
        System.out.println(listAr);
        List<Integer> lista=listArr.stream().distinct().collect(Collectors.toList());
        System.out.println(lista);


    }
}
