package com.zhende.service.impl;

import com.zhende.domain.Course;
import com.zhende.mapper.CourseMapper;
import com.zhende.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseServiceImpl
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/11/18 20:25
 * @Version 1.0
 **/
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    public List<Course> findAll() {
        return courseMapper.findAllCourse();
    }


}
