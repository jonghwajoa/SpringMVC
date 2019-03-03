package me.jonghwa.demojsp;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {
    private String name;
    private LocalDateTime start;



}
