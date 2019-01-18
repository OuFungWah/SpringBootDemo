package com.crazywah.contorller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/hi")
public class TestController {

//    class Student{
//        int age;
//        String name;
//        long id;
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String hi(){

        Calendar calendar = Calendar.getInstance();
        calendar.set(1997,0,19);
        long time = calendar.getTimeInMillis();

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        return "当前时间："+sdf.format(time);

        return "当前时间："+((time < System.currentTimeMillis())?"比目标时间小":"比目标时间大");
    }

}
