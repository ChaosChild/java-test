import java.io.IOException;

public class JavaTest {
    public static void main(String[] args) {
        Department[] firstDept = SomeData.GetFirstSet();
        Department[] secondDept = SomeData.GetSecondList();
        Department[] thirdDept = SomeData.GetThirdList();

        // TODO: 1. Merge the lists together, summing up the amounts for departments with the same name.
        // TODO: 2. Sort the result list by Department.name in _DESCENDING_ order.
        // TODO: 3. Output the results into a text file in CSV, comma delimitted format.
        // TODO: 4. Read in the text file from TODO #3 and output the results to console in _ASCENDING_ order by amount.

        System.out.println("First List: " + firstDept.length);
        System.out.println("Second List: " + secondDept.length);
        System.out.println("Third List: " + thirdDept.length);
    }
}
