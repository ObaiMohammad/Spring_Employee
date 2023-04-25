package com.unipd.uni;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 declare an interface which extends Spring Data JPA’s JpaRepository,
 specifying the domain type as Employee and the id type as Long.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
