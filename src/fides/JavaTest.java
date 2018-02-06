package fides;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;


public class JavaTest {
    public static void main(String[] args) {

        Department[] firstDept = SomeData.GetFirstSet();
        Department[] secondDept = SomeData.GetSecondList();
        Department[] thirdDept = SomeData.GetThirdList();

        // TODO: 1. Merge the lists together, summing up the amounts for departments with the same name.
        List<Department> allDepts = DepartmentOperations.
                mergeDepartments(SomeData.GetFirstSet(), SomeData.GetSecondList(), SomeData.GetThirdList());


        // TODO: 2. Sort the result list by Department.name in _DESCENDING_ order.
        List<Department> sortedByDepartmentNameList = allDepts.stream()
                .sorted((department1, department2) -> department2.getName().compareTo(department1.getName())).collect(Collectors.toList());


        // TODO: 3. Output the results into a text file in CSV, comma delimitted format.
        CSVOperations.createFile(sortedByDepartmentNameList);

        // TODO: 4. Read in the text file from TODO #3 and output the results to console in _ASCENDING_ order by amount.
        List<Department> departmentsSortedByAmount = CSVOperations.readFile();
        Collections.sort(departmentsSortedByAmount, new Comparator<Department>() {
            @Override
            public int compare(Department department1, Department department2) {
                return Double.compare(department1.getAmount(),department2.getAmount());
            }
        });
        DecimalFormat df = new DecimalFormat("#0.00");
        departmentsSortedByAmount.forEach(d->System.out.println("Name: " + d.getName() + " Value " + df.format(d.getAmount())));

        System.out.println("First List: " + firstDept.length);
        System.out.println("Second List: " + secondDept.length);
        System.out.println("Third List: " + thirdDept.length);

    }


}
