package me.jonghwa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "jonghwa haha" + helloService.getName();
    }

    @GetMapping("simple")
    @ResponseBody
    public String haha() {
        return "simple page";
    }

    @GetMapping("/sample")
    public String sample() {
        return "view/sample";
    }
}
