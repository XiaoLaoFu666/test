package com.dcone.api.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dcone.common.entiy.Person;
import com.dcone.common.impl.PerServiceImpl;
import com.dcone.common.mapper.PersonMapper;
import com.dcone.common.service.PersonService;
import com.dcone.sdk.req.PersonResDto;
import com.dcone.sdk.resp.PersonRespDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Author: HuangJunHao
 * @Date: 2020/7/9 23:08
 */
@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private PerServiceImpl personService;

    @Resource
    private PersonMapper personMapper;

    @RequestMapping("/test")
    @ResponseBody
    public String init(){
        return "hello";
    }



    @RequestMapping("/getName")
    @ResponseBody
    public String getNameByItCode(){
        QueryWrapper<Person> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Person::getItcode,"hhhh");
        Person person = personMapper.selectOne(queryWrapper);
        return person.toString() ;
    }



}
