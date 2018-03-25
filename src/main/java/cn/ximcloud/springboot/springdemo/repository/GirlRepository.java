package cn.ximcloud.springboot.springdemo.repository;

import cn.ximcloud.springboot.springdemo.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {
    //通过年龄来查询
    List<Girl> findByAge(Integer age);

}

