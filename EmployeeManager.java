import java.util.*;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();
    private int nextId = 1;

    public void addEmployee(String name, String dept) {
        Employee emp = new Employee(nextId++, name, dept);
        employees.add(emp);
        System.out.println("Employee added: " + emp);
    }

    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public void updateEmployee(int id, String name, String dept) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(name);
                emp.setDepartment(dept);
                System.out.println("Employee updated: " + emp);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void removeEmployee(int id) {
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getId() == id) {
                it.remove();
                System.out.println("Employee removed.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
