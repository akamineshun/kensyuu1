package chapter4.program1;

import java.util.ArrayList;
import java.util.List;

//DEクラス
class DE {
 private String companyName = "BT/DE";
 private List<Employee> employees = new ArrayList<>();
 private List<String> departments = List.of("人事", "営業", "エンジニア");

 public void createEmployee(String name, String department, String language) {
     Employee employee;
     switch (department) {
         case "人事":
             employee = new HumanResource(name);
             break;
         case "営業":
             employee = new Sales(name);
             break;
         case "エンジニア":
             employee = new Engineer(name, language);
             break;
         default:
             throw new IllegalArgumentException("無効な部署です");
     }
     employees.add(employee);
 }

 public void showEmployees() {
     for (Employee e : employees) {
         e.displayInfo();
     }
 }
}
