package com.traveloka.hibernate.model.pg.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
  @Id
  Long id;
  String name;
}
