package com.zhende.domain;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Students
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/11/19 20:26
 * @Version 1.0
 **/
@Data
public class Students {

    Integer id;

    String name;

    Integer gender;

    List<Teachers> teachers;

}
