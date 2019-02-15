package io.java.springboot.topic;

import java.util.List;

public interface TopicService {
    List<Topic> getAllTopics();

    Topic getTopic(String id);

    void addTopic(Topic topic);
}
