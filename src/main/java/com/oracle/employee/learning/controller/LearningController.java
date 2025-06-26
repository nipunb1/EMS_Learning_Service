package com.oracle.employee.learning.controller;

import com.oracle.employee.learning.dto.LearningHoursDto;
import com.oracle.employee.learning.entity.Employee;
import com.oracle.employee.learning.entity.EmployeeLearning;
import com.oracle.employee.learning.repository.EmployeeRepository;
import com.oracle.employee.learning.repository.EmployeeLearningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/learning")
@CrossOrigin(origins = "http://localhost:4200")
public class LearningController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeLearningRepository employeeLearningRepository;

    @GetMapping("/employees/{id}/hours")
    public List<LearningHoursDto> getEmployeeLearningHours(@PathVariable Long id) {
        List<EmployeeLearning> learnings = employeeLearningRepository.findByEmpId(id);
        Employee employee = employeeRepository.findById(id).orElse(null);
        
        List<LearningHoursDto> result = new ArrayList<>();
        for (EmployeeLearning learning : learnings) {
            result.add(new LearningHoursDto(
                learning.getEmpId(),
                employee != null ? employee.getEmpName() : "Unknown",
                learning.getTrainingName(),
                learning.getLearningHours(),
                learning.getTrainingCategory(),
                learning.getCompletionDate().toString(),
                employee != null ? employee.getEmpSkill() : "N/A"
            ));
        }
        return result;
    }

    @GetMapping("/training-summary")
    public List<LearningHoursDto> getAllTrainingSummary() {
        List<EmployeeLearning> learnings = employeeLearningRepository.findAll();
        List<Employee> employees = employeeRepository.findAll();
        Map<Long, String> empNames = new HashMap<>();
        Map<Long, String> empSkills = new HashMap<>();
        
        for (Employee emp : employees) {
            empNames.put(emp.getEmpId(), emp.getEmpName());
            empSkills.put(emp.getEmpId(), emp.getEmpSkill());
        }
        
        List<LearningHoursDto> result = new ArrayList<>();
        for (EmployeeLearning learning : learnings) {
            result.add(new LearningHoursDto(
                learning.getEmpId(),
                empNames.get(learning.getEmpId()),
                learning.getTrainingName(),
                learning.getLearningHours(),
                learning.getTrainingCategory(),
                learning.getCompletionDate().toString(),
                empSkills.get(learning.getEmpId())
            ));
        }
        return result;
    }

    @GetMapping("/categories")
    public Map<String, Object> getTrainingCategories() {
        List<Object[]> hoursByCategory = employeeLearningRepository.findHoursByCategory();
        List<Object[]> countByCategory = employeeLearningRepository.findTrainingCountByCategory();
        
        Map<String, Object> result = new HashMap<>();
        result.put("hoursByCategory", hoursByCategory);
        result.put("countByCategory", countByCategory);
        
        return result;
    }
}
