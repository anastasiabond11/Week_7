public class Main {
    public static void main(String[] args) {
        Student student = new Student("S123", "Anastasiia", "Bondarenko", 18);
        Employee employee = new Employee("Inna", "Bodenchuk", 30);

        System.out.println(student.getInfo());

        System.out.println(employee.getInfo());

    }
}