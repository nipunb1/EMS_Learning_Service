package com.oracle.employee.learning.repository;

import com.oracle.employee.learning.entity.EmployeeLearning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeLearningRepository extends JpaRepository<EmployeeLearning, Long> {
    List<EmployeeLearning> findByEmpId(Long empId);
    
    @Query("SELECT el.trainingCategory, SUM(el.learningHours) FROM EmployeeLearning el GROUP BY el.trainingCategory")
    List<Object[]> findHoursByCategory();
    
    @Query("SELECT el.trainingCategory, COUNT(el) FROM EmployeeLearning el GROUP BY el.trainingCategory")
    List<Object[]> findTrainingCountByCategory();
}
