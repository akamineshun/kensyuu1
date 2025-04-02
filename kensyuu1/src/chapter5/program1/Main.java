package chapter5.program1;

public class Main {
    public static void main(String[] args) {
        BT company = new BT();
        HumanResource tanaka = new HumanResource("田中", company);        
        Sales sato = new Sales("佐藤");
        Engineer suzuki = new Engineer("鈴木", "Java");
        
        tanaka.displayInfo();
        sato.displayInfo();
        suzuki.displayInfo();

        company.addEmployee(tanaka);
        company.addEmployee(sato);
        
        tanaka.conductInterview("鈴木", "エンジニア", "Java");
        tanaka.calculateSalary();
        sato.replyWeeklyReport();
        sato.scheduleMeeting(suzuki);
        suzuki.develop();
        
    }
}
