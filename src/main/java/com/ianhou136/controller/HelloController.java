package com.ianhou136.controller;

import com.ianhou136.pojo.Emp;
import com.ianhou136.pojo.User;
import com.ianhou136.service.EmpService;
import com.ianhou136.service.impl.EmpServiceA;
import com.ianhou136.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(String[] args){
        System.out.println("Hello World");
        // return hello world string
        return "Hello World";
    }

    @RequestMapping("/simpleParam")
    public String simpleParam(String name, Integer age1){
        return "OK" + name + age1;
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {

        return user.toString();
    }

    @RequestMapping("/pathParam/{id}/{name}")
    public String PathParam(Integer id, @PathVariable String name) {
        System.out.println(name);
        return id.toString() + " " + name;
    }

    @RequestMapping("/listEmp")
    public List<Emp> list() {
        EmpService serv = new EmpServiceA();


        return serv.listEmp();

    }


}
