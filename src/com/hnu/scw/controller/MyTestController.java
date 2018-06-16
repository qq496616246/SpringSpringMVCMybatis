package com.hnu.scw.controller;

import com.hnu.scw.pojo.Person;
import com.hnu.scw.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Author     ：scw
 * @ Date       ：Created in 下午 2:15 2018/6/15 0015
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
@Controller
public class MyTestController {

    @Autowired
    private PersonService personService;
    /**
     * 跳转到添加person页面
     * @return
     */
    @RequestMapping(value = "toaddperson")
    public String testMyFirst(){
        return "person_add";
    }

    /**
     * 添加person处理
     * @param person
     * @return
     */
    @RequestMapping(value = "addperson")
    public String addPerson(Person person){
        personService.addPerson(person);
        return "success";
    }
}
