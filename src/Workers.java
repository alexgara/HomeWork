public class Workers {

    private String surname;
    private String name;
    private String middleName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Workers() {
    }

    public Workers(String surname, String name, String middleName, String position, String email, String phoneNumber, int salary, int age){
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("ФИО: " + surname + " " + name + " " + middleName + "\nВозраст: " + age + "\nДолжность: " + position + "\nОклад в месяц: " + salary + " рублей\nКонтактный телефон: " + phoneNumber + "\ne-mail: " + email + "\n");
    }
    public int allAge() {
        return age;
    }
}
