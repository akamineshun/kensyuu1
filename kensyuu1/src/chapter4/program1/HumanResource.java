package chapter4.program1;

import java.util.Random;

class HumanResource extends Employee {
    public HumanResource(String name) {
        super(name, "人事");
    }

    public void conductInterview(DE de, String candidateName, String department, String language) {
        boolean isHired = new Random().nextBoolean();
        String result = isHired ? "採用" : "不採用";
        System.out.println("面接を行い、結果は" + result + "だった");
        if (isHired) {
            de.createEmployee(candidateName, department, language);
        }
    }

    public void calculateSalary() {
        System.out.println("給与計算を行なった");
    }
}
