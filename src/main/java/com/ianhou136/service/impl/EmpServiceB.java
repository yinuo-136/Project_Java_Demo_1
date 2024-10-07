package com.ianhou136.service.impl;


import com.ianhou136.dao.EmpDao;
import com.ianhou136.dao.impl.EmpDaoA;
import com.ianhou136.pojo.Emp;
import com.ianhou136.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpServiceB implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();
        empList.forEach(emp -> {
            String gender = emp.getGender();
            if("1".equals(gender)) {
                emp.setGender("male WW");
            } else if("2".equals(gender)) {
                emp.setGender("female WW");
            }

            String job = emp.getJob();
            if("1".equals(job)) {
                emp.setJob("lecturer");
            } else if("2".equals(job)) {
                emp.setJob("student");
            } else {
                emp.setJob("fucker");
            }
        });

        return empList;
    }
}
