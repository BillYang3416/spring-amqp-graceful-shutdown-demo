package com.example.springamqpdemo;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RabbitMQListener {

    @RabbitListener(id = "myQueue", queues = "myQueue",containerFactory = "consumerFactory")
    public void receiveOne(String messageContent, Message message, Channel channel) throws InterruptedException, IOException {
        System.out.println("Enter listener method");
        Thread.sleep(15000L);
        System.out.println("Received Message on queue one: " + messageContent);
        channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
    }

}