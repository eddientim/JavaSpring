package io.java.springboot.topic;

import org.junit.Assert;
import org.junit.Test;

public class TopicTests {

    @Test
    public void fooTest() {
        Topic topic1 = new Topic("1000","sue","girl");
        Assert.assertEquals("1000", topic1.getId());
        Assert.assertEquals("sue", topic1.getName());
        Assert.assertEquals("girl", topic1.getDescription());

    }

}
