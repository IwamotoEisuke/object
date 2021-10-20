package basic.sample.equals;

public class EqualsSample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Tom");
        Employee employee2 = employee1;
        Employee employee3 = new Employee(2,"John");
        Employee employee4 = new Employee(1,"Tom");
        Employee2 employee21 = new Employee2(1,"Tom");

        //比較
        System.out.println("1 2:" + employee1.equals(employee2));
        System.out.println("1 3:" + employee1.equals(employee3));
        System.out.println("1 4:" + employee1.equals(employee4));
        System.out.println("1 21:" + employee1.equals(employee21));
    }
}
