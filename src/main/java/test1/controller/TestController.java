package test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import test1.dao.StudentDAO;
import test1.model.Student;

import java.util.List;

/**
 * created by ewang on 2017/12/4.
 */
@Controller
@RequestMapping("/student")
public class TestController {

    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getStudentList() {
        List<Student> list = studentDAO.findAll();
        return new ModelAndView("/student").addObject("list", list);
    }

    public ModelAndView edit() {
        return new ModelAndView("");
    }
}
