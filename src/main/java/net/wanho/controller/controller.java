package net.wanho.controller;

import net.wanho.pojo.PersonProperties;
import net.wanho.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @Autowired
    private Student student;

    @Value("${pageSize}")
    private Integer pageSize;

    @Autowired
    private PersonProperties personProperties;



    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello springBoot";
    }

    @RequestMapping("showStu")
    @ResponseBody
    public Student showStu(){
        return student;
    }

    @RequestMapping("showPageSize")
    @ResponseBody
    public Integer showPageSize(){
        return pageSize;
    }

    @RequestMapping("showPersonProperties")
    @ResponseBody
    public PersonProperties showPersonProperties(){
        return personProperties;
    }


    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }
}
