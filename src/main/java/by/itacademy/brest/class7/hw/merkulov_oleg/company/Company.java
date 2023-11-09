package by.itacademy.brest.class7.hw.merkulov_oleg.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Department> departments;

    public Company() {
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void listDepartments() {
        for (Department department : departments) {
            department.listEmployees();
        }
    }
}
