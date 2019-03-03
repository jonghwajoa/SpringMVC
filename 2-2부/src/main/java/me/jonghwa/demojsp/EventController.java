package me.jonghwa.demojsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
public class EventController {

    @GetMapping("/event")
    public String getEvents(Model model) {
        Event event1 = new Event();
        Event event2 = new Event();

        event1.setName("수업1");
        event1.setStart(LocalDateTime.of(2019, 1, 5, 10, 19, 10));

        event2.setName("수업2");
        event2.setStart(LocalDateTime.of(2019, 2, 5, 10, 19, 10));

        List<Event> events = Arrays.asList(event1,event2);

        model.addAttribute("events",events);
        model.addAttribute("message","happy");
        return "events/list";
    }
}
