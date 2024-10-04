package com.ianhou136.controller;

import com.ianhou136.pojo.Emp;
import com.ianhou136.service.EmpService;
import com.ianhou136.service.impl.EmpServiceA;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmpController {

    private EmpService empService = new EmpServiceA();

    @RequestMapping("/listEmp")
    public List<Emp> list() {

        return empService.listEmp();

    }


}