package com.dcone.facade;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dcone.common.entiy.Person;
import com.dcone.common.service.PersonService;
import com.dcone.sdk.req.PersonResDto;
import com.dcone.sdk.resp.PersonRespDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: HuangJunHao
 * @Date: 2020/7/10 9:17
 */
@Component
@Service
public class PersonFacade {

    @Resource
    private PersonService personService;


    /**
     * 通过itCode查询
     * */
    public PersonRespDto getPersonNameByItCode(PersonResDto personResDto){
        QueryWrapper<Person> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(Person::getItcode,personResDto.getItCode());
        PersonRespDto personRespDto = new PersonRespDto();
        BeanUtils.copyProperties(personService.getOne(wrapper),personRespDto);
        return personRespDto;
    }


}
