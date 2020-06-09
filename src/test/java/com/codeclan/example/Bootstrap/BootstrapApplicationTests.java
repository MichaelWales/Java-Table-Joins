package com.codeclan.example.Bootstrap;

import com.codeclan.example.Bootstrap.models.Department;
import com.codeclan.example.Bootstrap.models.Employee;
import com.codeclan.example.Bootstrap.models.Project;
import com.codeclan.example.Bootstrap.repositories.DepartmentRepository;
import com.codeclan.example.Bootstrap.repositories.EmployeeRepository;
import com.codeclan.example.Bootstrap.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootstrapApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void canCreateAndSaveADepartmentAndEmployee() {
		Department department = new Department("Murders & Executions(HR)");
		departmentRepository.save(department);
		Employee employee = new Employee("Michael Wales", 31, 192491, department);
		employeeRepository.save(employee);
	}

	@Test
	void canCreateAndAddEmployeesToProjects() {
		Department department = new Department("Murders & Executions(HR)");
		departmentRepository.save(department);

		Project project = new Project("Brexit", 2000000000);
		projectRepository.save(project);

		Employee employee = new Employee("Michael Wales", 31, 192491, department);
		employee.addProject(project);
		employeeRepository.save(employee);
	}
}
