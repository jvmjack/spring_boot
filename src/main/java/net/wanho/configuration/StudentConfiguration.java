package net.wanho.configuration;


import net.wanho.pojo.Score;
import net.wanho.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*可以作为spring容器的来源*/
@Configuration
public class StudentConfiguration {
    @Bean
    public Student student(){
        Student student = new Student();
        student.setId(1);
        student.setName("zhangsan ");
        student.setAge(18);
        student.setScore(score());
        return student;
    }

    @Bean
    public Score score(){
        Score score = new Score();
        score.setId(1);
        score.setNumber(99);
        return score;
    }







}
