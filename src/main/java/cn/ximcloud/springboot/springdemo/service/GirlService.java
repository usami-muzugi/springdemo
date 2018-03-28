package cn.ximcloud.springboot.springdemo.service;

import cn.ximcloud.springboot.springdemo.domain.Girl;
import cn.ximcloud.springboot.springdemo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        Girl girlB = new Girl();

        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        girlB.setAge(19);
        girlB.setCupSize("GGGGGG");
        girlRepository.save(girlB);
    }
    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findById(id).get();
        Integer age = girl.getAge();
        if (age < 10) {
            throw new Exception("还在上小学吧！");
        } else if (age > 10 && age < 16) {
            throw new Exception("还在上中学吧！");
        }
    }

    public Girl findOneGril(Integer id) {
        return girlRepository.findById(id).get();
    }
}
