package me.jonghwa.demojsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


public class ServletInitializer extends SpringBootServletInitializer {

    @Override  // 톰캣이나 서버를 이용해서 배포할때는 이파일을 사용해서 만듬...
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoJspApplication.class);
    }

}
