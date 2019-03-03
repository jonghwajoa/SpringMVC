package me.jonghwa.demo;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;


@Component
public class PersonFormatter implements Formatter<Person> {

    @Override /* 문자열을 읽어서 Person을 만들어서 반환해주는것...*/
    public Person parse(String text, Locale locale) throws ParseException {
        Person person = new Person();
        person.setName(text);
        return person;
    }

    @Override
    public String print(Person object, Locale locale) {
        return object.toString();
    }
}
