package com.zhende.mapper;

import com.zhende.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName CourseMapper
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/11/18 19:25
 * @Version 1.0
 **/

public interface CourseMapper {

    List<Course> findAllCourse();

    List<Course> findAllTeacherInCourse();
}
