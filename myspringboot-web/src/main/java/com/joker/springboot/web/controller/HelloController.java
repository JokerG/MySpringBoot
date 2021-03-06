package com.joker.springboot.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.joker.springboot.rabbitmq.service.AmqpSender;

/**
 * 等于 @Controller @ResponseBody的混合体，可以这样理解）
 * Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，
 * 如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，默认返回json格式。
 *
 * @author guoxp
 */
@RestController
public class HelloController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Value("${com.hello.message}")
    private String message;
    @Autowired
    private AmqpSender amqpSender;

    @RequestMapping("hello")
    public String hello() {
        return message;
    }

    @RequestMapping("/hello1")
    public ModelAndView userList() {
        return new ModelAndView("hello");
    }

    @RequestMapping("/hello2")
    public ModelAndView hello2(HttpServletRequest request, @ModelAttribute("author") String author) {
        logger.info("=====================hello2, author :{}", author);
        throw new RuntimeException();
    }

    @GetMapping("/send")
    public String sendMq()
    {
        amqpSender.hello();
        return "success";
    }
}
