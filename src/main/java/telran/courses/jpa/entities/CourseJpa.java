package telran.courses.jpa.entities;
import java.time.LocalDate;

import javax.persistence.*;

import telran.courses.api.dto.Course;
import telran.courses.api.dto.CourseType;
@Entity
@Table(name="courses")
public class CourseJpa {
@Id
@GeneratedValue
int id;
public String courseName;
public String lecturerName;
public int hoursNum;
public int cost;
public LocalDate startDate;
@Enumerated(EnumType.STRING)
public CourseType type;

String [] dayEvening;
static public CourseJpa build(Course course) {
	CourseJpa res = new CourseJpa();
	fillCourseJpa(course, res);
	return res;
}
public static void fillCourseJpa(Course course, CourseJpa res) {
	res.courseName = course.courseName;
	res.cost = course.cost;
	res.dayEvening = course.dayEvening;
	res.hoursNum = course.hoursNum;
	res.lecturerName = course.lecturerName;
	res.startDate = LocalDate.parse(course.startDate);
	res.type = course.type;
}
public Course getCourseDto() {
	Course res = new Course();
	res.cost = cost;
	res.hoursNum = hoursNum;
	res.lecturerName = lecturerName;
	res.dayEvening = dayEvening;
	res.type = type;
	res.courseName = courseName;
	res.startDate = startDate.toString();
	res.id = id;
	return res;
}
}
