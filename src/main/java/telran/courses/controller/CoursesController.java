package telran.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import telran.courses.api.dto.Course;
import telran.courses.service.CoursesService;

import static telran.courses.api.ApiConstants.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping(COURSES_MAPPING)
public class CoursesController {
	@Autowired
private CoursesService coursesService;
	@PostMapping
	 Course addCourse(@RequestBody @Valid Course course) {
		return coursesService.addCourse(course);
	}
	@GetMapping
	List<Course> getCourses() {
		return coursesService.getAllCourses();
	}
	@GetMapping("/{id}")
	ResponseEntity<?> getCourse(@PathVariable(name = "id") int id) {
		Course course = coursesService.getCourse(id);
		return course == null ? ResponseEntity.status(HttpStatus.NOT_FOUND).body(String.format("corse with id: %d not found",
				id)) : ResponseEntity.ok(course);
	}
	
	
	
	
	
	
}
