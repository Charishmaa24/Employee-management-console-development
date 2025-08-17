import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n=== Cognizant Employee Manager ===");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String dept = scanner.nextLine();
                    manager.addEmployee(name, dept);
                    break;
                case 2:
                    manager.listEmployees();
                    break;
                case 3:
                    System.out.print("Enter employee ID: ");
                    int updId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String updName = scanner.nextLine();
                    System.out.print("Enter new department: ");
                    String updDept = scanner.nextLine();
                    manager.updateEmployee(updId, updName, updDept);
                    break;
                case 4:
                    System.out.print("Enter employee ID: ");
                    int remId = scanner.nextInt();
                    manager.removeEmployee(remId);
                    break;
                case 5:
                    System.out.println("Exiting!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
