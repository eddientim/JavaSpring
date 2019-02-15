package io.java.springboot.topic;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    //Mutable arrayList new topics can be added.
    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","spring framework","spring framework description"),
            new Topic("java","java core","java description"),
            new Topic("javascript","javascript core","javascript description")));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream()
                .filter(topic -> topic.getId().equals(id))
                .findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}

