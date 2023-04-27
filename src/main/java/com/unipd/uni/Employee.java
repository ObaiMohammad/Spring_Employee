package com.unipd.uni;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity is a JPA annotation to make this object ready for storage in a JPA-based data store.

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    //id, name, and role are attributes of our Employee domain object.
    // id is marked with more JPA annotations to indicate it’s the primary key and automatically populated by the JPA provider.

    @Id
    @GeneratedValue
    private Long id ;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_address")
    private String emailId;
}
