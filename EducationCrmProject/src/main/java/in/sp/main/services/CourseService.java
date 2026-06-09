package in.sp.main.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.sp.main.entities.Course;
import in.sp.main.repositories.CourseRepository;

@Service
public class CourseService 
{

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourseDetails()
	{
		return courseRepository.findAll();
	}
	
	//Pageable is used to specify pagination information i.e. page number, page size, sorting order etc when querying with database
	//Page represents the chunk of data that is fetched according to pagination parameters defined by Pagable.
	public Page<Course> getAllCourseDetailsByPagination(Pageable pageable)
	{
		return courseRepository.findAll(pageable);
	}

	public Course getCourseDetails(String courseName)
	{
		return courseRepository.findByName(courseName);
	}
	
	public void updateCourseDetails(Course course)
	{
		courseRepository.save(course);
	}
	
	public void deleteCourseDetails(String courseName)
	{
		Course course = courseRepository.findByName(courseName);
		if(course != null)
		{
			courseRepository.delete(course);
		}
		else
		{
			throw new RuntimeException("Course not found with name : "+courseName);
		}
	}

	
	public List<String> getAllCourseNames()
	{
		return courseRepository.findAll().stream()
				.map(Course::getName)
				.collect(Collectors.toList());
	}
}
