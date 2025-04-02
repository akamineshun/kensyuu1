package chapter5.program1;

import java.util.Random;

class HumanResource extends Employee {
    private BT company;

    public HumanResource(String name, BT company) {
        super(name, "人事");
        this.company = company;
    }

    public void conductInterview(String candidateName, String department, String language) {
        String result = new Random().nextBoolean() ? "採用" : "不採用";
        System.out.println("面接を行い、結果は " + result + " だった");
        
        Employee employee;
        if ("採用".equals(result)) {
            if (department.equals("エンジニア")) {
                employee = new Engineer(candidateName, language);
            } else if (department.equals("営業")) {
            	employee = new Sales(candidateName);
            } else {
            	employee = new HumanResource(candidateName, company);
            }
        	company.addEmployee(employee);
        }
    }

    public void calculateSalary() {
        System.out.println("給与計算を行なった");
    }

    @Override
    public void displayInfo() {
        System.out.println(name + "：" + department);
    }
}
