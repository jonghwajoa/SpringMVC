package me.jonghwa;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService() {
    }

    public String getName() {
        return "jonghwa";
    }
}
