package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.pojo.User"/>
@Component
public class User {

    //相当于<property name="name" value="jason" />
    @Value("jason")
    public String name;
}
