package cn.ximcloud.springboot.springdemo.service;

import cn.ximcloud.springboot.springdemo.domain.Girl;
import cn.ximcloud.springboot.springdemo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
