import com.zhende.domain.Course;
import com.zhende.mapper.CourseMapper;
import com.zhende.mapper.Studentmapper;
import com.zhende.mapper.TeachersMapper;
import com.zhende.service.CourseService;
import com.zhende.service.impl.CourseServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName Test
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/11/18 20:05
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/sqlMapConfig.xml", "classpath*:/applicationContext.xml" }  )

public class Test {

  @Autowired
    CourseMapper courseMapper;

  @Autowired
  TeachersMapper teachersMapper;

  @Autowired
  Studentmapper studentmapper;

  @org.junit.Test
    public void test(){
      System.out.println(courseMapper.findAllCourse());
  }

  @org.junit.Test
  public void test01(){
    System.out.println(teachersMapper.findTeacherAll());
  }

  @org.junit.Test
  public void test02(){
    System.out.println(teachersMapper.findTeacherAndCourse());
  }


  @org.junit.Test
  public void test03(){
    System.out.println(courseMapper.findAllTeacherInCourse());
  }

  @org.junit.Test
  public void test04(){
    System.out.println(studentmapper.findAllTeachersInStudent());
  }


    @org.junit.Test
    public void test05(){
        System.out.println(studentmapper.findAllTeachersInStudent());
    }

    //刘乾坤到此一游

}
