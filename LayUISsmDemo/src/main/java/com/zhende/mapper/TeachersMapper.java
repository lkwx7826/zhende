package com.zhende.mapper;

import com.zhende.domain.Teachers;

import java.util.List;

/**
 * @InterfaceName TeachersMapper
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/11/19 20:30
 * @Version 1.0
 **/

public interface TeachersMapper {

    /**
     *查询所有的teacher
     *
     */
    List<Teachers> findTeacherAll();

    List<Teachers> findTeacherAndCourse();


}
