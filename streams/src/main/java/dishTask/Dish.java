package dishTask;

import java.util.Arrays;
import java.util.List;

public class Dish {


    public static List<DishData> getAll(){
        return Arrays.asList(
                new DishData("beef",false,700,Type.MEAT),
                new DishData("chicken",false,400,Type.MEAT),
                new DishData("french fries",true,530,Type.OTHER),
                new DishData("rice",true,350,Type.OTHER),
                new DishData("season fruit",true,120,Type.OTHER),
                new DishData("shrimp",false,300,Type.FISH),
                new DishData("salmon",false,450,Type.FISH)
        );
    }
}

