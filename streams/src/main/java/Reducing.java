import dishTask.Dish;
import dishTask.DishData;

import java.util.Arrays;
import java.util.List;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
       int result= numbers.stream()
                .reduce(0, Integer::sum);


        System.out.println(result);


        System.out.println(Dish.getAll().stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b));


    }
}
