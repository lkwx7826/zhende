package com.zhende.service;

import com.zhende.domain.Course;

import java.util.List;

/**
 * @InterfaceName CourseService
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/11/18 20:24
 * @Version 1.0
 **/

public interface CourseService {
   List<Course> findAll();
}
