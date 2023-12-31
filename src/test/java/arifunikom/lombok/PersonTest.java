package arifunikom.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

    @Test
    void createViaConstructor(){

        var hobbies = new ArrayList<String>();
        hobbies.add("futsal");
        hobbies.add("martial");
        hobbies.add("surfing");

        var person = new Person("id","name",18, hobbies);
    }

    @Test
    void createViaSetter() {

        var hobbies = new ArrayList<String>();
        hobbies.add("futsal");
        hobbies.add("martial");
        hobbies.add("surfing");

        var person = new Person();
        person.setId("id");
        person.setName("name");
        person.setAge(18);

    }

    @Test
    void createViaBuilder(){

        var hobbies = new ArrayList<String>();
        hobbies.add("futsal");
        hobbies.add("martial");
        hobbies.add("surfing");

        var person = Person.builder()
                .id("id")
                .name("name")
                .age(18)
                .hobbies(hobbies)
                .build();


    }

    @Test
    void createViaSingular(){

        var person = Person.builder()
                .id("id")
                .name("name")
                .age(18)
                .hobby("futsal")
                .hobby("martial")
                .hobby("surfing")
                .build();

        System.out.println(person);
    }



}
