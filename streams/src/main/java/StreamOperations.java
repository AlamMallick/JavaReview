import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> myList= Arrays.asList(1,2,3,4,3,5,9,2,2,6);
        myList.forEach(System.out::println);


        System.out.println("''''''''''''DISTINCT'''''''''''''''");
        myList.stream()
                .filter(p->p%2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("''''''''''''LIMIT'''''''''''''''");
        myList.stream().filter(p->p%2==0).limit(2)
                        .forEach(System.out::println);


        System.out.println("''''''''''''SKIP'''''''''''''''");
        myList.stream().filter(p->p%2==0).skip(1)
                .forEach(System.out::println);


        System.out.println("''''''''''''MAP'''''''''''''''");
        myList.stream().filter(p->p%2==0).map(i->i+1)
                .forEach(System.out::println);


    }
}
