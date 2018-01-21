package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
        new Topic("spring", "Spring Framework", "Spring Framework description"),
        new Topic("java", "java description", "java language"),
        new Topic("javascript", "Javascript description", "javascript")
    );


    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
       return topics.stream() .filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
