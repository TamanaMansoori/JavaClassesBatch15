package Class21Overriding;

public class EmployeeTester {

    public static void main(String[] args) {

        Manager manager=new Manager();
        manager.printSalary();

        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.printSalary();




    }
}
