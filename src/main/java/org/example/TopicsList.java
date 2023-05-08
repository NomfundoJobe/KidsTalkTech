package org.example;

import java.util.ArrayList;

public class TopicsList {
    private ArrayList<String> topics;

    public TopicsList() {
        topics = new ArrayList<String>();
    }

    public void addTopic(String topic) {
        topics.add(topic);
    }

    public String getTopic(int index) {
        if (index >= 0 && index < topics.size()) {
            return topics.get(index);
        }
        return null;
    }

    public int size() {
        return topics.size();
    }

}
