package com.hnu.scw.service;

import com.hnu.scw.pojo.Person;

/**
 * @ Author     ：scw
 * @ Date       ：Created in 下午 3:17 2018/6/15 0015
 * @ Description：person服务
 * @ Modified By：
 * @Version: $version$
 */
public interface PersonService {
    /**
     * 添加一个person实体
     * @param person
     */
    void addPerson(Person person);
}
