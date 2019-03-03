package me.jonghwa.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
//@WebMvcTest
@SpringBootTest
@AutoConfigureMockMvc
public class SampleControllerTest {

    @Autowired
    private SampleController controller;

    @Autowired
    MockMvc mockMvc;

   /* @Test
    public void hello() throws Exception {
        assertThat(controller).isNotNull();
        mockMvc.perform(get("/hello/jonghwa"))
                    .andExpect(content().string("hello jonghwa"))
                    .andDo(print());
    }*/

    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/hello").param("name","jonghwa"))
                .andExpect(content().string("hello jonghwa"))
                .andDo(print());
    }
}