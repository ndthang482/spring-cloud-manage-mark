package savvycom.course.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import savvycom.course.repository.Course;
import savvycom.course.service.CourseService;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseService service;

    @GetMapping("course")
    public String listCourse(Model model){
        List<Course> listCourse = service.lissAll();
        model.addAttribute("listCourse",listCourse);
        return "course";
    }

}
