import com.xzdr.AppStart;
import com.xzdr.pojo.Grade;
import com.xzdr.pojo.Student;
import com.xzdr.service.GradeService;
import com.xzdr.service.StudentService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppStart.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class Test {
    @Autowired
    private TestRestTemplate testRestTemplate;
    @Autowired
    private StudentService studentService;
    @Autowired
    private GradeService gradeService;

    @org.junit.Test
    public void baseTest(){
        /*Grade grade = new Grade();
        grade.setStudent_id("5aefce4e83d4eb2c504b440e");
        grade.setSubject("语文");
        grade.setGrade(79.5);
        gradeService.insert(grade);*/

        /*List<Grade> list = gradeService.getStudentGradeByName("李四");
        for(Grade grade : list){
            System.out.println(grade.toString());
        }*/

        Grade grade = gradeService.findOne("grade", 79.5, Grade.class);
        System.out.println(grade);
    }
}