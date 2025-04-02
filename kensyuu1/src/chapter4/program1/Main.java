package chapter4.program1;

public class Main {
    public static void main(String[] args) {
        DE company = new DE();
        
        company.createEmployee("田中", "人事", "");
        company.createEmployee("佐藤", "営業", "");
        company.createEmployee("高橋", "エンジニア", "Java");
        
        company.showEmployees();
    }
}
