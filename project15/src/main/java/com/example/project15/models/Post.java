package com.example.project15.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "posts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
//    @SequenceGenerator(name = "post_seq", sequenceName = "post_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "text")
    private String text;
    @Column(name = "date")
    private String date;


    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Post> posts;
    public Post(String text, String date) {
        this.text = text;
        this.date = date;
    }


}