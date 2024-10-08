package com.ianhou136.dao.impl;

import com.ianhou136.dao.EmpDao;
import com.ianhou136.pojo.Emp;
import com.ianhou136.utils.XmlParserUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();

        return XmlParserUtils.parse(file, Emp.class);
    }
}
