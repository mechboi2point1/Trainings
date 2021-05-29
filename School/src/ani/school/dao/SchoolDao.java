package ani.school.dao;

import java.util.List;

import ani.scholl.utility.MySql;
import ani.school.model.Student;
import ani.school.model.Teacher;

public class SchoolDao {

	
	MySql sql=new MySql();
	
	public String registerStudentDao(Student s) {
		
		String msg=sql.registerNewStudnet(s);
		return msg;
	}
	
	public List<Student> getAllStudentFromDB(){
		
		return sql.getAllStudnet();
	}
public String registerTeacherDao(Teacher t) {
		
		String msg=sql.registerNewTeacher(t);
		return msg;
	}
	
	public List<Teacher> getAllTeacherFromDB(){
		
		return sql.getAllTeacher();
	}
}
