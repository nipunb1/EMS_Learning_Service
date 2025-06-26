package com.oracle.employee.learning.dto;

public class LearningHoursDto {
    private Long empId;
    private String empName;
    private String trainingName;
    private Double learningHours;
    private String trainingCategory;
    private String completionDate;
    private String empSkill;

    public LearningHoursDto() {}

    public LearningHoursDto(Long empId, String empName, String trainingName, Double learningHours, String trainingCategory, String completionDate, String empSkill) {
        this.empId = empId;
        this.empName = empName;
        this.trainingName = trainingName;
        this.learningHours = learningHours;
        this.trainingCategory = trainingCategory;
        this.completionDate = completionDate;
        this.empSkill = empSkill;
    }

    public Long getEmpId() { return empId; }
    public void setEmpId(Long empId) { this.empId = empId; }
    
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
    
    public String getTrainingName() { return trainingName; }
    public void setTrainingName(String trainingName) { this.trainingName = trainingName; }
    
    public Double getLearningHours() { return learningHours; }
    public void setLearningHours(Double learningHours) { this.learningHours = learningHours; }
    
    public String getTrainingCategory() { return trainingCategory; }
    public void setTrainingCategory(String trainingCategory) { this.trainingCategory = trainingCategory; }
    
    public String getCompletionDate() { return completionDate; }
    public void setCompletionDate(String completionDate) { this.completionDate = completionDate; }
    
    public String getEmpSkill() { return empSkill; }
    public void setEmpSkill(String empSkill) { this.empSkill = empSkill; }
}
