package com.test.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAverageSalaryApp {

	public void findAverageSalary(List<Employee> employees) {
		Map<String, Map<String, Double>> averageSalaries = employees.parallelStream().collect(Collectors.groupingBy(
				Employee::getOfficeLocation,
				Collectors.groupingBy(Employee::getDesignation, Collectors.averagingDouble(Employee::getSalary))));

		averageSalaries.forEach((officaLocation, resultMap) -> {
			resultMap.forEach((designation, salary) -> {
				System.out.println(officaLocation + " ---> " + designation + "--->" + salary);
			});
		});
	}
}
