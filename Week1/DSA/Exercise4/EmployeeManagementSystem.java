
public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size++] = employee;
        } else {
            System.out.println("Employee array is full. Cannot add more employees.");
        }
    }

    // Method to search an employee by employeeId
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    // Method to traverse all employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println("Employee ID: " + employees[i].getEmployeeId() +
                               ", Name: " + employees[i].getName() +
                               ", Position: " + employees[i].getPosition() +
                               ", Salary: " + employees[i].getSalary());
        }
    }

    // Method to delete an employee by employeeId
    public void deleteEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                // Shift elements to the left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
