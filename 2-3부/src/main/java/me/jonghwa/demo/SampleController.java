package me.jonghwa.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // preHandle
    // 요청처리
    // postHandle
    // 뷰 랜더링
    // afterCompletion

//    @GetMapping("/hello/{name}")
////    public String hello(@PathVariable String name) {
////        return "hello " + name;
////    }


//    @GetMapping("/hello{name}")
//    public String hello(@PathVariable("name") Person person) {
//        return "hello " + person.getName();
//    }

    @GetMapping("/hello")
    public String hello(@RequestParam("name") Person person) {
        return "hello " + person.getName();
    }
}
