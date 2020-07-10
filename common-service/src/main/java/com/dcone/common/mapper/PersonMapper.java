package com.dcone.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dcone.common.entiy.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @Author: HuangJunHao
 * @Date: 2020/7/9 23:00
 */
@Service
@Mapper
public interface PersonMapper extends BaseMapper<Person> {
}
