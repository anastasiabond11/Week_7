public class Main {
    public static void main(String[] args) {
        Student student = new Student("S123", "Anastasiia", "Bondarenko", 18);
        Employee employee = new Employee("E456", "Inna", "Bodenchuk", 19);

        System.out.println(student.getInfo());
        System.out.println("Years until retirement: " + student.getYearsUntilRetirement());

        System.out.println(employee.getInfo());
        System.out.println("Years until retirement: " + employee.getYearsUntilRetirement());
    }
}