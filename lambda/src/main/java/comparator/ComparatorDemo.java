package comparator;

import task.Color;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,30);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        // Descending order
        Collections.sort(list,new MyComparator());
        System.out.println(list+"'");


        //ascending order
        Collections.sort(list,((o1, o2) -> (o1>o2)?-1:0));
        // reduce to this line

        Collections.sort(list,((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);

        Collections.sort(list,((o1, o2) -> o2.compareTo(o1)));
        System.out.println(list);

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));


        Comparator<Apple> sortApp= comparing((apple)->apple.getWeight());
        inventory.sort(sortApp);
        System.out.println(inventory);

        inventory.sort(comparing((apple)->apple.getWeight() ));

        inventory.sort(comparing(Apple::getWeight));

        //reverse
        inventory.sort(comparing(Apple::getWeight).reversed());








    }
}
