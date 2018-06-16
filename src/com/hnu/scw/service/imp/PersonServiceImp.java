package com.hnu.scw.service.imp;

import com.hnu.scw.mapper.PersonMapper;
import com.hnu.scw.pojo.Person;
import com.hnu.scw.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：scw
 * @ Date       ：Created in 下午 3:19 2018/6/15 0015
 * @ Description：person实体处理的service实现类
 * @ Modified By：
 * @Version: $version$
 */
@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public void addPerson(Person person) {
        personMapper.addPerson(person);
    }
}
