package io.github.mohitdtumce.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "departments")
@Entity
@Data
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "department_id", insertable = false, nullable = false)
    private Integer departmentId;

    @Column(name = "department_name", nullable = false)
    private String departmentName;

    
}