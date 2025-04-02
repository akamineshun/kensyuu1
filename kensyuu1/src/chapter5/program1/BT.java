package chapter5.program1;

import java.util.ArrayList;
import java.util.List;

class BT {
    private String companyName = "BT/DE";
    private List<Employee> employees = new ArrayList<>();
    private List<String> departments = List.of("人事", "営業", "エンジニア");

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee e : employees) {
            e.displayInfo();
        }
    }
}
