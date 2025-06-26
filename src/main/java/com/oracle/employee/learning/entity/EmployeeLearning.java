package com.oracle.employee.learning.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "EMPLOYEE_LEARNING")
public class EmployeeLearning {
    @Id
    @Column(name = "LEARNING_ID")
    private Long learningId;
    
    @Column(name = "EMP_ID")
    private Long empId;
    
    @Column(name = "TRAINING_NAME")
    private String trainingName;
    
    @Column(name = "LEARNING_HOURS")
    private Double learningHours;
    
    @Column(name = "COMPLETION_DATE")
    private LocalDate completionDate;
    
    @Column(name = "TRAINING_CATEGORY")
    private String trainingCategory;

    public Long getLearningId() { return learningId; }
    public void setLearningId(Long learningId) { this.learningId = learningId; }
    
    public Long getEmpId() { return empId; }
    public void setEmpId(Long empId) { this.empId = empId; }
    
    public String getTrainingName() { return trainingName; }
    public void setTrainingName(String trainingName) { this.trainingName = trainingName; }
    
    public Double getLearningHours() { return learningHours; }
    public void setLearningHours(Double learningHours) { this.learningHours = learningHours; }
    
    public LocalDate getCompletionDate() { return completionDate; }
    public void setCompletionDate(LocalDate completionDate) { this.completionDate = completionDate; }
    
    public String getTrainingCategory() { return trainingCategory; }
    public void setTrainingCategory(String trainingCategory) { this.trainingCategory = trainingCategory; }
}
