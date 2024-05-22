package com.example.project14;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    private ArrayList<User> users = new ArrayList<>(){{
        add(new User("Алена", "Смирнова", "Олеговна"));
        add(new User("Флоринская", "Мария", "Алексеевна"));
        add(new User("Алина", "Зубеева", "Сергеевна"));
        add(new User("Анна", "Тягина", "Владиморовна"));
        add(new User("Сабина", "Желобова", "Дмитреевна"));
    }};

    @PostMapping("/users")
    public void addStudent(@RequestBody User student) {
        users.add(student);
    }
    @RequestMapping("/users")
    public ArrayList<User> getStudents() {
        return users;
    }
    @DeleteMapping("/users/{id}")
    public void deleteStudent(@PathVariable int id) {
        users.removeIf(st -> st.getId() == id);
    }
}