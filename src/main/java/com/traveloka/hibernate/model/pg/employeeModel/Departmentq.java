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
@XmlRootElement(name = "department")
@XmlAccessorType(XmlAccessType.FIELD)
public class Departmentq {

    @XmlElement(name = "id")
    private Integer id;
    @XmlElement(name = "name")
    private String name;
}
