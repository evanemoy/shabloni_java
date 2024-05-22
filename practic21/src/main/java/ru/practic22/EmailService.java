package ru.practic22;

import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
@Service
@AllArgsConstructor
public class EmailService {
  private final JavaMailSender javaMailSender;
  @Async
  public void saveUser(User user) {
    SimpleMailMessage mailMessage = new SimpleMailMessage();
    mailMessage.setFrom("evanemojkina@gmail.com\n");
    mailMessage.setTo("nemoykina00@inbox.ru");
    mailMessage.setSubject("Message from spring");
    mailMessage.setText(user.toString());
    javaMailSender.send(mailMessage);
  }
  @Async
  public void savePost(Post post) {
    SimpleMailMessage mailMessage = new SimpleMailMessage();
    mailMessage.setFrom("evanemojkina@gmail.com\n");
    mailMessage.setTo("nemoykina00@inbox.ru");
    mailMessage.setSubject("Message from spring");
    mailMessage.setText(post.toString());
    javaMailSender.send(mailMessage);
  }
}

