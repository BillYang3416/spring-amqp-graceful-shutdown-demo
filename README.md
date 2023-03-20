# spring-amqp-graceful-shutdown-demo

## Reproducing the bug
- create "myQueue" queue in RabbitMQ queues
- publish 3 messages to "myQueue" in RabbitMQ
- start application to consuming message
- click the shutdown button of IDE
- observe the log
