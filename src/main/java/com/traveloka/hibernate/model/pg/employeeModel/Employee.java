package com.traveloka.hibernate.model.pg.employeeModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    @XmlElement(name = "id")
    private Integer id;
    @XmlElement(name = "firstName")
    private String firstName;
    @XmlElement(name = "lastName")
    private String lastName;
    @XmlElement(name = "department")
    private Department department;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @XmlRootElement(name = "department")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Department {
        @XmlElement(name = "id")
        private Integer id;
        @XmlElement(name = "name")
        private String name;
    }

}
