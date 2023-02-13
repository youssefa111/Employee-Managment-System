package net.javaguides.springbootthymeleafcrudwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springbootthymeleafcrudwebapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
