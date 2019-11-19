package com.zhende.domain;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Teachers
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/11/19 20:23
 * @Version 1.0
 **/
@Data
public class Teachers {
    Integer id;

    String name;

    Integer cid;

    Course course;

    List<Students> students;
}
