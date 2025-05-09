package chapter4.program1;

abstract class Employee {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println(name + "：" + department);
    }
}
