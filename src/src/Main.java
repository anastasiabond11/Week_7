public class Main {
    public static void main(String[] args) {
        Student student = new Student("Inna", "Bodenchuk", 19);
        Employee employee = new Employee("Anastasiia", "Bondarenko", 18);

        System.out.println(student.getInfo());
        System.out.println(employee.getInfo());
    }
}