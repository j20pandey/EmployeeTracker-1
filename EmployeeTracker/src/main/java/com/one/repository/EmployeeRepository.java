package com.one.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

import com.one.model.Department;
import com.one.model.Employee;

//public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
//we changed to JPA REPO because it will give additional functions like pagination, JSON etc

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByempName(String empName);
	
	List<Employee> findByidGreaterThan(int id);
	
	//@Query("from Employee where empDept =?1 order by id")
	//List<Employee> findBydeptSorted(String empDept);
	
	@Query("from Employee where empDept =?1 order by id")
	List<Employee> findByjoinDept(String empDept);	
	
//	@Query("from Department  order by did")
//	List<Department> findBydeptAll(List<Department> department);
//	

	

}
