package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.EmployeeSkills;

public interface EmployeeSkillsRepo extends JpaRepository<EmployeeSkills, Integer> {

	List<EmployeeSkills>findBySkillName(String skillName);
	List<EmployeeSkills>findBySkillExperience(int skillExperience);
	
	@Query(nativeQuery = true,value="select * from emp_skills_2022 where skill_experience=:exp and skill_name=:name")
	List<EmployeeSkills>findBySkillExpAndName(@Param("exp")int exp,@Param("name")String name);

	public List<EmployeeSkills>findByApprovedBy(String approve);
	public List<EmployeeSkills>findByStatus(String status);
}
