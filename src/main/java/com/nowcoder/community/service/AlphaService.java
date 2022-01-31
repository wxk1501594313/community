package com.newcoder.community.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")
public class AlphaService {

    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }

    public AlphaService(){
        System.out.println("实例化");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁");
    }
}
