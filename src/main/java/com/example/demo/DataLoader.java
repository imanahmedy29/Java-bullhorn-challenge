/**package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements CommandLineRunner {
    @Autowired
    MessageRepository repository;

    @Override
    public void run(String... string) throws Exception{
        Message message;
        message = new Message("This is an application that is kind of like twitter. It will allow you to post a message, and everyone else to see all the messages that have been posted. You can upload an image, edit, and delete your messages as well.", 08-30-2019, "Iman Ahmed", "Application Description");
        repository.save(message);

    }

}
**/