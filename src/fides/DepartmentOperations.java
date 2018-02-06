package fides;

import java.util.*;


public class DepartmentOperations{
    public static List<Department> mergeDepartments(Department[]... departments){
        Map<String,Double> deptNameAmountPair = new HashMap<>();
        List<Department> mergedDepartments = new ArrayList<>();

        if(departments!= null){
            for (Department[] departmentList :
                    departments) {
                if(departmentList == null){
                    continue;
                }
               for(Department department: departmentList){
                   if(!deptNameAmountPair.containsKey(department.getName())){
                       deptNameAmountPair.put(department.getName(), department.getAmount());
                   }else{
                       deptNameAmountPair.replace(department.getName(),
                               deptNameAmountPair.get(department.getName())+department.getAmount());
                   }
               }
            }
        }
        for (Map.Entry<String,Double> nameAmountPair:
                deptNameAmountPair.entrySet()) {
                Department department = new Department(nameAmountPair.getKey(),nameAmountPair.getValue());
            mergedDepartments.add(department);
        }
        return mergedDepartments;
    }
}

