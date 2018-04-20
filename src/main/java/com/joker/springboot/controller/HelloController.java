package com.joker.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 等于 @Controller @ResponseBody的混合体，可以这样理解）
 * Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，
 * 如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，默认返回json格式。
 *
 * @author guoxp
 */
@RestController
public class HelloController extends BaseController {
    @Value("${com.hello.message}")
    private String message;

    @RequestMapping("hello")
    public String hello() {
        return message;
    }

    @RequestMapping("/hello1")
    public ModelAndView userList() {
        return new ModelAndView("hello");
    }

    @RequestMapping("/hello2")
    public ModelAndView hello2() {
        throw new RuntimeException();
    }

}
