package net.biancheng.www.controller;


//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class HelloController {
//    @ResponseBody
//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello word!";
//    }
//}


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hellow")
    public String hello() {
        return "====Hello World!";
    }
}