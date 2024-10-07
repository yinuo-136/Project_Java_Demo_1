package com.ianhou136.controller;

import com.ianhou136.pojo.Emp;
import com.ianhou136.service.EmpService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmpController {

    @Resource(name = "empServiceA")
    private EmpService empService;

    @RequestMapping("/listEmp")
    public List<Emp> list() {
        System.out.println("hello ");
        return empService.listEmp();

    }


}