package dishTask;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DishData {
    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;


}
