package cn.ximcloud.springboot.springdemo.controller;

import cn.ximcloud.springboot.springdemo.repository.GirlRepository;
import cn.ximcloud.springboot.springdemo.domain.Girl;
import cn.ximcloud.springboot.springdemo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    //获取数据库的数据
    /*
     * 查询数据库列表
     * */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * 添加一个Girl
     *
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girladd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }

        //    <S extends T> S save(S var1);
        return girlRepository.save(girl);
    }

    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Optional<Girl> girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findById(id);
    }

    //更新
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdata(@PathVariable("id") Integer id, @PathVariable("cupSize") String cupSize, @PathVariable("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    //删除
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id) {
        girlRepository.deleteById(id);
    }

    //通过年龄来查询
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlFindByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girl/two")
    public void girlInsertTwo() {
        girlService.insertTwo();
    }

}
