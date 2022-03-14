package com.example.control;

import com.example.entry.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MainController {
//    直接给数据源头赋值
    @Value("魏振华")
//    写入数据源
    @Resource
    String name;



//    requesMapping测试地址：index，
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "你好，欢迎访问"+name;//这里的name是用来测试数据注入是否成功
    }


    //    requesMapping测试地址：index，
    @RequestMapping("/login")
    @ResponseBody
    public String index2(){
        return "你好，欢迎访问"+name;//这里的name是用来测试数据注入是否成功
    }





}
