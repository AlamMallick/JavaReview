package employes;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

//Print all Emails  (one to one)
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);


        //Print all Phone Number
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        EmployeeData.readAll()
                .flatMap(i->i.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);



    }}