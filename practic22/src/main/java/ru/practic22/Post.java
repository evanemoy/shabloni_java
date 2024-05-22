package ru.practic22;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String date;
  private String text;
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @Override
  public String toString() {
    return "Post{" +
            "id=" + id +
            ", date=" + date +
            ", text=" + text +
            ", user=" + user +
            '}';
  }
}
