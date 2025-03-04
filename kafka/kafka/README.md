# Pragmatic Spring - Kafka

Commands to Up the Project

First up zookeeper server open Kafka in the path C:/Kafka as administrator and execute the next command
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

Next up kafka server open Kafka in the path C:/Kafka  and execute the next command
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

The next commands are importants to manage a topics and message see more in kafka docs
---

Command to list topics
```
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092 
```

Command to describe a topic
```
.\bin\windows\kafka-topics.bat --describe --topic {topic-name} --bootstrap-server {localhost:9092}
```

Command to create topics
```
.\bin\windows\kafka-topics.bat --create --topic {topic-name} --bootstrap-server {localhost:9092}
```

Command to Up a consumer
```
.\bin\windows\kafka-console-consumer.bat --topic {topic-name} --bootstrap-server {localhost:9092}
```

Command to Up a producer
```
.\bin\windows\kafka-console-producer.bat --broker-list {localhost:9092} --topic {topic-name}
```


