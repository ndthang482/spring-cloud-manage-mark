package savvycom.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import savvycom.course.repository.Course;
import savvycom.course.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repo;

    public List<Course> lissAll(){
        return (List<Course>) repo.findAll();
    }
}
