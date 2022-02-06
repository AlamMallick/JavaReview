package transactionTask;

import java.util.Comparator;
import java.util.Optional;

public class TransactionTest {
    public static void main(String[] args) {


        //Find all transactions in the year 2011 and sort them by value(small to high)
TransactionData.getAll().stream()
        .filter(i->i.getYear()==2011)
        .sorted(Comparator.comparing(Transaction::getValue))
        .forEach(System.out::println);



        //2- What are all the unique cities where the traders work?
        TransactionData.getAll().stream()
                .map(i->i.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
        System.out.println("-------------------------------------");


        //3- Find all traders from Cambridge and sort them by name

        TransactionData.getAll().stream()
                .filter(i->i.getTrader().getCity().equals("Cambridge"))
                .map(i->i.getTrader())
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("-------------------------------------");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("-------------------------------------");

        //4- Return a string of all trader's names sorted alphabetically
       String result= TransactionData.getAll().stream()
                .map(i->i.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(a,b)->a+b+" ");
        System.out.println(result);




        System.out.println("-------------------------------------");
        //5- Are any traders based in Milan?
        System.out.println(TransactionData.getAll().stream()
                // .filter(i->i.getTrader().getCity().equals("Milan"))
                .anyMatch(i -> i.getTrader().getCity().equals("Milan")));



        //6- Print the values of all transactions from the traders living in Cambridge
        System.out.println("-------------------------------------");
        TransactionData.getAll().stream()
                .filter(i->i.getTrader().getCity().equals("Cambridge"))
                .map(i->i.getValue())
                .forEach(System.out::println);




        //7 - What is the highest value of all the transactions
        System.out.println("-------------------------------------");
        Optional<Integer> z=TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                ;

        System.out.println(z.get());

        //8-Find the transaction with the smallest value
        System.out.println("-------------------------------------");
        Optional<Integer> low=TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println(low.get());

        Optional<Transaction> low1=TransactionData.getAll().stream()
               // .map(Transaction::getValue)
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(low1.get());





    }



}
