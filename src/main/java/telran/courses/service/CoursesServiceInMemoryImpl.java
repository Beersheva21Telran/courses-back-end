package telran.courses.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import telran.courses.api.dto.Course;

public class CoursesServiceInMemoryImpl implements CoursesService, Serializable {

	private static final long serialVersionUID = 1L;
private HashMap<Integer, Course> courses = new HashMap<>();
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course removeCourse(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Course updateCourse(int id, Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourse(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void restore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

}
