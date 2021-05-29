package ani.scholl.utility;

import java.util.ArrayList;
import java.util.List;

import ani.school.model.Student;
import ani.school.model.Teacher;

public class MySql {
private List<Student> studentList=new ArrayList<Student>();
private List<Teacher> teacherList=new ArrayList<Teacher>();

     public String registerNewStudnet(Student student) {
    	 
    	 
	             studentList.add(student);
	             
	             
	             return "Student Register";
			}
     public List<Student> getAllStudnet(){
    	 
    	 
    	 return studentList;
    	 
    	 
     }
     
     public String registerNewTeacher(Teacher tech) {
    	 
    	 
    	 teacherList.add(tech);
         
         
         return "Teacher Register";
	}
public List<Teacher> getAllTeacher(){
 
 
 return teacherList;
 
 
}

}
