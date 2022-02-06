package dishTask;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        //AllMatch
      boolean isHealthy=  Dish.getAll().stream()
                .allMatch(p->p.getCalories()<1000);

        System.out.println(isHealthy);

//ANY Match
        if(Dish.getAll().stream().anyMatch(DishData::isVegetarian)){
            System.out.println("the menu is so healthy");
        }
//noneMatch
        boolean isHealthy1=  Dish.getAll().stream()
                .noneMatch(p->p.getCalories()>1000);

        System.out.println(isHealthy1);

 //FindAny
     Optional<DishData> isHealthy2=  Dish.getAll().stream()
                     .filter(p->p.isVegetarian())
                             .findAny();

        System.out.println(isHealthy2.get() );




    }


}
