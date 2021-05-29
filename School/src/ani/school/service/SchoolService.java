package ani.school.service;



import java.util.List;

import ani.school.dao.SchoolDao;
import ani.school.model.Student;
import ani.school.model.Teacher;

public class SchoolService {

	
	SchoolDao dao=new SchoolDao();
	
	
	public String registerStudent(String name,int rollNumber,String className) {
		
		Student s=new Student();
		s.setStandard(className);
		s.setName(name);
		s.setRollNumber(rollNumber);
		
		String msg=dao.registerStudentDao(s);
		return msg;
		
	}
	
	public void showAllStudent() {
		
		List<Student> studentList=dao.getAllStudentFromDB();
		
		System.out.println("xxxxxxxxxxxxxStudentxxxxxxxxxxxxx");
		System.out.println("Name\tRollNumber\tClass");
		if(studentList.size()>0) {
		for(Student s:studentList) {
			System.out.println(s.getName()+"\t"+s.getRollNumber()+"\t\t"+s.getStandard());
		}
		}
		else {
			System.err.println("No student in Data base");
		}
		
	}
public void showAllTecher() {
		
		List<Teacher> techList=dao.getAllTeacherFromDB();
		
		System.out.println("xxxxxxxxxxxxxxxTeachersxxxxxxxxxxxxx");
		System.out.println("Name\tExperience\tSalary");
		if(techList.size()>0) {
		for(Teacher t:techList) {
			System.out.println(t.getName()+"\t"+t.getExperience()+"\t\t"+t.getSalary());
		}
		}
		else {
			System.err.println("No teache in Data base");
		}
		
	}
public String registerTeacher(String name,int experience,int salary) {
	
	Teacher teach=new Teacher();
	teach.setExperience(experience);
	teach.setName(name);
	teach.setSalary(salary);
	
	String msg=dao.registerTeacherDao(teach);
	return msg;
	
}
}
