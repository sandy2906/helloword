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


import net.biancheng.www.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 *
 * @ConfigurationProperties：告诉 SpringBoot 将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能；
 */
@Controller
public class HelloController {

    @Autowired
    private Person person;
    @ResponseBody
    @RequestMapping("/hellow")
    public Person hello() {
        return person;
//        return "====Hello World!";
    }
    /*注意：
    只有在容器中的组件，才会拥有 SpringBoot 提供的强大功能。如果我们想要使用 @ConfigurationProperties 注解进行配置绑定，那么首先
    就要保证该对 JavaBean 对象在 IoC 容器中，所以需要用到 @Component 注解来添加组件到容器中。
    JavaBean 上使用了注解 @ConfigurationProperties(prefix = "person") ，它表示将这个 JavaBean 中的所有属性与配置文件中以“person”为前缀的配置进行绑定。
    */
}