package com.oracle.employee.learning.entity;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "EMP_ID")
    private Long empId;
    
    @Column(name = "EMP_NAME")
    private String empName;
    
    @Column(name = "EMP_PROJECT")
    private String empProject;
    
    @Column(name = "EMP_DEPT")
    private String empDept;
    
    @Column(name = "EMP_SAL")
    private Double empSal;
    
    @Column(name = "EMP_EXP")
    private Integer empExp;
    
    @Column(name = "EMP_SKILL")
    private String empSkill;

    public Long getEmpId() { return empId; }
    public void setEmpId(Long empId) { this.empId = empId; }
    
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
    
    public String getEmpProject() { return empProject; }
    public void setEmpProject(String empProject) { this.empProject = empProject; }
    
    public String getEmpDept() { return empDept; }
    public void setEmpDept(String empDept) { this.empDept = empDept; }
    
    public Double getEmpSal() { return empSal; }
    public void setEmpSal(Double empSal) { this.empSal = empSal; }
    
    public Integer getEmpExp() { return empExp; }
    public void setEmpExp(Integer empExp) { this.empExp = empExp; }
    
    public String getEmpSkill() { return empSkill; }
    public void setEmpSkill(String empSkill) { this.empSkill = empSkill; }
}
