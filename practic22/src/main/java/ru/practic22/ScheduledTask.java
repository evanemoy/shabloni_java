package ru.practic22;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
@EnableScheduling
@AllArgsConstructor
@Slf4j
public class ScheduledTask implements TaskMXBean {
  private final UserService userService;
  private final PostService postService;

  @PostConstruct
  private void init() throws Exception {
    MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
    ObjectName name = new ObjectName("ru.practic22:type=ScheduledTask");
    if (!mbs.isRegistered(name)) {
      mbs.registerMBean(this, name);
    } else {
      log.info("MBean with name {} is already registered.", name);
    }
  }


  @Scheduled(fixedRateString = "PT1M")
  public void remadeFiles() throws IOException {
    Files.walk(Path.of("C:/java9-16/practic22/src/main/resources/entities")).filter(Files::isRegularFile).forEach(p -> {
      try {
        log.info("deleting file in scheduled");
        Files.delete(p);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    });

    FileWriter usersFile = new FileWriter("C:/java9-16/practic22/src/main/resources/entities/users.txt");
    usersFile.write(userService.getUsers().toString());

    FileWriter postsFile = new FileWriter("C:/java9-16/practic22/src/main/resources/entities/posts.txt");
    postsFile.write(postService.getPosts().toString());
    log.info("written to files in scheduled");
    usersFile.close();
    postsFile.close();
  }

  @Override
  public void runRemadeFiles() throws IOException {
    remadeFiles();
  }
}
