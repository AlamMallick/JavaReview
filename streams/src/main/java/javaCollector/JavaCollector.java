package javaCollector;

import dishTask.Dish;
import dishTask.DishData;
import dishTask.Type;


import java.util.*;
import java.util.stream.Collectors;

public class JavaCollector {
    public static void main(String[] args) {



        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier) : is used to create a collection using collector

List<Integer> toCollection=numbers.stream()
        .filter(i->i%2==0)
        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(toCollection);



        Set<Integer> toCollectionSet=numbers.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(toCollectionSet);



        //toList() : returns a Collector interface that gathers the input data into a new list
        System.out.println("********TOLIST()***********");
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());

        System.out.println(numberList2);

        //toSet() : returns a Collector interface that gathers the input data into a new set

        System.out.println("********TOSET()***********");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet());

        System.out.println(numberSet2);

        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        System.out.println("********TOMAP()***********");
        Map<String,Integer> dishMap = Dish.getAll().stream()
                .collect(Collectors.toMap(DishData::getName,DishData::getCalories));

        System.out.println(dishMap);

        //counting() : returns a Collector that counts the number of the elements
        System.out.println("********COUNTING()***********");
        Long evenCount = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a integer-valued func
        System.out.println("********SUMMINGINT()***********");
        Integer sum = Dish.getAll().stream()
                .collect(Collectors.summingInt(DishData::getCalories));

        System.out.println(sum);

        //averageingInt(ToIntFunction) : returns the average of the integers passed values
        Double calorieAvg =  Dish.getAll().stream()
                .collect(Collectors.averagingInt(DishData::getCalories));
        System.out.println(calorieAvg);

            //joining() : is used to join various elements of a character or string array into a single string object
            System.out.println("********JOINING()***********");
            List<String> courses = Arrays.asList("Java","JS","TS");
            String str =  courses.stream()
                    .collect(Collectors.joining(","));

            System.out.println(str);

            //partioningBy() : is used to partition a stream of objects(or set of elements) based on a given predicate
            System.out.println("********PARTIONINGBY()***********");
            Map<Boolean,List<DishData>> veggieDish = Dish.getAll().stream()
                    .collect(Collectors.partitioningBy(DishData::isVegetarian));

            System.out.println(veggieDish);

            //groupingBy() : is used for groping objects by some property and storing results in a map instance
            System.out.println("********GROUPINGBY()***********");
            Map<Type,List<DishData>> dishType = Dish.getAll().stream()
                    .collect(Collectors.groupingBy(DishData::getType));

            System.out.println(dishType);




    }
}
