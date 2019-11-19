package com.zhende.domain;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Course
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/11/18 19:26
 * @Version 1.0
 **/
@Data
public class Course {

   private Integer id;

  private   String name;

  private   List<Teachers>  teachersList;

}
