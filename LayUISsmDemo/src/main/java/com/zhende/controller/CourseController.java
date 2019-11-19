package com.zhende.controller;

import com.zhende.domain.Course;
import com.zhende.mapper.CourseMapper;
import com.zhende.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CourseController
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/11/18 19:47
 * @Version 1.0
 **/

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/findAll")
    public List<Course> findAll(){

       return courseService.findAll();

    }

}
