package org.politics.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void user_instance_test() {
        User user = new User().self();
        System.out.println(user);
    }
}