package com.dcone.common.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dcone.common.entiy.Person;
import com.dcone.common.mapper.PersonMapper;
import com.dcone.common.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * @Author: HuangJunHao
 * @Date: 2020/7/9 23:06
 */
@Service
public class PerServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {
}
