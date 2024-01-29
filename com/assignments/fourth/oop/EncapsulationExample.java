package oop;

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // setting values through object
        employee.setEmployeeNo(121);
        employee.setEmployeeName("Assam");
        // getting values through employee object using getters
        System.out.println("Employee No- " + employee.getEmployeeNo());
        System.out.println("Employee Name- " + employee.getEmployeeName());
    }
}

class Employee {
    // private fields
    private int employeeNo;
    private String employeeName;

    // by default there is a default constructor with empty parameters even if we
    // explicity don't specify
    // public Employee() {
    // }

    // Setters and getters through which we can set and get the values of data
    // members

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
