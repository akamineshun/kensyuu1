package chapter5.program1;

class Engineer extends Employee {
    private String programmingLanguage;

    public Engineer(String name, String programmingLanguage) {
        super(name, "エンジニア");
        this.programmingLanguage = programmingLanguage;
    }

    public void develop() {
        System.out.println(programmingLanguage + " で開発を行なった");
    }

    @Override
    public void displayInfo() {
        System.out.println(name + "：" + department + " 使用言語：" + programmingLanguage);
    }
}
