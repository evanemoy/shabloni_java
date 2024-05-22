package prac8;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChanel implements Publisher{

    public List<String> videos = new ArrayList<>();
    public List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String text) {
        subscribers.forEach(subscriber -> subscriber.showNotification(text));
    }

    public void uploadVideo(String videoTitle) {
        videos.add(videoTitle);
        notifySubscriber(videoTitle);
    }
}
