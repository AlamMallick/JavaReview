package dishTask;

import java.util.Comparator;

public class Dish_Task {
    public static void main(String[] args) {

        Dish.getAll().stream().filter(p->p.getCalories()<400).map(DishData::getName).forEach(System.out::println);

        //Print the length of name of each dish
        System.out.println("---------------------------------------------------------");
        Dish.getAll().stream().map(i->i.getName().length()).forEach(System.out::println);

        Dish.getAll().stream()
                .map((DishData::getName))
                .map(String::length)
                .forEach(System.out::println);



        System.out.println("---------------------------------------------------------");
//print the 3 high calorie Dish name(>300)
        Dish.getAll().stream()
                .filter(i->i.getCalories()>300)
                .map(DishData::getName)
                .limit(3)
                .forEach(System.out::println);



        System.out.println("---------------------------------------------------------");
 //print all dish name that are below 400 calorie in sorted
 Dish.getAll().stream()
         .filter(p->p.getCalories()<400)
         .sorted(Comparator.comparing(DishData::getCalories).reversed())
         .map(DishData::getName)
         .forEach(System.out::println);





    }

}
